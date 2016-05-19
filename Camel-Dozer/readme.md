*Dozer Example*
============

Links used
==========

1] http://www.freeformatter.com/xsd-generator.html
2] http://www.utilities-online.info/xmltojson/#.Vz1WhSArK60
3] http://jsonschema.net/#/
4] http://www.rubix.nl/blogs/jboss-fuse-62-%E2%80%93-first-look-data-transformation-mapper


Steps
=====

There are two parts to this project 

drwxr-xr-x. 2 hnaram hnaram 4096 May 19 18:35 AdditionalFiles
drwxr-xr-x. 5 hnaram hnaram 4096 May 19 18:27 Completed
drwxr-xr-x. 3 hnaram hnaram 4096 May 19 18:31 Core-Camel-Project


1. Core-Camel-Project is a camel project which just takes a file from one dir and places in another

we need to convert this project to Dozer Testcase so that the input xml can be converted to Json.

2. So inside "AdditionalFiles" you would see 

-rw-r--r--. 1 hnaram hnaram 667 May 19 16:02 test-jsonxsd.json
-rw-r--r--. 1 hnaram hnaram 203 May 19 17:33 test.xml
-rw-r--r--. 1 hnaram hnaram 587 May 19 15:38 test.xsd


using link [1] I converted "test.xml" to "test.xsd"
Using [2] I converted to json
In copied this json and inserted in [3] and created Json schema "test-jsonxsd.json"

3. Open JBDS and import "Core-Camel-Project"

   Then create a new Fuse TransformationProject and select the starting project as "Core-Camel-Project"

   Remaining steps should be done as in link [4] 

4. Step 3 will comvert "Core-Camel-Project" to "Completed"

5. Open a terminal and run "mvn clean install"


   Then run "mvn camel:run"

6. Check the src/data/Output for the json file.
