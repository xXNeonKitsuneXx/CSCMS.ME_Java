import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int day = scr.nextInt();
        int[] bucket = new int[numIn];
        int x, y;
        int[][] arr = new int[day][2];
        for (int i = 0; i < day; i++){
            for (int j = 0; j <= 1; j++){
                arr[i][j] = scr.nextInt();
            }
        }
        for (int i = 0; i < day; i++){
            for (int j = arr[i][0] - 1; j < arr[i][1]; j++){
                bucket[j]++;
            }
        }
        for (int i = 0; i < numIn; i++){
            System.out.print(bucket[i] + " ");
        }
    }
}