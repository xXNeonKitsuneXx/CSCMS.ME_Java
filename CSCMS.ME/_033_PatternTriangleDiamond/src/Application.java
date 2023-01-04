import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int i,j,k;
        int numLine = numIn * 2 - 1;
        for (i = 1; i <= numLine ; i++) {
            for (j = numIn; j > i ; j--){
                System.out.print("-");
            }
            for (k = 1; k <= 2 * i - 1 && i <= numIn; k++){
                System.out.print("*");
            }
            for (j = numIn; j > i ; j--){
                System.out.print("-");
            }
            for (j = i; j > numIn ; j--){
                System.out.print("-");
            }
            for (k = numLine; k >= 2 * (i - numIn) + 1 && i > numIn; k--){
                System.out.print("*");
            }
            for (j = i; j > numIn ; j--){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}