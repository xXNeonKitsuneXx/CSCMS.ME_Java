import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        String textSet = scr.nextLine().toLowerCase(); //8 0-7
        char[] textSetC = textSet.toCharArray();
        char textIn = scr.next().charAt(0);
        int i;
        int totalA = 0;
        int totalB = 0;
        for(i = 0 ; i < textSet.length() ; i++){
            if (textSetC[i] == textIn){
                totalA++;
            }
        }
        if (totalA == 0){
            System.out.print("ERROR");
            return;
        }
        System.out.println(totalA);
        for(i = 0 ; i < textSet.length() ; i++){
            if (textSetC[i] == textIn){
                System.out.print(i);
                totalB++;
                if (i < textSet.length()-1){
                    if (totalA > totalB ) {
                        System.out.print(", ");
                    }
                }
            }
        }
    }
}