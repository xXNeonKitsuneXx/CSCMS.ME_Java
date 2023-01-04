import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String b = scr.nextLine();
        if (a.length() > b.length()) {
            String am = a.replace(b, "");
            System.out.println(am);
        }
        if (b.length() > a.length()) {
            String bm = b.replace(a, "");
            System.out.println(bm);
        }
    }
}
