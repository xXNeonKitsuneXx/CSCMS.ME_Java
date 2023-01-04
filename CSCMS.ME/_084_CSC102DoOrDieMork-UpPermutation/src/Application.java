import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        String [] ans = new String[numIn];
        for (int i = 0; i < numIn; i++) {
            String text1 = scr.next();
            char [] text1C = text1.toCharArray();
            Arrays.sort(text1C);
            String text1CS = new String(text1C);

            String text2 = scr.next();
            char [] text2C = text2.toCharArray();
            Arrays.sort(text2C);
            String text2CS = new String(text2C);

            if (text1CS.equals(text2CS)){
                ans[i] = "Yes";
            }
            else {
                ans[i] = "No";
            }
        }
        for (int j = 0; j < numIn; j++) {
            System.out.println(ans[j]);
        }
    }
}
