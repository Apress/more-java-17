unknownWrapper.set("Hello");        // A compile-time error
unknownWrapper.set(new Integer());  // A compile-time error
unknownWrapper.set(new Object());   // A compile-time error
unknownWrapper.set(null);           // OK
