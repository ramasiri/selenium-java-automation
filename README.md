


# selenium-java-automation


Steps to run the automation scripts

git clone this project

Navigate to the project folder

To run the scripts in saucelabs

Edit the project.properties file and change browsername = chrome 

To run in your local change the browsername = local

To run the service tests from command prompt:

mvn install -s settings.xml -DsuiteXmlFile=src/test/ServiceTestng.xml

To run the UI tests from command prompt:

mvn install -s settings.xml -DsuiteXmlFile=src/test/UITestng.xml
