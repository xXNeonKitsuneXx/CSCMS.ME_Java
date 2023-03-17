import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new java.util.Scanner(System.in);
        String textIn = scr.nextLine().toLowerCase();
        int[] Aletter = new int[27];

        for (int i = 0; i < textIn.length(); i++) { // 96
            Aletter[textIn.charAt(i) - 96]++;
//            System.out.print(Aletter[textIn.charAt(i) - 96] + " ");
        }

        String ans = "";
        int numIN = scr.nextInt();
        int maxScore = 0;

        for (int j = 0; j < numIN; j++) {
            int tempScore = 0;
            String textC = scr.next();
            String topSWord = textC;
            textC = textC.toLowerCase();
            for (int k = 0; k < textC.length(); k++) {
                tempScore += Aletter[textC.charAt(k) - 96];
//                System.out.println("This Aletter in loop = " + Aletter[textC.charAt(k) - 96]);
//                System.out.println("This tempScore in loop = " + tempScore);
//                System.out.println("----------------------------------");
            }
            if (j == 0) {
                maxScore = tempScore;
                ans = topSWord;
            }
            else if (tempScore >= maxScore) {
                maxScore = tempScore;
                ans = topSWord;
            }
//            System.out.println("This is tempScore k = " + tempScore);
//            System.out.println("This is maxScore now = " + maxScore);
//            System.out.println("Ans now = " + ans);
//            System.out.println("----------------------------------");
        }
        System.out.print(ans);
    }
}
