From openjdk:8
COPY target/*.jar app1.jar
CMD ["java", "-jar", "app1.jar"]
