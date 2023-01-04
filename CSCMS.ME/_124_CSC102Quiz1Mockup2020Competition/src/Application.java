import java.util.*;
public class Application {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num1[] = new int[3];
        int num2[] = new int[3];
        int score1 =0;
        int score2 =0;
        String player1 = scr.nextLine();
        for(int i =0;i<3;i++){
            num1[i] = scr.nextInt();
        }
        scr.nextLine();
        String player2 = scr.nextLine();
        for(int i =0;i<3;i++){
            num2[i] = scr.nextInt();
        }
        Arrays.sort(num1);
        Arrays.sort(num2);

        if(num1[2] > num2[2]){
            score1++;
        }
        if(num1[2] < num2[2]){
            score2++;
        }
        if(num1[0] > num2[0]){
            score1++;
        }
        if(num1[0] < num2[0]){
            score2++;
        }
        if(score1 == 2){
            System.out.print("Perfect Win (" + player1 + ")");
            return;
        }
        else if(score2 == 2){
            System.out.print("Perfect Win (" + player2 + ")");
            return;
        }
        if(num1[1] > num2[1]){
            score1++;
        }
        if(num1[1] < num2[1]){
            score2++;
        }

        if(score1 > score2){
            System.out.print("Win (" + player1 + ")");
        }
        else if(score2 > score1 ){
            System.out.print("Win (" + player2 + ")");
        }
        else if(score1 == score2){
            System.out.print("Draw");
        }
    }
}