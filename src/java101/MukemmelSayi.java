package java101;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayi giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }

        }
        if (result == n) {
            System.out.println(n + " bir mükemmel sayidir.");
        } else {
            System.out.println(n + " bir mükemmel sayi değildir.");
        }
    }
}
