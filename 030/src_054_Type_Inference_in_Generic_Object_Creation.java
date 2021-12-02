// Not allowed in Java code. Cannot declare a variable 
// of an intersection type.
Serializable & CharSequence var;
// Allowed in Java code
class Magic<T extends Serializable & CharSequence> {
    // More code goes here
}
