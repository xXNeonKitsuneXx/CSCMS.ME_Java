import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numin = scr.nextInt();
        for (int bi = 0;bi < numin;bi++){
            for (int i = 0;i < numin;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
