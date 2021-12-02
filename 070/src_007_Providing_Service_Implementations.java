module com.jdojo.parser { 
    uses com.jdojo.XmlParser; 
    provides com.jdojo.XmlParser with 
        com.jdojo.xml.impl.XmlParserFactory; 
    // Other module statements go here 
} 
