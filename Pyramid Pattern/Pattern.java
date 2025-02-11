package javafundamentals;
import java.util.Scanner;

public class Pattern {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Rows You Want: ");
    int row = sc.nextInt();
    
    for (int i = 0; i<=row; i++){
        for (int j = 0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }   
}    
}
