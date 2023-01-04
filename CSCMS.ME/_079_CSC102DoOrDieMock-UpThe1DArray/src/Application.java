import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int [] numArr = new int[numIn];
        int i = 0;
        for (i = 0; i < numIn; i++) {
            numArr[i] = scr.nextInt();
        }
        Arrays.sort(numArr);
        int [] numArrS = numArr.clone();
        int [] numArrA = numArr.clone();
        int [] numArrMax = numArr.clone();
        int [] numArrMin = numArr.clone();

        double sumS = 0.00;
        for (i = 0; i < numIn; i++) {
            sumS += numArrS[i];
        }
        System.out.printf("Summation: %.2f", sumS);
        System.out.println();

        double sumA = 0.00;
        sumA = sumS/numIn;
        System.out.printf("Average: %.2f", sumA);
        System.out.println();

        double sumMax = 0.00;
        sumMax = numArrMax[numIn-1];
        System.out.printf("Max: %.2f", sumMax);
        System.out.println();

        double sumMin = 0.00;
        sumMin = numArrMin[0];
        System.out.printf("Min: %.2f", sumMin);
        System.out.println();
    }
}
