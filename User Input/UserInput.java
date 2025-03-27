package javafundamentals;
import java.util.Scanner;

public class UserInput {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("What Is Your Name: ");
    String name = sc.nextLine();
    System.out.println("Enter Your Age: ");
    int age = sc.nextInt();
    System.out.println("Enter Your Height: ");
    double height = sc.nextDouble();
    
    System.out.println("Your Name: " + name);
    System.out.println("Your Age: " + age);
    System.out.println("Your Height: " + height);
}
}