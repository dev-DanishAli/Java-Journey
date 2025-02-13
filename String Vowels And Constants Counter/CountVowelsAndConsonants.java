package javafundamentals;
import java.util.Scanner;

public class CountVowelsAndConsonants {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Any Sentence: ");
    String str = sc.nextLine();
    
    int numberOfVowels = 0;
    int numberOfConsonants = 0;
    
    for (int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || 
                ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            numberOfVowels++;
        }
        else{
            numberOfConsonants++;
        }
    }
    System.out.println("Number Of Vowels: " + numberOfVowels);
    System.out.println("Number Of Consonants: " + numberOfConsonants);
    
}    
}
