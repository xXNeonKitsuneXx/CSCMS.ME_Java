import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numin = scr.nextInt();
        int fact = 0;
        for (int i = 1; i <= numin; i++){
            System.out.print(i);
            System.out.println(fact);
        }
    }
}
