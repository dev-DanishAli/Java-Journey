package javafundamentals;

public class FibonnaciSeries {

public static void main(String[] args) {
    int first = 0, second = 1;
    int n = 10;
    
    System.out.println("First 10 Number Fibonacci Series");
    for (int i=0;i<n;i++){
        System.out.print(first + " ");
        int next = first + second;
        first = second;
        second = next;
    }
}    
}
