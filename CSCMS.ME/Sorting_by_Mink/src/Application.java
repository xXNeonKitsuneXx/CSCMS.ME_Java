import java.util.Scanner;
import java.util.Arrays;
class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int temp;
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < size/2; i++){
            temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        int n = 0;
        int i = 0;
        int j = size - 1;
        while (n < size){
            if (n % 2 == 0){
                System.out.print(arr[i]);
                i++;
            }
            else{
                System.out.print(arr[j]);
                j--;
            }
            System.out.print(" ");
            n++;
        }
    }
}