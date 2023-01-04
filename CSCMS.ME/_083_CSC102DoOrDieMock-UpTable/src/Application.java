import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int row = scr.nextInt();
        int column = scr.nextInt();
        int i,j,k = 0;
        for (i = 1 ; i <= column ; i++){
            System.out.print("*");
            System.out.print("_");
        }
        System.out.println("*");
        for (j = 1; j <= row ; j++) {
            for (k = 1 ; k<= column ; k++){
                System.out.print("|");
                System.out.print("_");
            }
            System.out.println("|");
        }
    }
}
