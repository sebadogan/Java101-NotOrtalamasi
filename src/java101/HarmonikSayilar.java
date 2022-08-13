package java101;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        double n,result=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Sayi Giriniz:");
        n=input.nextDouble();

        for(double i=1;i<=n;i++) {

            result+=1/i;
        }
        System.out.println(result);
    }
}

