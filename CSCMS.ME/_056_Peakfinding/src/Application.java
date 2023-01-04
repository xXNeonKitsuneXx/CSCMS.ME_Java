import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int [] numArr = new int[numIn];
        for (int i = 0; i < numIn; i++) {
            numArr[i] = scr.nextInt();
        }
        Arrays.sort(numArr);

    }
}
