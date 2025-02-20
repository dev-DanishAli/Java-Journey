import java.util.Scanner;
class AddNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter The Secong Number: ");
        int num2 = sc.nextInt();

        int result = num1 + num2;

        System.out.println("Addition: "+ result);

    }
}