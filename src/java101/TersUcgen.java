package java101;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ucgen satır sayisi giriniz: ");
        int n = scan.nextInt();

        if (n > 0) {

            for (int i = 1; i <= n; i++) {

                for (int bosluk = 1; bosluk <= i; bosluk++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=2*(n-i+1)-1; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Lütfen 0dan büyük değer giriniz.");
        }
    }
}
