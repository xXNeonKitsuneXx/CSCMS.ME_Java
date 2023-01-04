import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String numipv4 = scr.nextLine();
        String textnum = "";
        int result = 0;
        for (int indexofstring = 0; indexofstring < numipv4.length(); indexofstring++) {
//            System.out.println("This a "+ textnum);
//           || numipv4.length()-1 == indexofstring
            if (numipv4.charAt(indexofstring) == '.') {
                if (Integer.parseInt(textnum) > 255 || Integer.parseInt(textnum) < 0) {
                    System.out.print("Invalid");
                    return;
                }
                textnum = "";
                result++;
            }
            else if (numipv4.length()-1 == indexofstring) {
                textnum = textnum + numipv4.charAt(indexofstring);
                if (Integer.parseInt(textnum) > 255 || Integer.parseInt(textnum) < 0) {
                    System.out.print("Invalid");
                    return;
                }
            }
            else {
                    textnum = textnum + numipv4.charAt(indexofstring);
            }
        }
        System.out.println(result);
        if (result != 3){
            System.out.print("Invalid");
            return;
        }
        System.out.print("Valid");
    }
}