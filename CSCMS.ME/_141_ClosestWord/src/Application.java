import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String textCheckIn = scr.nextLine();
        int numIn = scr.nextInt();
        String textIn [] = new String [numIn];
        int i,j,k,l;
        for (i = 0 ; i < numIn ; i++){
            textIn[i] = scr.next();
        }
        String cloneText [] = textIn.clone();
        for (i = 0; i < numIn; i++) {
            textIn[i] = textIn[i].toLowerCase();
        }
        System.out.print(Arrays.toString(textIn));
    }
}
