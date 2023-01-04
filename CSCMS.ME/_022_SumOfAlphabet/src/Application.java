import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String textIn = scr.nextLine().toLowerCase();
        int i;
        int result = 0;
        int a;
        for (i = 0; i < textIn.length(); i++) {
            if (textIn.charAt(i) >= 97 && textIn.charAt(i) <= 122) {
                a = textIn.charAt(i) - 96 - i;
                result += a;
            }
        }
        System.out.println(result);
    }
}
