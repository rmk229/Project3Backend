# Project3Backend("Weather Sensor REST API")

The "Weather Sensor REST API" project is a server application developed using Spring Boot. The goal of the project is to receive data from a weather sensor that measures temperature and detects rain, and store this data in a database for further analysis.

# Functionality

- Accepts HTTP requests with data from the weather sensor in JSON format.
- Stores the received data in a database.
- Provides the ability to analyze the stored data by making requests to the API.

# Technologies

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL (as the database)

# Installation and Running

1. Make sure you have Java and PostgreSQL installed on your computer.
2. Clone the project repository to your computer.
3. Configure the connection to the PostgreSQL database in the `application.properties` file (URL, username, and password).
4. Run the application using an IDE or the command line.
5. The application will be available at `http://localhost:8080`.

## Usage

# Sending data from the weather sensor

Send a POST request to `http://localhost:8080/api/sensor-data` with the weather sensor data in JSON format. Example request body:

json
{
  "temperature": 25.5,
  "rain": true
}


# Retrieving stored data

You can make GET requests to the API to retrieve stored data. For example:

- Get all data: GET `http://localhost:8080/api/sensor-data`
- Get data by ID: GET `http://localhost:8080/api/sensor-data/{id}` (replace `{id}` with the actual ID)

# Contribution

You can contribute to the project by taking the following actions:

- Report a bug or suggest an improvement by creating an [issue](https://github.com/rmk229/Project3Backend/issues).
- Make changes to the code, fix a bug, or add new features and create a [pull request](https://github.com/rmk229/Project3Backend/pulls).

# Contact Information

If you have any questions or suggestions, please contact me:

- Author: Yermek
- Email: shmanovermek@gmail.com
