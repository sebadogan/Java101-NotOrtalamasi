package java101;

import java.util.Scanner;

public class GelismisHesapMak {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int sayac = scan.nextInt();
        int result = 0, n;

        for (int i = 1; i <= sayac; i++) {
            if (sayac >= 2) {
                System.out.print(i + ". sayi: ");
                n = scan.nextInt();
                result += n;
            } else {
                System.out.println("toplama islemi icin daha fazla sayiya ihtiyac var.");
            }
        }
        System.out.println("sonuc: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cıkarma Islemi icin kac Adet Sayi Gireceksiniz: ");
        int sayac = scan.nextInt();
        int n, result = 0;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayi: ");
            n = scan.nextInt();
            if (i == 1) {
                result += n;
                continue;
            }
            result -= n;
        }
        System.out.println("sonuc: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("carpma icin kac sayi gireceksiniz: ");
        int sayac = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". sayi: ");
            int n = scan.nextInt();
            if (n == 0) {
                result = 0;
            }
            result *= n;
        }
        System.out.println("sonuc: " + result);
    }

    static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = scan.nextInt();
        double n, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi: ");
            n = scan.nextDouble();
            if (n == 0) {
                System.out.println("bölen 0 olamaz.");
                continue;
            }
            if (i == 1) {
                result = n;
                continue;
            }
            result /= n;
        }
        System.out.println("sonuc: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayiyi giriniz: ");
        int sub = scan.nextInt();
        System.out.print("Ussu giriniz: ");
        int exp = scan.nextInt();
        int res = 1;

        for (int i = 1; i <= exp; i++) {
            res *= sub;
        }
        System.out.println("sonuc: " + res);
    }

    static void fac() {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayiyi giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
                result *= i;
        }
        System.out.println("sonuc: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mod'u alınacak sayi: ");
        int n = scan.nextInt();
        System.out.print("Bölen sayı: ");
        int m = scan.nextInt();
        double result = 0;

        if (m != 0) {
            result = n % m;
        } else {
            System.out.println("Yanlis deger girdiniz, bölen 0 olamaz");
        }
        System.out.println("sonuc:" + result);
    }

    static void sur() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        int a = scan.nextInt();
        System.out.print("kısa kenarı giriniz: ");
        int b = scan.nextInt();

        int result = 2 * a + 2 * b;

        System.out.println("sonuc: " + result);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int secim;
        do {
            System.out.print("Yapmak İstediginiz İslemi Seciniz: \n 1-toplama\n2-cikarma\n3-carpma\n4-bolme\n5-üslü sayilar\n6-faktoriyel\n7-mod\n8-dikdotgen cevre\n 0-cikis yap");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fac();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    sur();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis secim yaptiniz");
            }
        } while (secim != 0);
        System.out.println("Sistemden Cıkıs Yapildi.");
    }
}

