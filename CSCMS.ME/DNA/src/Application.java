import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        a = a.replace('T','U');
        int result = 0;
        boolean x = false;
        for (int i = 0;i < a.length();i=i+3){
            String b = a.substring(i,i+3);
            if (b.equals("AUG")){
                x = true;
            }
            if (b.equals("UAG") || b.equals("UAA") || b.equals("UGA")){
                x = false;
            }
            if (x == true){
                result = result + 1;
            }
        }
        System.out.println(result);
    }
}