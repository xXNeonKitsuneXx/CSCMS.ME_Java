import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        long numIn = scr.nextLong();
        long sum = 0;
        while (numIn > 0) {
            sum = sum + numIn % 10;
            numIn = numIn / 10;
        }
        System.out.println(sum);
    }
}
