import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        double dik1, dik2, hipotenus;
        Scanner input = new Scanner(System.in);

        System.out.print("Dik kenarlardan birinin uzunluğunu giriniz: ");
        dik1= input.nextDouble();

        System.out.print("Diğer dik kenarın uzunluğunu giriniz: ");
        dik2 =input.nextDouble();


        hipotenus =Math.sqrt((dik1 *dik1) + (dik2 * dik2));
        System.out.println("hipotenüs: " + hipotenus);

    }
}
