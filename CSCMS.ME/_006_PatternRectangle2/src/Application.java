import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numcolumns = scr.nextInt();
        int numrows = scr.nextInt();
        for (int ia = 0; ia < numcolumns; ia++){
            for (int ib = 0; ib < numrows; ib++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}