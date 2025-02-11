package fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter The Number Till You Want: ");
        int num = sc.nextInt();
        
        for (int i = 1; i<=num; i++){
            if (i%3==0){
                System.out.print("Fizz ");
            }
            else if (i%5==0){
                System.out.print("Bizz ");
            }
            else if (i%3==0 && i%5==020){
                System.out.print("FizzBuzz ");
            }
            else {
                System.out.print(i + " ");
            }
        }

    }
    
}
