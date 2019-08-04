# random-beer

The app is a simple beer service that manages the beers. It loads registers in an H2 in-memory database, and access them via JPA. 

What you’ll need

A favorite text editor or IDE

JDK 1.8 or later

Gradle 4+ or Maven 3.2+

You can also import the code straight into your IDE:

Spring Tool Suite (STS)

IntelliJ IDEA

If you are using Maven, you can run the application using ./mvnw spring-boot:run. Or you can build the JAR file with ./mvnw clean package. Then you can run the JAR file:


java -jar target/random-beer-0.0.1-SNAPSHOT.jar

http://localhost:8080/beers/random
