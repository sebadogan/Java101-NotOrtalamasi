import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int age, km, yon;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz:");
        age = inp.nextInt();

        System.out.print("Gidilecek Mesafeyi Giriniz:");
        km = inp.nextInt();

        System.out.print("Yolculuk Tipini Seçiniz:\n1-Tek-Yön\n2-Gidiş-Dönüş");
        yon = inp.nextInt();

        double fiyat = (km * (0.10)), yonIndirim = fiyat * 0.20;

        if ((age > 0) && (km > 0) && ((yon == 1) || (yon == 2))) {

            if ((age < 12) && (yon == 1)) {
                System.out.println("Toplam Tutar:" + fiyat / 2);

            } else if ((age < 12) && (yon == 2)) {
                System.out.println("ToplamTutar: " + ((fiyat / 2) - (((fiyat / 2) * 0.20))));

            } else if ((age > 12) && (age < 24) && (yon == 1)) {
                System.out.println("Toplam Tutar:" + (fiyat - (fiyat * 0.10)));

            } else if ((age > 12) && (age < 24) && (yon == 2)) {
                System.out.println("ToplamTutar:"+ ((fiyat - (fiyat * 0.10))-((fiyat - (fiyat * 0.10))*0.20)) );

            } else if ((age > 65) && (yon == 1)) {
                System.out.println("Toplam Tutar:" + (fiyat - (fiyat * 0.30)));

            } else if ((age > 65) && (yon == 2)) {
                System.out.println("Toplam Tutar:" + ((fiyat - (fiyat * 0.30))-((fiyat - (fiyat * 0.30))*0.20)));
            }

        } else {
            System.out.println("Hatalı Veri Girdiniz,Tekrar Deneyiniz.");
        }

    }
}

