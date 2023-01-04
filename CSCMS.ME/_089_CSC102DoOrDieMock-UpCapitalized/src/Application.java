import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        String textIn = scr.nextLine();
        String print = "";
        int i = 0;
        int a = 0;
        for (i = 0; i < textIn.length(); i++) {
            if (textIn.charAt(i) >= 65 && textIn.charAt(i) <= 90){
                a = textIn.charAt(i);
                System.out.print((char)a);
            }
        }

    }
}
