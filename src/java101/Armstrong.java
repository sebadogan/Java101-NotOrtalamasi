package java101;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int n, kalan, result = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("sayı giriniz:");
        n = inp.nextInt();

        while (n != 0) {
            kalan = n % 10;
            result += kalan;
            n /= 10;
        }
        System.out.println("sayının rakamları toplamı:" + result);

    }
}
