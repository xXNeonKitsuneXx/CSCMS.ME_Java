import java.util.Scanner;
public class Application{
    public static String binary(int a) {
        while (a > 0){
            return binary(a/2) + (a % 2);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        String ans = binary(a);
        System.out.println(ans);
    }
}
