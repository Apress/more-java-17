// Using ArrayList as a raw type, not a generic type
List<String> list = new ArrayList(); // Generates an 
                                     // unchecked warning
warning: [unchecked] unchecked conversion
        List<String> list = new ArrayList();
                            ^
  required: List<String>
  found:    ArrayList
1 warning
