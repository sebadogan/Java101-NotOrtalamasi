package java101;

import java.util.Scanner;

public class AsalRecursive {
    static void asal(int n, int i) {

        if (n == i) {
            System.out.println(n + " asal sayıdır.");
            return;
        } else if (n <= 1) {
            System.out.println(n + " asal değildir. En kücük asal sayi 2'dir.");
            return;
        } else if (n % i == 0) {
            System.out.println(n + " asal değildir. " + i + " ile bölünür.");
            return;
        }
        asal(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("sayı giriniz : ");
            int n = scan.nextInt();
            asal(n, 2);
        }
    }
}
