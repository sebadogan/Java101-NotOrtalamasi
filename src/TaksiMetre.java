import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        //min= minumum ücret tutarı, azami
        double km, acilis = 10, min, ucret=2.20;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen km'yi yazınız:");
        km = input.nextDouble();

        boolean azami;
        azami = 10<km;
        min = azami ? (ucret*km)+acilis : 10+acilis;
        System.out.println("Taksimetre Tutarınız: "  + min);
    }
}
