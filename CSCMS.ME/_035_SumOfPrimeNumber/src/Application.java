import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        int y = scr.nextInt();
        int start, stop, sum = 0 , prime;
        if (x < y){
            start = x;
            stop = y;
        }else{
            start = y;
            stop = x;
        }
        for (int i = start; i < stop; i++){
            prime = 1;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
            }
            if (prime == 1)
                sum += i;
        }
        System.out.println(sum);
    }
}