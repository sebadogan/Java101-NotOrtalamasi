package java101;

import java.util.Scanner;

public class GirilenSayilar {
    public static void main(String[] args) {

        int n, sum=0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz:");
            n = inp.nextInt();

            if (n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 ==0);

        System.out.println("4!ün katları olan sayılar toplamı:"+ sum);

    }
}
