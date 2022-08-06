import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        double a, b, c, alan, d;
        //d = üçgenin çevresinin yarısı

        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını sırayla giriniz: ");
        a = input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();

        d = (a+b+c)/2;
        alan =Math.sqrt(d *(d-a) * (d-b) * (d-c));
        System.out.println("üçgenin alanı:" + alan);


    }
}
