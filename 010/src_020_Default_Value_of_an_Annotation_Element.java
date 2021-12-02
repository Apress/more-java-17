public @interface Version {
    int major();
    int minor() default 0; // Set zero as default value 
                           // for minor
}
