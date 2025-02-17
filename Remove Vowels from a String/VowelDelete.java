package javafundamentals;
import java.util.Scanner;

public class VowelDelete {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter Any Sentence: ");
    StringBuilder str = new StringBuilder(sc.nextLine());
    
    for (int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || 
                ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
           str.deleteCharAt(i);
        }
    }
    
    System.out.println("After Vowel Removal: " + str);
}    
}
