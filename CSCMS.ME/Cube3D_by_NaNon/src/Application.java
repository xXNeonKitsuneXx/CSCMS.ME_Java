import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] rubik = {
                {{1, 10, 19},
                        {2, 11, 20},
                        {3, 12, 21}
                },
                {{4, 13, 22},
                        {5, 14, 23},
                        {6, 15, 24}
                },
                {{7, 16, 25},
                        {8, 17, 26},
                        {9, 18, 27}
                }
        };
        int n = sc.nextInt();
        String move[] = new String[n];
        int ral[] = new int[n];
        for (int i = 0; i < n; i++) {
            move[i] = sc.next();
            ral[i] = sc.nextInt();
            if (move[i].equals("down")) {
                move = Arrays.copyOf(move, move.length + 2);
                ral = Arrays.copyOf(ral, ral.length + 2);
                for (int j = 0; j < 3; j++) {
                    move[i + j] = "up";
                    ral[i + j] = ral[i];
                }
                i += 2;
                n += 2;
            }
            if (move[i].equals("right")) {
                move = Arrays.copyOf(move, move.length + 2);
                ral = Arrays.copyOf(ral, ral.length + 2);
                for (int j = 0; j < 3; j++) {
                    move[i + j] = "left";
                    ral[i + j] = ral[i];
                }
                i += 2;
                n += 2;
            }
        }
        for (int i = 0; i < move.length; i++) {
            switch (move[i]) {
                case "up":
                    int t1, t2;
                    int r = ral[i];
                    t1 = rubik[0][r][0];
                    rubik[0][r][0] = rubik[2][r][0];
                    rubik[2][r][0] = rubik[2][r][2];
                    rubik[2][r][2] = rubik[0][r][2];
                    rubik[0][r][2] = t1;
                    t2 = rubik[1][r][0];
                    rubik[1][r][0] = rubik[2][r][1];
                    rubik[2][r][1] = rubik[1][r][2];
                    rubik[1][r][2] = rubik[0][r][1];
                    rubik[0][r][1] = t2;
                    break;
                case "left":
                    int t3, t4;
                    int l = ral[i];
                    t3 = rubik[l][0][0];
                    rubik[l][0][0] = rubik[l][2][0];
                    rubik[l][2][0] = rubik[l][2][2];
                    rubik[l][2][2] = rubik[l][0][2];
                    rubik[l][0][2] = t3;
                    t4 = rubik[l][1][0];
                    rubik[l][1][0] = rubik[l][2][1];
                    rubik[l][2][1] = rubik[l][1][2];
                    rubik[l][1][2] = rubik[l][0][1];
                    rubik[l][0][1] = t4;
                    break;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rubik[i][j][0] + " ");
            }
            System.out.println();
        }
    }
}