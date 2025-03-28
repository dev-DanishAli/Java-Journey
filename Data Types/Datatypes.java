package javafundamentals;


public class Datatypes {

    public static void main(String[] args) {
        int a = 50;
        float pi = 3.41F;
        double liters = 3.66;
        char firstAlphabet = 'D';
        boolean isLoggedin = true;
        String name = "Danish Ali Kango";
        
        System.out.println("Number: " + a);
        System.out.println("Pi Vale: " + pi);
        System.out.println("Liters: " + liters);
        System.out.println("My name's First Alphabet: " + firstAlphabet);
        String Result = isLoggedin ? "Successful" : "Try Again";
        System.out.println(Result);
        System.out.println("My Name Is: "+ name);

}
}