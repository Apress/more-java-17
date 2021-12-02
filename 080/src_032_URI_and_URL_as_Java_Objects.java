// Create a URI object 
URI baseURI = new URI("http://www.yahoo.com"); 
// Create a URI with relative URI string and resolve it
// using baseURI 
URI relativeURI = new URI("welcome.html"); 
URI resolvedRelativeURI = baseURI.resolve(relativeURI); 
