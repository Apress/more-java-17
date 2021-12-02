public @interface Status {
    boolean approved() default false;
    String approvedBy();
}
