package java101;

import java.util.Scanner;

public class UsluSayilar2 {

    static int pow(int base,int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban sayiyi giriniz: ");
        int base = inp.nextInt();
        System.out.print("Us olan sayiyi giriniz: ");
        int exp = inp.nextInt();

        System.out.println("sonuc: "+ pow(base,exp));


    }
}
