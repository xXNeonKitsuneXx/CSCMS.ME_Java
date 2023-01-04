import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int [] numArr = new int [numIn];
        for (int i = 0; i < numIn; i++) {
            numArr[i] = scr.nextInt();
        }
        int [] numArr2 = numArr.clone();
        Arrays.sort(numArr2);
        for (int i = 0; i < numIn; i++) {
            for (int j = 0; j < numIn; j++) {
                if (numArr[j] == numArr2[i]){
                    System.out.print((j+1) + " ");
                    numArr[j] = numArr2[numIn-1] + 1;
                }
            }
        }
    }
}
