import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int word = input.nextInt();
        int max = 0;
        String[] A = new String[word];
        for (int i = 0; i < word; i++) {
            A[i] = input.next();
//            max = Math.max(max, A[i].length());
            if (A[i].length() > max){
                max = A[i].length();
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < word; j++) {
                if (A[j].length() <= i)
                    System.out.print("  ");
                else
                    System.out.print(A[j].charAt(i) + " ");
            }
            System.out.println();
        }
    }
}