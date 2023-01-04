import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numR = scr.nextInt();
        int numC = scr.nextInt();
        int[][] numArr = new int [numR][numC];
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                numArr[i][j] = scr.nextInt();
            }
        }
        System.out.println("Average of each row:");
        for (int i = 0; i < numR; i++) {
            double numRowSum = 0;
            for (int j = 0; j < numC; j++) {
                numRowSum += numArr[i][j];
            }
            numRowSum = numRowSum / numC;
            System.out.printf("%.2f ",numRowSum);
        }
        System.out.println();
        System.out.println("Average of each column:");
        for (int i = 0; i < numC; i++) {
            double numColSum = 0;
            for (int j = 0; j < numR; j++) {
                numColSum += numArr[j][i];
            }
            numColSum = numColSum / numR;
            System.out.printf("%.2f ",numColSum);
        }
    }
}
