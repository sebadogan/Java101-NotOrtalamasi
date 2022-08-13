package java101;

import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {

            for (int boslukSayi = 0; boslukSayi < (n - i); boslukSayi++) {
                System.out.print(" ");
            }
            for (int yildizSayi = 1; yildizSayi <= (2 * i - 1); yildizSayi++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int a = 1; a <= n; a++) {

            for (int bosluk = 1; bosluk <= a; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = (n-a)*2-1; yildiz >0; yildiz--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

