String source = "this is a test for 2.5% and &" ; 
String encoded = URLEncoder.encode(source, "utf-8"); 
String decoded = URLDecoder.decode(encoded, "utf-8"); 
System.out.println("Source: " + source); 
System.out.println("Encoded: " + encoded); 
System.out.println("Decoded: " + decoded); 
Source: this is a test for 2.5% and & 
Encoded: this+is+a+test+for+2.5%25+and+%26 
Decoded: this is a test for 2.5% and & 
