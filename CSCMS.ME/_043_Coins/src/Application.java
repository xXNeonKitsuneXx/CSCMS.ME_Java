import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String [] inCoins = scr.nextLine().split(" ");
        int [] coins = new int [inCoins.length];
        int med = 0;
        int count = 0;
        int i,j,k,l;
        for (i = 0; i < inCoins.length; i++) {
            coins[i] = Integer.parseInt(inCoins[i]);
        }
        Arrays.sort(coins);
        if (coins.length % 2 == 0){
            med = (coins[(coins.length / 2) - 1] + coins[(coins.length / 2)]) / 2;
        }
        else if (coins.length % 2 != 0) {
            med = coins[coins.length/2];
        }
        for (i = 0 ; i < inCoins.length ; i++){
            if (Integer.parseInt(inCoins[i]) > med){
                count += Integer.parseInt(inCoins[i]) - med;
            }
            else if (Integer.parseInt(inCoins[i]) < med){
                count += med - Integer.parseInt(inCoins[i]);
            }
        }
        System.out.print(count);
    }
}
