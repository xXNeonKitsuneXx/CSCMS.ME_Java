import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        long numin = scr.nextLong();
        long a = 0;
        for (int i = 1 ; i <= numin ; i++){
            a = a + i;
        }
        System.out.print(a);
    }
}
