import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int result = 0;
        String text = scr.nextLine();
//        text = text.replace(".", " ");
//        System.out.println(text);
        String[] word = text.split("\\.");
        System.out.println(text);
        for (int i = 0; i < word.length; i++) {
            if (Integer.parseInt(word[i]) > 255) {
                System.out.println("Invalid");
                break;
            }
            else if (Integer.parseInt(word[i]) < 0) {
                System.out.println("Invalid");
                break;
            }
            else {
                if (i == (word.length - 1)) {
//                    System.out.println(i);
                    if (i != 3) {
                        System.out.print("Invalid");
                        return;
                    }
                    System.out.println("Valid");
                    }
                }
            }
        }
    }
