# sample-gdp-growth

## steps to run

build the application using maven. (without running)

``
mvn install -DskipTests
``

after building the project jar file, run the docker-compose.ymal file.

```
docker-compose up
```
ex- growth by alpha_2
```
curl --location --request GET 'http://localhost:8080/api/v01/gdpgrowth/LK'
```
ex- growth by alpha_3
```
curl --location --request GET 'http://localhost:8080/api/v01/gdpgrowth/LKA'
```
Swagger Out
![alt text](https://raw.githubusercontent.com/UmeshGunasekara/sample-gdp-growth2/main/Swagger_out.jpeg)