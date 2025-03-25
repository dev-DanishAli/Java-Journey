package javafundamentals;

public class StringBuilderConcatination {
    
public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder("Hello ");
    
    System.out.println("Concatinated: " + s1.insert(6, "World"));
}    
}
