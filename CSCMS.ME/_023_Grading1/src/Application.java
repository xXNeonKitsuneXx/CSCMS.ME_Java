import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        if (numIn >= 90 && numIn <= 100){
            System.out.print("A");
        }
        else if (numIn >= 80 && numIn <= 89){
            System.out.print("B");
        }
        else if (numIn >= 60 && numIn <= 79){
            System.out.print("C");
        }
        else if (numIn >= 50 && numIn <=59){
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}
