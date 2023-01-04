import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numin = scr.nextInt();
        int numyears = numin/525600;
        int numfromminafteryears = numin%525600;
        int numdays = numfromminafteryears/1440;
        System.out.print(numyears + " " + numdays);
    }
}
