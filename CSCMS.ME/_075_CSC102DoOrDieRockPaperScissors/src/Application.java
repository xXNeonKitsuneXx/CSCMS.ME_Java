import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        String p1 = scr.nextLine().toLowerCase();
        String p2 = scr.nextLine().toLowerCase();
        if (p1.equals(p2)){
            System.out.print("Draw");
            return;
        }
        else if (p1.equals("rock")){
            System.out.print(p2.equals("paper") ? "Dr.Worarat Krathu" : "Mr.Ukrit Ruckcharti");
            return;
        }
        else if (p1.equals("paper")){
            System.out.print(p2.equals("scissors") ? "Dr.Worarat Krathu" : "Mr.Ukrit Ruckcharti");
            return;
        }
        else if (p1.equals("scissors")){
            System.out.print(p2.equals("rock") ? "Dr.Worarat Krathu" : "Mr.Ukrit Ruckcharti");
            return;
        }
    }
}
