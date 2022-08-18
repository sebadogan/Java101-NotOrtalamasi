package Arrays;


import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = (int) (Math.random() * 101);
        int right = 0;



        while(right<5) {
            System.out.print("Tahmininizi giriniz: ");
            int number = scan.nextInt();
            if (number <= 100 && number >= 0) {
                if (number < n) {
                    System.out.println("Sayi tahin ettiginiz değerden " + number + "'tan buyuktur.");
                    right++;
                    System.out.println("5 Haktan "+ right+ " kadarini kullandiniz.");
                }
                if (number > n) {
                    System.out.println("Sayi tahin ettiginiz degerden " + number + "'den kucuktur.");
                    right++;
                    System.out.println("5 Haktan "+ right+ " kadarini kullandiniz.");
                }
                if (number == n) {
                    System.out.println("Tebrikler,dogru tahmin " + number + " = " + n);
                    break;
                }
            } else {
                System.out.println("[0-100] -->Belirtilen aralıkta deger giriniz.");
                right++;
                System.out.println("5 Haktan "+ right+ " kadarini kullandiniz.");
            }
        }
        System.out.println("Kaybettiniz :(");
        System.out.println("gizli sayi: "+n);
    }
}
