import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        int numIn = scr.nextInt();
        int [] numArr = new int [numIn];
        for (int i = 0; i < numIn; i++) {
            numArr[i] = scr.nextInt();
        }
        int sum = 0;
        int numInQ = scr.nextInt();
        for (int j = 0; j < numInQ; j++) {
            int numInQ1 = scr.nextInt();
            int numInQ2 = scr.nextInt();
            for (int k = numInQ1; k <= numInQ2; k++) {
                sum += numArr[k];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}