package javafundamentals;
import java.util.Scanner;

public class RelationalOperators {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter The First Number: ");
    int num1 = sc.nextInt();
    
    System.out.println("Enter The Second Number: ");
    int num2 = sc.nextInt();
    
    if (num1>num2){
        System.out.println("First Number Is Greater Than Second");
    }
    else if (num1==num2){
        System.out.println("Both Are Equal");
    }
    else{
        System.out.println("First Number Is Less Than Second");
    }
}    
}
