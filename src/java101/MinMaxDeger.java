package java101;

import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi,min=1,max=1;

        System.out.print("Kac sayi gireceksiniz: ");
        sayi=scan.nextInt();

        for(int i=1; i<=sayi;i++) {
            System.out.print(i+". sayiyi giriniz: ");
            int n=scan.nextInt();

            if(i==1) {
                min = n;
                max = n;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("min: "+min );
        System.out.println("max: "+max);
    }
}
