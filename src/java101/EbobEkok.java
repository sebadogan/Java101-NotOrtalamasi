package java101;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int k ;
        Scanner scan = new Scanner(System.in);

        System.out.print("ilk sayiyi giriniz:");
        int n1 = scan.nextInt();
        System.out.print("İkinci Sayiyi giriniz:");
        int n2 = scan.nextInt();

        if(n1<n2) {
           k=n1;
           while(k>=1) {
               if (n1 % k == 0 && n2 % k == 0) {
                   System.out.println("ebob: " + k);
                   break;
               }k--;
           }
        }else {
            k = n2;
            while (k >= 1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    System.out.println("ebob" + k);
                    break;
                }k--;
            }
        }
        if(n1==n2) {
            System.out.println("ebob: " +n1);
        }
        int ekok= (n1*n2)/k;
        System.out.println("ekok" +ekok);

    }
}


