import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int train = scr.nextInt();
        int bomb = scr.nextInt();
        if (train < 3 || bomb == 2 && train == 3){
            System.out.print("DIE");
            return;
        }
        for (int i = 1;i <= train;i++){
            if (bomb != i && bomb-1 != i && bomb+1 != i){
                System.out.print(i+" ");
            }
        }
    }
}
