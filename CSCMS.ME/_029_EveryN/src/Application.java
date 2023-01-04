import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        String textIn = scr.nextLine();
        char [] textInC = textIn.toCharArray();
        int numIn = scr.nextInt();
        int i;
        for (i = 0 ; i < textInC.length ; i++){
            if (i%numIn == 0){
                System.out.print(textInC[i]);
            }
        }
    }
}
