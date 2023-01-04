import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String textIn = scr.nextLine();
        String[] arr = textIn.split(" ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(".-"))
                System.out.print("A");
            else if (arr[i].equals("-..."))
                System.out.print("B");
            else if (arr[i].equals("-.-."))
                System.out.print("C");
            else if (arr[i].equals("-.."))
                System.out.print("D");
            else if (arr[i].equals("."))
                System.out.print("E");
            else if (arr[i].equals("..-."))
                System.out.print("F");
            else if (arr[i].equals("--."))
                System.out.print("G");
            else if (arr[i].equals("...."))
                System.out.print("H");
            else if (arr[i].equals(".."))
                System.out.print("I");
            else if (arr[i].equals(".---"))
                System.out.print("J");
            else if (arr[i].equals("-.-"))
                System.out.print("K");
            else if (arr[i].equals(".-.."))
                System.out.print("L");
            else if (arr[i].equals("--"))
                System.out.print("M");
            else if (arr[i].equals("-."))
                System.out.print("N");
            else if (arr[i].equals("---"))
                System.out.print("O");
            else if (arr[i].equals(".--."))
                System.out.print("P");
            else if (arr[i].equals("--.-"))
                System.out.print("Q");
            else if (arr[i].equals(".-."))
                System.out.print("R");
            else if (arr[i].equals("..."))
                System.out.print("S");
            else if (arr[i].equals("-"))
                System.out.print("T");
            else if (arr[i].equals("..-"))
                System.out.print("U");
            else if (arr[i].equals("...-"))
                System.out.print("V");
            else if (arr[i].equals(".--"))
                System.out.print("W");
            else if (arr[i].equals("-..-"))
                System.out.print("X");
            else if (arr[i].equals("-.--"))
                System.out.print("Y");
            else if (arr[i].equals("--.."))
                System.out.print("Z");
        }
    }
}