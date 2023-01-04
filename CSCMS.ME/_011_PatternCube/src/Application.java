//import java.util.Scanner;
//public class Application{
//    public static void main (String [] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = n * 2 - 1; i > 0 ; i--){
//            for(int j = 0; j < n * 2 - 1; j++){
//                if (i - n == j){
//                    System.out.print("*");
//                }
//                else if (i == j + 1 && i > n - 1){
//                    System.out.print("*");
//                }
//                else if (i == n * 2 - 1 & j > n - 1){
//                    System.out.print("*");
//                }
//                else if (i == n & j < n - 1){
//                    System.out.print("*");
//                }
//                else if (i == j - n + 2 && i < n){
//                    System.out.print("*");
//                }
//                else if (i == 1 && j < n - 1){
//                    System.out.print("*");
//                }
//                else if(j == 0 && i < n){
//                    System.out.print("*");
//                }
//                else if(j == n - 1 && i < n){
//                    System.out.print("*");
//                }
//                else if(j == n * 2 - 2 && i > n - 1){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print("-");
//                }
//            }
//            System.out.print("\n");
//        }
//    }
//}
////////// Code my Float in DIY /////////////////////////////////


import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for (int i = 1; i <= n * 2 - 1; i++){
            for (int j = 1; j <= n * 2 - 1; j++){
                if (j <= n - i){
                    System.out.print("-");
                }
                else if ((i == 1 && j <= n * 2 - 1) || (j == n * 2 - 1 && i <= n
                        || (i == n && j <= n) || (j == 1 && (i >= n && i <= n * 2 - 1)
                        || (j == n && (i >= n && i <= n * 2 - 1)) || (i == n * 2 - 1 && j <= n)))
                        || (i + j == n + 1 ) || ((i + j == n * 2) && (i <= n)) || (i + j == n * 3 - 1))
                {
                    System.out.print("*");
                }
                else if (!(( i + j >= n * 3 &&  i + j <= (n * 2 - 1) * 2))){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}