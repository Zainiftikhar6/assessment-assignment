
# Flight booking Schedule-api

####  User can register itself and booking number of seats in flight.

## Getting Started

Please follow the below steps to setup and run the project.

### Prerequisites

- This project requires Java 11 need to be installed.
- Install any Java IDE (Eclipse, STS, Intellij etc..) and ensure you are able to launch
-  Clone/Checkout the project from version control system (git) and follow below steps

```
$ cd project directory
$ mvn clean install 
$ mvn spring-boot:run -e
$ Open web browser & hit the swagger url: http://localhost:8080/swagger-ui.html
```
## Development Setup

- Clone project. (git clone <repo url>)
- Open eclipse and import this project under (Existing Maven project)

## Tech stack

- Java 11
- Spring Boot: 2.3.1.RELEASE
- [Lombok For Building POJO](https://projectlombok.org/)
- Mysql DB
- Swagger2 - For API Local Testing and for frontend team
- Spring Seurity JWT

## Testing API
- Open http://localhost:8080/student-course/swagger-ui.html
- Create token of existing user or admin.
- Use that token with any API further
- And test any APi using swagger interface.
- Dummy script also added for user and admin role.
## Developer(s)

*  Zain Iftikhar

## Acknowledgments

* [Enable Swagger UI api-docs](https://www.vojtechruzicka.com/documenting-spring-boot-rest-api-swagger-springfox/)
* [Spring Boot Rest API](https://spring.io/guides/gs/rest-service/)
