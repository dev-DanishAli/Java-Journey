package javafundamentals;
import java.util.Scanner;

public class CountDigits {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Any Number: ");
    int numInput = sc.nextInt();
    
    int num = numInput;
    int count = 0;
    
    while (num!=0){
        num/=10;
        count++;
    }
    
    System.out.println("Number: " + numInput + "\n");
    System.out.println("Digits in Number: "+count);
    
}    
}
