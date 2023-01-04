import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        System.out.print(numString(numIn));
    }

    public static String numString(int numIn) {
        String text = "";
        String textD = "";
        if (numIn == 0){
            return "";
        }
        else {
            for (int i = 0; i < numIn && numIn != 1; i++) {
                textD += numIn;
            }
            for (int i = 0; i < numIn; i++) {
                text += numIn;
            }
        }
        return textD + numString(numIn - 1) + text;
    }
}