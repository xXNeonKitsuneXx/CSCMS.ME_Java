import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numA = scr.nextInt();
        int numB = scr.nextInt();
        int sum = 0;
        for (int i = numA; i <= numB; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
