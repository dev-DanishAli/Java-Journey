package javafundamentals;
import java.util.Scanner;

public class DecimalToBinary {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);
        
        scanner.close();
    }
}


