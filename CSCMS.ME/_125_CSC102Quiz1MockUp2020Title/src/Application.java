import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String text = scr.nextLine();
        int numin = scr.nextInt();
        if (numin >= text.length()){
            System.out.print(text);
        }
        if (text.length() > numin){
            System.out.print(text.substring(0,numin));
            System.out.print("...");
        }
    }
}
