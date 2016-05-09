Hi,


--------------------------------------------------------------------------------------------------------------
├── pom.xml
├── readme.md
└── src
    └── main
        ├── java
        │   └── com
        │       └── redhat
        │           └── UserService.java
        └── resources
            └── META-INF
                └── spring
                    └── spring-context.xml



--------------------------------------------------------------------------------------------------------------

UserService.java: is our rest service.

spring-context.xml: Has the required configuration for hosting the webservice

To deploy this project at your end.

1. Unzip "rest-cxf-example.zip"

2. Run: mvn clean install

3. Start JBoss Fuse 6.2.0

4. Run the command: 
  
   JBossFuse:karaf@root> osgi:install -s mvn:com.redhat/cxf-jaxrs-service/6.2.0.redhat-133

5. To see the webervices on the server open a browser and hit the url: http://localhost:8181/cxf

   By default all the webservices are hosted in the context "cxf"

6. To hit our rest webservice we would need to go to url: http://localhost:8181/cxf/users/UserService/get_data
   
7. Using Soap-UI we can check the same under the Json tab


[1] https://access.redhat.com/solutions/1383773

Regards,
Herambh Naram.
JBoss Middleware Team.
Red Hat
