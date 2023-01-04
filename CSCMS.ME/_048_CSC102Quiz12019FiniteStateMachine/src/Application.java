import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int onoff1 = scr.nextInt();
        int onoff2 = scr.nextInt();
        String switch1 = scr.next();
        String switch2 = scr.next();

        if (onoff1 == 0 && onoff2 == 0){
            if (switch1.equals("1") && switch2.equals("-"))
                System.out.println("MuR");
            else if (switch1.equals("-") && switch2.equals("1"))
                System.out.println("DnD");
            else
                System.out.println("NEUTRAL");
        }
        else if (onoff1 == 0 && onoff2 == 1){
            if (switch1.equals("1"))
                System.out.println("MuR");
            else if (switch2.equals("1"))
                System.out.println("NEUTRAL");
            else if (switch1.equals("-") && switch2.equals("-"))
                System.out.println("DnD");
        }
        else if ( (onoff1 == 1 && onoff2 == 0)){
            if (switch1.equals("1"))
                System.out.println("NEUTRAL");
            else if (switch2.equals("1"))
                System.out.println("DnD");
            else if (switch1.equals("-") && switch2.equals("-"))
                System.out.println("MuR");
        }
    }
}