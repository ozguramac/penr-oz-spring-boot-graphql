# GraphQL Spring Boot Example

### Reference Documentation
For further reference, please consider the following sections:

* [Gradle documentation](https://docs.gradle.org)
* [Docker Compose Overview](https://docs.docker.com/compose/overview/) 
* [GraphQL Overview](https://graphql.org/)
* [Spring Boot Overview](https://spring.io/projects/spring-boot)

### Build
```
$ ./gradlew build
```

### Run
```
$ docker-compose up
```

### Debug
[docker-compose.override.yml](https://docs.docker.com/compose/extends/)
```
version: '3'
services:
  penr-oz-springboot-graphql:
    entrypoint: java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
    ports:
      - "5005:5005"
```
then
```
$ docker-compose up
```
finally use your favorite IDE to put breakpoints and connect to debugger
e.g.
[Intellij Remote Java](https://www.jetbrains.com/help/idea/run-debug-configuration-remote-debug.html)
which requires a correct local [JDK](https://jdk.java.net/8/)
installed.

### Stop
```
$ docker-compose stop
```

### Clean
```
$ docker-compose down
```

### Check/Health
```
docker-compose ps
```