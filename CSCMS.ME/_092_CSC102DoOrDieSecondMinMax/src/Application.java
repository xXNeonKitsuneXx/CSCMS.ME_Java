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
        System.out.printf("%.2f %.2f ",numArr[1],numArr[numIn-2]);
    }
}
