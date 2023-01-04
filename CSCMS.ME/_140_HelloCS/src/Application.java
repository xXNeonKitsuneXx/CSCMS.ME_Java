import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        String [] text = new String [numIn];
        int i,j,k,l;
        for (i = 0 ; i < numIn ; i++){
            text[i] = scr.next();
        }
        for (i = 0 ; i < numIn ; i++){
            if (i % 2 == 0){
                for (j = 0; j < text[i].length() ; j++){
                    System.out.print(text[i].charAt(j));
                }
            }
            else {
                for (j = text[i].length() - 1 ; j >= 0 ; j--){
                    System.out.print(text[i].charAt(j));
                }
            }
            if (i != numIn - 1)
                System.out.print(" ");
        }
    }
}