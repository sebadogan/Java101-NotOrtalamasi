import java.util.Scanner;
public class KdvHesapla {
    public static void main(String[] args) {
        double tutar, KDVmiktari, KDVliFiyat, KDVtutari;
        boolean KDV;
        Scanner input = new Scanner(System.in);

        System.out.print("Para Miktarınız:");
        tutar = input.nextDouble();

        KDV = (0< tutar)  &&(1000>tutar);
        KDVmiktari = KDV? 0.18 : 0.08;
        KDVliFiyat = tutar * tutar * KDVmiktari;
        KDVtutari = tutar * KDVmiktari;

        System.out.println("KDV'li Tutar : "+KDVliFiyat);
        System.out.println("KDV Tutari : " +KDVtutari);
        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Miktari : "+ "%" + KDVmiktari*100);









    }
}
