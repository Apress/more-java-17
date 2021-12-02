// Using an anonymous class
StringToIntMapper mapper = new StringToIntMapper() {
    @Override
    public int map(String str) {
        return str.length();
    }
};
// Using a lambda expression
StringToIntMapper mapper = (String str) -> str.length();
