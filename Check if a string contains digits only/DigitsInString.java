package javafundamentals;
import java.util.Scanner;

public class DigitsInString {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Any String: ");
    String str = sc.nextLine();
    
    int digits = 0;
    
    for (int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || 
                ch == '6' || ch == '7' || ch == '8' || ch == '9'){
            digits++;
        }
    }
    
    if (digits==str.length()){
        System.out.println("String contains digits only");
    }
    else if (digits>0){
        System.out.println("String have both digits and alphabets");
    }
    else {
        System.out.println("String does not have digits");
    }
}    
}
