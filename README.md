# xml-java-unedifact

A basic sample that shows how to use smooks to convert xml-java-unedifact.

This approach requires a slight modification of the smooks/unedifact bindingconfigs.

  1. Download and compile the smooks/unedifact project ( -> https://github.com/smooks/unedifact)
  2. Place the create_bindingconfigs.sh shell script ( -> mescedia/xml-java-unedifact/src/main/resources/create_bindingconfigs.sh ) 
	in the root of the smooks/unedifact source folder and run it. 
	This will create the  modified bindingconfigs in a subfolder ( unedifact/eancom-bindingconfig)
  3. Adjust the path settings in XmlJavaUNEdifactProcessor.java to the correct location of the new generated 'bindingconfigs' folder.
  4. And finally run this sample :

	$ mvn clean install && mvn exec:java

  5. Copy ORDERS.xml to the ./IN folder and watch the ./OUT folder.




