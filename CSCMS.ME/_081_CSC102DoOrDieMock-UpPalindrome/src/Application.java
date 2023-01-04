import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String numIn = scr.nextLine().toLowerCase();
        int i = 0;
        String numC = "";

        if(numIn.length()%2 == 0){
            String numF = numIn.substring(0,numIn.length()/2).toLowerCase();
            String numB = numIn.substring(numIn.length()/2,numIn.length());
//            System.out.println(numF);
//            System.out.println(numB);
            for (i = numB.length() - 1; i >= 0 ; i--){
                numC += numB.charAt(i);
            }
//            System.out.println(numC);
            if (numF.equals(numC)){
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }
        }
        else if(numIn.length()%2 != 0){
            String numF = numIn.substring(0,numIn.length()/2).toLowerCase();
            String numB = numIn.substring(numIn.length()/2+1,numIn.length());
//            System.out.println(numF);
//            System.out.println(numB);
            for (i = numB.length() - 1; i >= 0 ; i--){
                numC += numB.charAt(i);
            }
//            System.out.println(numC);
            if (numF.equals(numC)){
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }
        }

    }
}
