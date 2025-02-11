package javafundamentals;
import java.util.Scanner;

public class MultiplicationTable {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number Of Which You Want Table: ");
    int num = sc.nextInt();
    
    for (int i=1; i<=10; i++){
        System.out.println(i + " x " + num + " = " + i*num);
    }

}    
}
