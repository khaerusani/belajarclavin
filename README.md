# Prerequisite
- Java 10.0.2 or above
- Maven
- Clavin Core

# Installation
- You can use my lucene index at [src/main/resources/IndexDirectory] or you can build yours. 
- Build Lucene index for Clavin, i got dataset from geonames [http://download.geonames.org/export/dump/ID.zip] and tutorial here [https://clavin.bericotechnologies.com/clavin-core/tutorials/installation.html]

# Build And Run
    $ git clone https://github.com/khaerusani/belajarclavin.git
    $ cd belajarclavin
    $ mvn package
    $ java -jar target/belajarclavin-0.0.1-SNAPSHOT-jar-with-dependencies.jar
