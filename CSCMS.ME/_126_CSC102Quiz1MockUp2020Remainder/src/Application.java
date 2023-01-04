import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        long x = scr.nextLong();
        long y = scr.nextLong();
        long n = scr.nextLong();
        if ((n/x*x+y) < n){
            System.out.println(n/x*x+y);
        }
        else {
            System.out.println((n/x*x+y)-x);
        }
    }
}
