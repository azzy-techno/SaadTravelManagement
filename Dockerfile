# Use Tomcat base image with JDK 17
FROM tomcat:9.0-jdk17

# Remove default webapps (like examples, docs)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file into Tomcat's webapps directory
COPY TourismManagementSystem/TourismManagementSystem.war /usr/local/tomcat/webapps/ROOT.war

# Expose default Tomcat port
EXPOSE 8080

# Run Tomcat when container starts
CMD ["catalina.sh", "run"]
