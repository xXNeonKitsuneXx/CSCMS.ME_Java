import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double numIn = scr.nextDouble();
        double numInR = Math.round(numIn);
        if (numInR % 7 == 0 || numInR % 10 == 7){
            System.out.print("Unlucky");
        }
        else {
            System.out.print("Lucky");
        }
    }
}
