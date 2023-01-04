import java.util.*;
public class Application{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int a = 0 , b = 1 , c;
        if (numIn ==1){
            System.out.println("0");
        }else if (numIn <= 20 && numIn >= 1){
            System.out.print(a + " " + b);
            for (int i = 2; i < numIn ; i++){
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
    }
}