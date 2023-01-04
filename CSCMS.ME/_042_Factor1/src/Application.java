import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int i = 1, j = 0, k = 0,total = 0;
        for (i = 1 ; i <= numIn ; i++){
            if (numIn%i == 0){
                total++;
            }
        }
        System.out.print(total);
    }
}