import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String text = scr.nextLine();
        int i,j,k;
        if (text.length()%2 == 0){
//            System.out.println("even");
            for (i = text.length()/2; i > 0 ; i--){
                System.out.print(text.charAt(i-1));
            }
            for (i = text.length(); i > text.length()/2 ; i--){
                System.out.print(text.charAt(i-1));
            }
        }
        if (text.length()%2 != 0){
//            System.out.println("odd");
            for (i = text.length()/2; i > 0 ; i--){
                System.out.print(text.charAt(i-1));
            }
            System.out.print(text.charAt(text.length()/2));
            for (i = text.length(); i > text.length()/2+1; i--){
                System.out.print(text.charAt(i-1));
            }
        }
    }
}
