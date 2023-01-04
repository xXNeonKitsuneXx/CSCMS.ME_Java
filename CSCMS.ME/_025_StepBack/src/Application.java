import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn1 = scr.nextInt();
        int numIn2 = scr.nextInt();
        int a = 0;
        int i,j,k,l;
        if (numIn1 > numIn2){
            for (i = numIn1 ; i >= numIn2 ;i--){
                for (j = numIn1; j >= i ; j--){
                    System.out.print(j);
                    System.out.print(" ");
                }
            }
        }
        else if (numIn1 == numIn2){
            System.out.print(numIn1);
        }
        else if (numIn1 < numIn2){
            for (i = numIn2 ; i >= numIn1 ;i--){
                for (j = numIn2; j >= i ; j--){
                    System.out.print(j);
                    System.out.print(" ");
                }
            }
        }
    }
}
