import java.util.Scanner;
class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numin = sc.nextInt();
        int flag = 0;
        int i;
        int temp = numin/2;
        if(numin == 0 || numin == 1) {
            System.out.println("No");
        }
        else{
            for(i = 2 ; i <= temp ; i++) {
                if (numin%i == 0) {
                    System.out.println("No");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Yes");
            }
        }
    }
}
