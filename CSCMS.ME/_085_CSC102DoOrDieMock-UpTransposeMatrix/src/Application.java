import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numR = scr.nextInt();
        int numC = scr.nextInt();
        int [][] arr = new int [numR][numC];
        int i,j = 0;

//        for (i = 0; i < numR; i++) {
//            for (j = 0; j < numC; j++) {
//                arr[i][j] = scr.nextInt();
//            }
//        }
//        "need to swop"
        for (i = 0; i < numC; i++) {
            for (j = 0; j < numR; j++) {
                arr[j][i] = scr.nextInt();
            }
        }

//        System.out.println(Arrays.deepToString(arr));

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}