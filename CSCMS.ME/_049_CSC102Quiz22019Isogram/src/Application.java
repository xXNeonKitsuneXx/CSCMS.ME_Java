import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String text = scr.nextLine();
        String a = text.replace(" ", "").replace("-","");
        a = a.toLowerCase();
        int i, j;
        boolean x = true;
        for (i = 0; i < a.length(); i++) {
            for (j = 0; j < a.length();j++) {
                if (a.charAt(i) == a.charAt(j) && i != j) {
                    x = false;
                }
            }
        }
        if (x == false){
            System.out.println(text + " is not an isogram");
        }
        if (x == true){
            System.out.println(text + " is an isogram");
        }
    }
}
