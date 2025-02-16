package javafundamentals;
import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Radius Of Circle: ");
        double radius = sc.nextDouble();
        
        float pi = 3.14f;
        double area = pi * (radius * radius);
        
        System.out.println("Area of Circle Is: " + area);
        
    }
}
