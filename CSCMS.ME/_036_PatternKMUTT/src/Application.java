import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int i, j, k;
        int numLine = numIn * 3 + 1;
        for (i = 1; i <= numLine ; i++){
            for (j = 1; j <= numLine ; j++){
                if (i == numIn + 1 && j <= numIn * 2 + 1){
                    System.out.print("*");
                }
                else if (j == numIn + 1 && i <= numIn * 2 + 1){
                    System.out.print("*");
                }
                else if (i == numIn * 2 + 1 && j > numIn + 1){
                    System.out.print("*");
                }
                else if (j == numIn * 2 + 1 && i > numIn + 1){
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}