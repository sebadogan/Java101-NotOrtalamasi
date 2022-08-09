package java101;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int f, c, total1 = 1, total2 = 1, total3 = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Faktöriyel Sayısı:");
        f = scan.nextInt();

        System.out.print("Kombinasyon Sayisi:");
        c = scan.nextInt();


        for (int i = 1; i <= f; i++) {
            total1 = total1 * i;
        }
        for (int n = 1; n <= c; n++) {
            total2 = total2 * n;
        }
        for (int n2 = 1; n2 <= (f - c); n2++) {
            total3 = total3 * n2;
        }

        System.out.println("sonuc:" + total1 / (total2 * total3));

    }
}
