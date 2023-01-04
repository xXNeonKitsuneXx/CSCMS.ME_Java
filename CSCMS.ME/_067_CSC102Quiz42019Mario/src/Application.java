import java.util.*;
public class Application{
    public static void main(String [] args){
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int c = 1;
        int total = 0;
        int i = 0,j = 0,k = 0;
        for (i = 1; i <= numIn ; i++) {
            if (i%15 == 0){
                c =  i * 10;
            }
            else if (i%5 == 0){
                c = i * 3;
            }
            else if (i%3 == 0){
                c = i * 2;
            }
            total += c;
            c = i;
            c++;
        }
        System.out.print(total);
    }
}