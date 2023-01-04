import java.util.*;

public class Application {
    public static int power(int a, int b) {
        int pow = a;
        if (b == 1)
            return pow;
        else if (b == 0)
            return 1;
        return pow * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = power(a, b);
        System.out.println(ans);
    }
}