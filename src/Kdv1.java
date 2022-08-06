import java.util.Scanner;

public class Kdv1 {
    public static void main(String[] args) {

        int miktar;
        Scanner input = new Scanner(System.in);

        System.out.print("Para Miktarı: ");
        miktar = input.nextInt();

        double KDVli = miktar * 0.18 + miktar;
        System.out.println("KDV'siz Tutar: " + miktar);
        System.out.println("KDV'li fiyat: " + KDVli);
        System.out.println("KDV Tutatrı:1.8");


    }
}
