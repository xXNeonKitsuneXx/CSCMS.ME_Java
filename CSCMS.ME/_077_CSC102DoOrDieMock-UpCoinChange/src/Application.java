import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c,d,e,f,g,h,i,j,k;
        c = (b - a);
        d = (b - a) % 1000;
        e = d % 500;
        f = e % 100;
        g = f % 50;
        h = g % 20;
        i = h % 10;
        j = i % 5;
        k = j % 2;
        if(a > b){
            System.out.println("Not enough money.");
        }
        else if(a == b){
            System.out.println("No change for you.");
        }
        else if(a < b){
            System.out.println("Change:" + " " + (b-a));
            System.out.println("1000THB:" + " " + (c/1000));
            System.out.println("500THB:" + " " + (d/500));
            System.out.println("100THB:" + " " + (e/100));
            System.out.println("50THB:" + " " + (f/50));
            System.out.println("20THB:" + " " + (g/20));
            System.out.println("10THB:" + " " + (h/10));
            System.out.println("5THB:" + " " + (i/5));
            System.out.println("2THB:" + " " + (j/2));
            System.out.println("1THB:" + " " + (k/1));
        }
    }
}
