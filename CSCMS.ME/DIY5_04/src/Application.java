import java.util.Scanner;
public class Application{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n * 2 - 1; i > 0 ; i--){
            for(int j = 0; j < n * 2 - 1; j++){
                if (i - n == j){
                    System.out.print("*");
                }
                else if (i == j + 1 && i > n - 1){
                    System.out.print("*");
                }
                else if (i == n * 2 - 1 & j > n - 1){
                    System.out.print("*");
                }
                else if (i == n & j < n - 1){
                    System.out.print("*");
                }
                else if (i == j - n + 2 && i < n){
                    System.out.print("*");
                }
                else if (i == 1 && j < n - 1){
                    System.out.print("*");
                }
                else if(j == 0 && i < n){
                    System.out.print("*");
                }
                else if(j == n - 1 && i < n){
                    System.out.print("*");
                }
                else if(j == n * 2 - 2 && i > n - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}