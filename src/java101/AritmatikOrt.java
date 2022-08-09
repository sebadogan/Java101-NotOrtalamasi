package java101;

import java.util.Scanner;

public class AritmatikOrt {
    public static void main(String[] args) {
        int n, avarage, sayac=0, toplam=0 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        n = inp.nextInt();


        for (int i = 1; i <= n; ++i) {

            if ((i % 3 == 0) && (i % 4 == 0)) {
                sayac += 0;
                toplam += i;

            }
        }
        if(sayac>0) {
            avarage= toplam/sayac;
            System.out.println("3ve 4 tam bölünenlerin ortalaması:"+ avarage);


        }else {
            System.out.println("3ve 4e bölünen sayı yoktur.");
        }
    }
}
