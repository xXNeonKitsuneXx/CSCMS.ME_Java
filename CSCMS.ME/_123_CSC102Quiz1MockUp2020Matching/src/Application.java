import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String a = scr.next();
        String b = scr.next();
        if (a.equals(b)){
            System.out.println("Perfect Match");
        }
        else if (a.equalsIgnoreCase(b)){
            System.out.println("Partial Match");
        }
        else if (a.toUpperCase().contains(b.toUpperCase())){
            System.out.println("Partial Match");
        }
        else if (b.toUpperCase().contains(a.toUpperCase())){
            System.out.println("Partial Match");
        }
        else {
            System.out.println("Not Match");
        }
    }
}