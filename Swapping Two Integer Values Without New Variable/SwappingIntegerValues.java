package javafundamentals;

public class SwappingIntegerValues {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Value of A before Swapping: " + a);
        System.out.println("Value of B before Swapping: " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Value of A after Swapping: " + a);
        System.out.println("Value of B after Swapping: " + b);
        
        
    }
}
