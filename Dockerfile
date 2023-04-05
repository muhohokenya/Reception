# Use an official OpenJDK runtime as a parent image
FROM --platform=linux/amd64/v8 openjdk:17-alpine


# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Set the environment variable for Spring profile
#ENV SPRING_PROFILES_ACTIVE=production

# Make port 8080 available to the world outside this container
EXPOSE 8081

# Run the command to build the application
#RUN ./gradlew build


# Start the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/build/libs/Reception-0.0.1-SNAPSHOT.jar"]
