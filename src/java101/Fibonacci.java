package java101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int n = inp.nextInt();

        int result=0,s1=0,s2=1;

        for (int i=1; i<=n; i++) {
            result=s1+s2;
            if(s1==0)
                System.out.print(s1);
            if(i==1)
                System.out.print("-"+i);
            System.out.print("-"+result);
            s1=s2;
            s2=result;
        }
    }
}
