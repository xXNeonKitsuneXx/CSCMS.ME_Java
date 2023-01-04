import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String text = scr.next();
        String text3 = scr.next();
        String text2 = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        String text4 = text3.substring(0, 1).toUpperCase() + text3.substring(1).toLowerCase();
        System.out.print(text2 + " "+ text4);
    }
}
