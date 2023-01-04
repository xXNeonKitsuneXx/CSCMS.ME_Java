import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numin = scr.nextInt();
        int i,j;
        for (i = numin; i > 0 ; i--){
            for (j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
