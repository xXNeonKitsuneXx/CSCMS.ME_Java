import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numrows = scr.nextInt();
        int numcolumns = scr.nextInt();
        for (int i = 0; i < numcolumns; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int ia = 2; ia < numrows; ia++) {
            System.out.print("*");
            for (int ib = 2; ib < numcolumns; ib++) {
                System.out.print("-");
            }
            System.out.println("*");
        }
        for (int ic = 0; ic < numcolumns; ic++) {
            System.out.print("*");
        }
        System.out.print("");
    }
}