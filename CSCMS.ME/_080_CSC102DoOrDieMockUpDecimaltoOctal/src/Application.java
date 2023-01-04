import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numIn = scr.nextInt();
        int temp, sum = 0 , i = 1;
//        String text = Integer.toString(numIn);
//        System.out.println(Integer.toString(Integer.parseInt(text, 10), 8));
        while (numIn > 0){
            temp = numIn % 8;
            sum += i * temp;
            numIn = numIn / 8;
            i = i * 10;
        }
        System.out.print(sum);
    }
}
