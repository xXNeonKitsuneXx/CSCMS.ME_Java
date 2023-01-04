import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iron = sc.nextInt();
        int sword = 0;
        int shield = 0;
        int helmet = 0;

        while (iron > 2) {
            if (iron >= 10) {
                sword++;
                iron -= 10;
            }
            if (iron >= 8) {
                shield++;
                iron -= 8;
            }
            if (iron >= 3) {
                helmet++;
                iron -= 3;
            }
        }
        System.out.println(sword + " " + shield + " " + helmet + " " + iron);
    }
}