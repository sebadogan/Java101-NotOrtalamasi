package java101;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {

        int n,m, total=1;
        Scanner inp=new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı:");
        n=inp.nextInt();

        System.out.print("Üs Olacak sayı:");
        m=inp.nextInt();

        for(int i=1; i<=m; i++) {
            total *= n;

        }
        System.out.println("sonuc:"+total);
    }
}
