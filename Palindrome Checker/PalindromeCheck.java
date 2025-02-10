package javafundamentals;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        StringBuilder str1 = new StringBuilder("Danish");
        StringBuilder str2 = str1.reverse();
        
        if (str1==str2){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}
