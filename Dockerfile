# On part d'une image Java 17 légère
FROM eclipse-temurin:17-jdk-jammy

# On crée un dossier de travail dans le conteneur
WORKDIR /app

# On copie le jar compilé dans le conteneur
COPY target/task-api-0.0.1-SNAPSHOT.jar app.jar

# On dit que l'application tourne sur le port 8085
EXPOSE 8085

# La commande pour lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]