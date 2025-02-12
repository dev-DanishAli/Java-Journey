package javafundamentals;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversed = 0;
        int sign = 1;

        if (number < 0) {
            sign = -1;
            number = -number;
        }

        while (number != 0) {
            int digit = number % 10;     
            reversed = reversed * 10 + digit; 
            number /= 10;                 
        }

        reversed *= sign;

        System.out.println("Original: " + number);
        System.out.println("Reversed: " + reversed);
    }
}

