package java101;

import java.util.Scanner;

public class AtmHesabi {
    public static void main(String[] args) {

        String name, password;
        int sayac = 3, balance = 1500, tutar,n;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Adınızı Girin:");
            name=inp.nextLine();
            System.out.print("Sifreniz:");
            password=inp.nextLine();
            int login= ((name.equals("seba"))&&(password.equals("123")))? 1:2;

            switch(login) {
                case 1:
                    System.out.println("Giris Basarili");

                do {
                    System.out.println("Islem Secin:\n1-para yatırma\n2-para cekme \n3-bakiye sorgulama\n4-cıkıs");
                    n=inp.nextInt();

                    switch (n) {
                        case 1:
                            System.out.print("Yatırılacak Tutari Girin:");
                            tutar = inp.nextInt();
                            balance +=tutar;
                            System.out.println("Yeni bakiyeniz:" + balance);
                            break;
                        case 2:
                            System.out.print("Cekilecek Tutari Girin:");
                            tutar = inp.nextInt();
                            balance-=tutar;
                            System.out.println("Yeni bakiyeniz:" + balance);
                            break;
                        case 3:
                            System.out.print("Bakiyeniz:"+balance);
                            break;
                    }
                }while (n != 4);
                System.out.println("Sistemden Cikis Yapildi");

                case 2:
                    System.out.println("Tekrar Deneyiniz:");
                    sayac--;
                    System.out.println("Kalan Hakkiniz:"+sayac);
            }
        }while (sayac>0);
        System.out.println("Girdiginiz Bilgiler Hatalı,Hesabınız Bloke Olmustur");



    }
}
