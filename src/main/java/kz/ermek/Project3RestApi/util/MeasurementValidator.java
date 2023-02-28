package kz.ermek.Project3RestApi.util;

import kz.ermek.Project3RestApi.models.Measurement;
import kz.ermek.Project3RestApi.repositories.MeasurementRepository;
import kz.ermek.Project3RestApi.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MeasurementValidator implements Validator {
    private final SensorService sensorService;


    @Autowired
    public MeasurementValidator(SensorService sensorService) {
        this.sensorService = sensorService;

    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Measurement.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Measurement measurement = (Measurement) target;

        if (measurement.getSensor() == null) {
            return;
        }
        if (sensorService.getSensorByName(measurement.getSensor().getName()).isEmpty()) {
            errors.rejectValue("sensor", "Sensor with this name doesn't exist!");
        }
    }
}
