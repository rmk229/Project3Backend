package kz.ermek.Project3RestApi.util;

import kz.ermek.Project3RestApi.dto.SensorDTO;
import kz.ermek.Project3RestApi.models.Sensor;
import kz.ermek.Project3RestApi.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SensorValidator implements Validator {
    private final SensorService sensorService;

    @Autowired
    public SensorValidator(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Sensor.class.equals(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        SensorDTO sensorDTO = (SensorDTO) target;
        if (sensorService.getSensorByName(sensorDTO.getName()).isPresent()) {
            errors.rejectValue("name","Sensor with this name already exist");
        }
    }
}
