# Base image
FROM tomcat:9.0-jdk17

# Remove default Tomcat apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your web content into Tomcat ROOT
COPY src/main/webapp/ /usr/local/tomcat/webapps/ROOT/

# Expose default Tomcat port
EXPOSE 8080

# Run Tomcat
CMD ["catalina.sh", "run"]
