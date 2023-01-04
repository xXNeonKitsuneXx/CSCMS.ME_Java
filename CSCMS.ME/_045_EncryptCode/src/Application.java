import java.util.Scanner;
public class Application{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String textIn = sc.nextLine().toLowerCase();
        int i,j = 0;
        boolean a = false;
        for (i = 0; i < textIn.length(); i++){
            a = false;
            for (j = 0; j < textIn.length(); j++){
                if(textIn.charAt(i) == textIn.charAt(j) && i != j){
                    a = true;
                    break;
                }
                else{
                    a = false;
                }
            }
            if (a == true){
                System.out.print("-");
            }
            else if (a == false){
                System.out.print("*");
            }
//            System.out.print((a)? "-": "*");
        }
    }
}