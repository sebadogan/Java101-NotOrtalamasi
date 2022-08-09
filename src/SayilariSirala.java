import java.sql.SQLOutput;
import java.util.Scanner;

public class SayilariSirala {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner inp = new Scanner(System.in);

        System.out.print("Write Number1:");
        n1 = inp.nextInt();
        System.out.print("Write Number2:");
        n2 = inp.nextInt();
        System.out.print("Write Number3: ");
        n3 = inp.nextInt();

        if ((n1 < n2) && (n1 < n3)) {

            if (n2 < n3) {
                System.out.println("n1<n2<n3");

            } else {
                System.out.println("n1<n3<n2");
            }

        } else if ((n2 < n1) && (n2 < n3)) {

            if (n1 < n3) {
                System.out.println("n2<n1<n3");
            } else {
                System.out.println("n2<n3<n1");
            }

        } else {

            if (n2 < n1) {
                System.out.println("n3<n2<n1");
            } else {
                System.out.println("n3<n1<n2");
            }

        }
    }
}