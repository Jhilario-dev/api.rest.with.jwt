# Use the official OpenJDK base image
FROM openjdk:24

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/reto-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]