import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numS = scr.nextInt();
        int arr[] = new int[numS];
        for (int i = 0 ; i < numS; i++){
            arr[i] = scr.nextInt();
        }
        int nArr [] = arr.clone();
        Arrays.sort(nArr);
        //Upper is collect NumberStudent and Score ↑
        double A,B,C,D,E,F;
        A = (numS + 1) * 0.9;
        B = (numS + 1) * 0.7;
        C = (numS + 1) * 0.5;
        D = (numS + 1) * 0.3;
        E = (numS + 1) * 0.1;
        //Upper is  ↑
        int a,b,c,d,e,f;
        if (A != (int) A) {
            a = (int) A;
        }
        else { // A == int A
            a = (int) A - 1;
        }
        if (B != (int) B) {
            b = (int) B;
        }
        else {
            b = (int) B - 1;
        }
        if (C != (int) C) {
            c = (int) C;
        }
        else {
            c = (int) C - 1;
        }
        if (D != (int) D) {
            d = (int) D;
        }
        else {
            d = (int) D - 1;
        }
        if (E != (int) E) {
            e = (int) E;
        }
        else {
            e = (int) E - 1;
        }
//        Upper is  ↑
        a = nArr[a];
        b = nArr[b];
        c = nArr[c];
        d = nArr[d];
        e = nArr[e];
//        Upper is  ↑
        for (int i = 0; i < numS; i++) {
            if (arr[i] >= a)
                System.out.print("A");
            else if (arr[i] >= b)
                System.out.print("B");
            else if (arr[i] >= c)
                System.out.print("C");
            else if (arr[i] >= d)
                System.out.print("D");
            else if (arr[i] >= e)
                System.out.print("E");
            else
                System.out.print("F");
            if (i != numS - 1)
                System.out.print(" ");
        }
    }
}
