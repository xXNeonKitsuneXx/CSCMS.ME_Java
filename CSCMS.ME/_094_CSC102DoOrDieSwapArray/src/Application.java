import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        double [] numArr = new double [numIn];
        for (int i = 0; i < numIn; i++) {
            numArr[i] = scr.nextDouble();
        }
        Arrays.sort(numArr);
        double temp1 = 0;
        double temp2 = 0;
        for (int i = 0; i < numIn/2; i+=2) {
            temp1 = numArr[i];
            temp2 = numArr[numIn-1-i];
            numArr[i] = temp2;
            numArr[numIn-1-i] = temp1;
            temp1 = 0;
            temp2 = 0;
//            System.out.println(i + " " + (numIn-1-i));
        }

        for (int i = 0; i < numIn; i++) {
            System.out.printf("%.2f ",numArr[i]);
        }
    }
}
