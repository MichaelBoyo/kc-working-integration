FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipTests

FROM openjdk:17
COPY --from=build web/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=8081","app.jar"]
EXPOSE 8081
