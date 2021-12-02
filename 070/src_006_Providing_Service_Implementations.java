module com.jdojo.provider { 
    provides com.jdojo.PrimeChecker with 
        com.jdojo.impl.PrimeCheckerFactory; 
    provides com.jdojo.CsvParser with 
        com.jdojo.impl.CsvFastParser; 
    // Other module statements go here 
} 
