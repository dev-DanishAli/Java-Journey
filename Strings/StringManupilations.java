package javafundamentals;
import java.util.Scanner;

public class StringManupilations {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enetr Any Sentence: ");
       String str1 = sc.next();
       
       System.out.println("Length: " + str1.length());
       System.out.println("Lower case: " + str1.toLowerCase());
       System.out.println("Upper Case: " + str1.toUpperCase());
       System.out.println("First Character: " + str1.charAt(0));
       System.out.println("Last Character: " + str1.charAt(5));
       
   } 
}
