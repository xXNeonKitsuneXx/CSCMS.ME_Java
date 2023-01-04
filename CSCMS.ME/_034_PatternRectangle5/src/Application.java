import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int i, j, k;
        for (i = 1; i <= numIn ; i++){
            for (j = 1; j <= numIn; j++){
                if (j == 1) {
                    System.out.print("*");
                }
                else if ( i == 1){
                    System.out.print("*");
                }
                else if ( j == numIn){
                    System.out.print("*");
                }
                else if ( i == numIn){
                    System.out.print("*");
                }
                else if ( i == j){
                    System.out.print("*");
                }
                else if ( numIn - j + 1 == i){
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