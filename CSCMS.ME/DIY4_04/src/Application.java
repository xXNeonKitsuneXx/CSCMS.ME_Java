import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        String[][] crossword = new String[row][col];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                crossword[i][j] = sc.next();
            }
        }
        int wordNumber = sc.nextInt();
        String[] arr = new String[wordNumber];
        for (int i = 0; i < wordNumber; i++) {
            arr[i] = sc.next();
        }
        boolean[] results = new boolean[wordNumber];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                String n = "";
                String ne = "";
                String e = "";
                String se = "";
                String s = "";
                String sw = "";
                String w = "";
                String nw = "";
                for (int k = i; k >= 0; k--) {
                    n += crossword[k][j];
                }
                for (int k = 0; i-k >= 0 && j+k < col; k++) {
                    ne += crossword[i-k][j+k];
                }
                for (int k = j; k < col; k++) {
                    e += crossword[i][k];
                }
                for (int k = 0; i+k < row && j+k < col; k++) {
                    se += crossword[i+k][j+k];
                }
                for (int k = i; k < row; k++) {
                    s += crossword[k][j];
                }
                for (int k = 0; i+k < row && j-k >= 0; k++) {
                    sw += crossword[i+k][j-k];
                }
                for (int k = j; k >= 0; k--) {
                    w += crossword[i][k];
                }
                for (int k = 0; i-k >= 0 && j-k >= 0; k++) {
                    nw += crossword[i-k][j-k];
                }
                for (int k = 0; k < wordNumber; k++) {
                    if (n.contains(arr[k])) {
                        results[k] = true;
                    }
                    if (ne.contains(arr[k])) {
                        results[k] = true;
                    }
                    if (e.contains(arr[k])) {
                        results[k] = true;
                    }
                    if (se.contains(arr[k])) {
                        results[k] = true;
                    }
                    if (s.contains(arr[k])) {
                        results[k] = true;
                    }
                    if (sw.contains(arr[k])){
                        results[k] = true;
                    }
                    if (w.contains(arr[k])){
                        results[k] = true;
                    }
                    if (nw.contains(arr[k])){
                        results[k] = true;
                    }
                }
            }
        }
        for (int i = 0; i < wordNumber; i++) {
            System.out.print(arr[i]);
            if (results[i]){
                System.out.print(" found\n");
            }else {
                System.out.print(" not found\n");
            }
        }
    }
}