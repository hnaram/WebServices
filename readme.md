Link
====

http://www.mkyong.com/webservices/jax-rs/resteasy-hello-world-example/

Steps
======


1. We need to create a sample web using the archetype "maven-archetype-webapp". The groupId and DarchetypeArtifactId can be anything

====================================================================================================================================================================
[hnaram@hnaram WebServices]$ mvn archetype:generate -DgroupId=com.examples -DartifactId=RESTEasyExample -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
====================================================================================================================================================================


2. Once it is created it would not have the service and the web.xml entries required for it to be the webservice. Initially you would see in the "src" folder there is no java folder.


   Create a java folder and then keep our servlet(webservice) here. 

=====================================================================================
package com.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class RESTEasyExample {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}

}
   
=====================================================================================

3. Edit the web.xml as below


=====================================================================================

<web-app id="WebApp_ID" version="2.4"
	xmlns="http://java.sun.com/xml/ns/j2ee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
	http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
	<display-name>Restful Web Application</display-name>

	<!-- Auto scan REST service -->
	<context-param>
		<param-name>resteasy.scan</param-name>
		<param-value>true</param-value>
	</context-param>
	
	<!-- this need same with resteasy servlet url-pattern -->
	<context-param>
		<param-name>resteasy.servlet.mapping.prefix</param-name>
		<param-value>/rest</param-value>
	</context-param>

	<listener>
		<listener-class>
			org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap
		</listener-class>
	</listener>
	
	<servlet>
		<servlet-name>resteasy-servlet</servlet-name>
		<servlet-class>
			org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher
		</servlet-class>
	</servlet>
     
	<servlet-mapping>
		<servlet-name>resteasy-servlet</servlet-name>
		<url-pattern>/rest/*</url-pattern>
	</servlet-mapping>

</web-app>

=====================================================================================



4. Edit the pom.xml to add the depenmdencies for the jars. Make sure that the scope is provided so that the downloaded classes are not kept in the "lib" folder of the War.

   If the downloaded jars are inside lib, the deplyment on JBoss EAP 6 fails as it provides its own classes for the same.

=====================================================================================
          	<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-jaxrs</artifactId>
			<version>2.2.1.GA</version>
                        <scope>provided</scope>
		</dependency>

=====================================================================================

5. Done !!! now just run the mvn clean install and deplot the war from the target folder and hit the url: http://localhost:8080/RESTEasyExample/rest/message/hello
