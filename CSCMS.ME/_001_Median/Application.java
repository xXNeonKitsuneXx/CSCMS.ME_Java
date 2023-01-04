import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int A = scr.nextInt();
        int B = scr.nextInt();
        int C = scr.nextInt();
        if (A > B && B > C) {
            System.out.println(B);
        }
        else if (C > A && A > B) {
            System.out.println(A);
        }
        else if (B > C && C > A) {
            System.out.println(C);
        }
        else if (C > B && B > A) {
            System.out.println(B);
        }
        else if (A > C && C > B) {
            System.out.println(C);
        }
        else if (B > A && A > C) {
            System.out.println(A);
        }
    }
}