import java.util.Scanner;
public class Application {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int numIn1 = scr.nextInt();
        int numIn2 = scr.nextInt();
        System.out.print(multi(numIn1,numIn2));
    }
    public static int multi(int a, int b){
        while (b > 1){
            return a + multi(a, b -1);
        }
        return a;
    }
}
