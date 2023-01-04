import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        String [] textIn = new String [numIn];
        for (int i = 0; i < numIn ; i++) {
            textIn [i] = scr.next().toLowerCase();
        }
        String temp = "";
        for (int i = 0; i < numIn; i++) {
            for (int j = textIn[i].length()-1 ; j >= 0; j--) {
                temp += textIn[i].charAt(j);
                if (j == textIn[i].length()-1){
                    temp = temp.substring(0,1).toUpperCase();
                }
            }
            System.out.print(temp + " ");
            temp = "";
        }
    }
}
