import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num1 = scr.nextInt();
        char op = scr.next().charAt(0);
        char opCheck1 = '/';
        char opCheck2 = '%';
        int num2 = scr.nextInt();
        if ( num2 == 0 && (op == opCheck1 || op == opCheck2)){
            System.out.print("error");
            return;
        }
        switch(op){
            case '+':
                System.out.print(num1 + num2);
                break;
            case '-':
                System.out.print(num1 - num2);
                break;
            case '*':
                System.out.print(num1 * num2);
                break;
            case '/':
                System.out.print(num1 / num2);
                break;
            case '%':
                System.out.print(num1 % num2);
                break;
        }
    }
}
