# Use the official OpenJDK 17 image based on Alpine Linux for a smaller footprint
FROM openjdk:17-jdk-alpine

# Copy the compiled .jar file from your target directory into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app-1.0.0.jar 

# Define the entry point for the container when it is started
ENTRYPOINT [ "java","-jar","app-1.0.0.jar" ]
