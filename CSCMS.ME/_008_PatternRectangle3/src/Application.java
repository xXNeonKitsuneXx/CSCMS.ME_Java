import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numin = scr.nextInt();
        System.out.print("-");
        for (int i = 2; i < numin; i++){
            System.out.print("*");
        }
        System.out.println("-");
        for (int i = 2; i < numin; i++){
            for (int si = 0; si < numin; si++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.print("-");
        for (int i = 2; i < numin; i++){
            System.out.print("*");
        }
        System.out.print("-");
    }
}