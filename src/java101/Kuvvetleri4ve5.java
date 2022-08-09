package java101;

import java.util.Scanner;

public class Kuvvetleri4ve5 {
    public static void main(String[] args) {

        int n,i=0;
        Scanner scan= new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        n= scan.nextInt();

        while(i<=n) {
            i++;
            if((i%4==0) || (i%5==0)) {
                System.out.println(+i  );

            }
        }

    }
}
