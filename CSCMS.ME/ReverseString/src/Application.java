import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String text = scr.nextLine();
        String reverse = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        System.out.println(reverse);
    }
}
