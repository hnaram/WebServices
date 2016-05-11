Links used
----------

https://dzone.com/articles/exposing-and-consuming-soap

http://marcelojabali.blogspot.com.au/2011/07/calling-web-services-with-apache-camel.html

There are two parts to implement in this project

1. JBoss EAP

2. JBoss Fuse

JBoss EAP 
=========

Go to the directory "Soap-Jboss"

---------------------------------------
├── pom.xml
├── src
│   └── main
│       └── java
│           └── com
│               └── sample
│                   ├── Math.java
│                   └── MathWS.java
└── webapp
    ├── META-INF
    │   └── MANIFEST.MF
    └── WEB-INF
        ├── lib
        └── web.xml

9 directories, 5 files
---------------------------------------

Steps:
-----

1. Take JBoss EAP 6

2. Run mvn clean install and deploy the war from the target directory 

3. Open soap-ui and create a soap project.

4. Enter the wsdl url: http://localhost:8080/MySoapWebService-0.0.1-SNAPSHOT?wsdl

5. Open Soap-UI and copy the below content in a file called Message1.xml"
---------------------------------------------------------------------------------------------------------------------
	<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sam="http://sample.com/">
	   <soapenv:Header/>
	   <soapenv:Body>
	      <sam:sum>
		 <arg0>2</arg0>
		 <arg1>3</arg1>
	      </sam:sum>
	   </soapenv:Body>
	</soapenv:Envelope>
---------------------------------------------------------------------------------------------------------------------

6. Keep the file Message1.xml inside "Camel-SOAP/src/messages"


Fuse
====

Go to dir: Camel-SOAP

---------------------------------------
├── main
│   └── resources
│       ├── log4j.properties
│       ├── META-INF
│       │   └── spring
│       │       └── spring-context.xml
│       └── wsdl
│           └── math.wsdl
└── messages
---------------------------------------

'math.wsdl' is created by visiting the wsdl and the rightclick-->viewpagesource-->saveas-->math.wsdl 


1. To build this project use

    mvn install

2. You can run this project using he following Maven goal:

    mvn camel:run

3. To deploy the project in OSGi. For example using Apache ServiceMix or Apache Karaf. You will run the following command from its shell:

    osgi:install -s mvn:com.redhat/soap-Camel/1.0

