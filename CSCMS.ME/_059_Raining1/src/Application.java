import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int day = scr.nextInt();
        int[] bucket = new int[numIn];
        int x, y;
        for (int i = 0; i < day; i++){
            x = scr.nextInt();
            y = scr.nextInt();
            for (int j = x - 1; j < y; j++){
                bucket[j]++;
            }
        }
        for (int i = 0; i < numIn; i++){
            System.out.print(bucket[i] + " ");
        }
    }
}
