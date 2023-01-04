import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int numInP = scr.nextInt();
        int i = 1;
        int sum = 1;
        for (i = 1; i <= numInP ; i++){
            sum *= numIn;
        }
        System.out.print(sum);
    }
}
