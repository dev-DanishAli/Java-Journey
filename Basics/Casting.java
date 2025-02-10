package javafundamentals;

public class Casting {

public static void main(String[] args) {
    // Implicit Casting
    int a = 10;
    double b = (double)a;
    
    System.out.println("Before Implicit Casting: "+ a);
    System.out.println("After Implicit Casting: "+ b);
    
    
    // Explicit Casting
    double c = 3.523;
    int d = (int)c;
    
    System.out.println("Before Explicit Casting: "+ c);
    System.out.println("After Explicit Casting: "+ d);
    
}
}
    

