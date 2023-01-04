import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        int numIn = scr.nextInt();
        int [] arr = new int[numIn];
        int i;
        int j;
        for (i = 0; i < numIn ; i++){
            arr[i] = scr.nextInt();
        }
        Arrays.sort(arr);
        if (numIn%2 == 0) {
            int [] arrA = new int[numIn/2];
            int [] arrB = new int[numIn/2];
            for (i = 0; i < numIn/2 ; i++){
                arrA[i] = arr[i];
                arrB[i] = arr[(numIn - 1) - i];
                System.out.print(arrB[i]);
                System.out.print(" ");
                System.out.print(arrA[i]);
                System.out.print(" ");
            }
        }
        if (numIn%2 != 0) {
            int [] arrA = new int[numIn/2];
            int [] arrB = new int[(numIn/2)+1];
            for (i = 0; i < numIn/2 ; i++){
                arrA[i] = arr[i];
            }
            for (i = 0; i <= numIn/2 ; i++){
                arrB[i] = arr[(numIn - 1) - i];
            }
            for (i = 0; i < numIn/2 ; i++){
                System.out.print(arrB[i]);
                System.out.print(" ");
                System.out.print(arrA[i]);
                System.out.print(" ");
            }
            System.out.print(arrB[numIn/2]);
        }
    }
}
