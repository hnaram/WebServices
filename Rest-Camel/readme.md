links used:

http://www.mastertheintegration.com/camel/camel-and-web-services/exposing-rest-services-with-camel.html

http://www.rubix.nl/blogs/fabric-load-balancer-cxf-%E2%80%93-part-1

http://www.rubix.nl/blogs/fabric-load-balancer-cxf-%E2%80%93-part-2


Steps to implement

1. mvn clean install 

2. Start JBoss Fuse 6.2.0

3. Deploy the app:  osgi:install -s mvn:com.redhat/cxf-rs-camel/6.2.0.redhat-133

4. Hit the url: http://localhost:9001/rest/test/anyid

5. Check the fuse logs
