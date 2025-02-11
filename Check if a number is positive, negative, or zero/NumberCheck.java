package javafundamentals;
import java.util.Scanner;

public class NumberCheck {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any Number: ");
    int num = sc.nextInt();
    
    if (num>0){
        System.out.println("Number Is Positive");
    }
    else if (num<0){
        System.out.println("Number Is Negative");
    }
    else {
        System.out.println("Number Is Zero");
    }
    
}    
}
