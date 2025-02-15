package javafundamentals;
import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter The Year: ");
        int year = sc.nextInt();
        
        if (year%4==0){
            System.out.println(year + " is leap year");
        }
        else {
           System.out.println(year + " is not leap year"); 
        }
        
}    
}
