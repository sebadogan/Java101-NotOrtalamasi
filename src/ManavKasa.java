import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double elma, armut, domates, muz, patlican, tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız:");
        armut = input.nextDouble();

        System.out.print("Kaç kilo elma aldınız:");
        elma = input.nextDouble();

        System.out.print("Kaç kilo muz aldınız:");
        muz = input.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız:");
        patlican = input.nextDouble();

        System.out.print("Kaç kilo domates aldınız:");
        domates = input.nextDouble();

        tutar= (armut*2.14) + (elma*3.67) + (muz*0.95) + (patlican*5.00) + (domates* 1.11);
        System.out.println("Toplam tutar:" + tutar);





    }
}
