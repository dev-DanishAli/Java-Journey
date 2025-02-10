package javafundamentals;

public class ArrayTranspose {

public static void main(String[] args) {
    int [][]array = {
                {0,1,2},
                {3,4,5},
                {6,7,8}};
        
    System.out.println("Before Transpose");
    for (int i=0; i<array.length; i++ ){
        for (int j =0; j<array.length; j++){
            System.out.print(array[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println("*************************************");
    System.out.println("After Transpose");
    for (int i=0; i<array.length; i++ ){
        for (int j =0; j<array.length; j++){
            System.out.print(array[j][i]+ " ");
        }
        System.out.println();
    }
}    
}
