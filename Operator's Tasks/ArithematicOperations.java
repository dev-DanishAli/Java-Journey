package javafundamentals;

import java.util.Scanner;


public class ArithematicOperations {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter The First Number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter The Second Number: ");
    int num2 = sc.nextInt();
    
    System.out.println("Addition: " + (num1+num2));
    System.out.println("Subtraction: " + (num1-num2));
    System.out.println("Multiplication: " + (num1*num2));
    System.out.println("Division: " + num1/num2);
   
}
}
