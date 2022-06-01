#### monitoredrx

#### Software Requirements
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
- [Postgresql 14](https://www.postgresql.org/download/)

####database configuration
Follow instruction in the resources/sqlfile.sql. Includes create database, configuring password, configuring schema and creation of the patient table for the application (query inside the sqlfile.sql)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.aeturnum.monitoredrx.MonitoredrxApplication` class from your IDE.

Build the project and you can execute the jar file in the target folder

`java -jar monitoredrx-0.0.1-SNAPSHOT.jar`