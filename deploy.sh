/Users/anton/Downloads/glassfish5/bin/asadmin undeploy spittr;
mvn clean package;
/Users/anton/Downloads/glassfish5/bin/asadmin deploy target/spittr.war;
