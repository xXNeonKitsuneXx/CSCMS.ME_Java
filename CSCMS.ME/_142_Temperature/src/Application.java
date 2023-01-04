import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double a = scr.nextDouble();
        double b = scr.nextDouble();
        b = ((b*9)/5)+32;
        if (a > b){
            System.out.print("Higher");
        }
        if (b > a){
            System.out.print("Lower");
        }
        if (a == b){
            System.out.print("Same");
        }
    }
}
