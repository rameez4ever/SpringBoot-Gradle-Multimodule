# SpringBoot-Gradle-Multimodule
This repository will demo how to set up Spring Boot Microservice having multiple interdependent modules with Gradle Build.

Prerequisite: Java8, Gradle 5+

Follow below steps to start the service

1) $ git clone https://github.com/rameez4ever/springboot-demo.git
2) $ cd Springboot-Gradle-Multimodule
2) $ gradlew clean build
3) $ gradlew bootRun
4) This will launch microservice. You can use swagger doc to find documentation for all rest APIs:
	http://localhost:9096/multi-module/swagger-ui.html
	
***Updating configuration***
1) You can update server configuration and json file configuration @application-{profile}.yml file.
2) By default dev profile is active.