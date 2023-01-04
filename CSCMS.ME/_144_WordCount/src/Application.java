//import java.util.*;
//public class Application {
//    public static void main(String[] args) {
//        Scanner scr = new Scanner(System.in);
//        String textIn = scr.nextLine().toLowerCase();
//        String textC = scr.nextLine().toLowerCase();
//        String[] textArr = textIn.split(textC,-1);
//        System.out.print(textArr.length-1);
//    }
//}

import java.util.*;
class Application{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String textIn = scr.nextLine().toLowerCase();
        String wordIn = scr.next().toLowerCase();
        int len = wordIn.length();
        int count = 0;

        for (int i = 0; i <= textIn.length() - len; i++){
            if (textIn.substring(i, i + len).equals(wordIn)){
                count++;
                i += len - 1;
            }
        }
        System.out.print(count);
    }
}
