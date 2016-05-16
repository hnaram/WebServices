Links used
==========


http://camel.apache.org/jsonpath.html

http://goessner.net/articles/JsonPath/index.html#e2

http://www.baeldung.com/guide-to-jayway-jsonpath

Steps
====


1. mvn clean install 

2. mvn camel:run


This TestCase contains a json files inside the "/src/data" and "/src/data2"

<code>
├── pom.xml
├── readme.md
└── src
    ├── data
    │   ├── test2.json
    │   ├── test3.json
    │   ├── test4.json
    │   └── test.json
    ├── data2
    │   ├── test2.json
    │   ├── test3.json
    │   ├── test4.json
    │   └── test.json
    └── main
        └── resources
            ├── log4j.properties
            └── META-INF
                └── spring
                    └── camel-context.xml

7 directories, 12 files
</code>



