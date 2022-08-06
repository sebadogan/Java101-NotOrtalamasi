import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {

        double pi=3.14, r, a, area;
        Scanner input = new Scanner(System.in);

        System.out.print("dairenin yarıçapı yazınız: ");
        r =input.nextDouble();

        System.out.print("daire diliminin merkez açısını yazınız:");
        a= input.nextDouble();

        area = (pi *(r*r) *a) / 360;
        System.out.println("daire diliminin alanı:" + area);
    }
}
