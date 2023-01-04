import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String day = scr.nextLine();
        switch (day){
            case "Monday":
                System.out.println("Fortune : " + "Purple");
                System.out.print("Unfortunate : " + "Red");
                break;
            case "Tuseday":
                System.out.println("Fortune : " + "Orange");
                System.out.print("Unfortunate : " + "Yellow, White");
                break;
            case "Wednesday":
                System.out.println("Fortune : " + "Black, Brown, Gray");
                System.out.print("Unfortunate : " + "Pink");
                break;
            case "Thursday":
                System.out.println("Fortune : " + "Red");
                System.out.print("Unfortunate : " + "Purple");
                break;
            case "Friday":
                System.out.println("Fortune : " + "Pink");
                System.out.print("Unfortunate : " + "Black, Blue, Gray");
                break;
            case "Saturday":
                System.out.println("Fortune : " + "Blue,  Baby Blue");
                System.out.print("Unfortunate : " + "Green");
                break;
            case "Sunday":
                System.out.println("Fortune : " + "Green");
                System.out.print("Unfortunate : " + "Blue, Baby Blue");
                break;
            default:
                System.out.print("Input is invalid");
        }
    }
}
