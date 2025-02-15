package javafundamentals;
import java.util.Scanner;

public class TemparatureConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. Celsius To Farenheit\n"
                + "2. Farenheit To Celsius"
                + "Enter Choice:"    );
        int choice = sc.nextInt();
        
        if (choice == 1){
            System.out.print("Enter The Temperature in Celsius: ");
            double temp = sc.nextDouble();
            
            double farenheit = (temp * 9/5) + 32;
            
            System.out.print("Temperature in Farenheit: " + farenheit);
        }
        else if (choice == 2){
            System.out.print("Enter The Temperature in Farenheit:");
            double temp = sc.nextDouble();
            
            double celsius = (temp - 32) * 5/9;
            
            System.out.print("Temperature in Celsius: " + celsius);
        }
        else {
            System.out.println("Invalid Choice!");
        }
        
    }    
}
