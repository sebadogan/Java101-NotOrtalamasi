import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int day, m;

        System.out.print("Dogdunuz gun:");
        day = inp.nextInt();
        System.out.print("Dogdugunuz ay:");
        m = inp.nextInt();


        if ((m == 3) && (day >= 21)) {
            System.out.println("Burcunuz:Koc");
        } else if ((m == 3) && (day < 21)) {
            System.out.println("Burcunuz:Balık");
        }

        if ((m == 4) && (day < 21)) {
            System.out.println("Burcunuz:Koc");
        } else if ((m == 4) && (day >= 21)) {
            System.out.println("Burcunuz: Boga");
        }

        if ((m == 5) && (day <= 21)) {
            System.out.println("Burcunuz:Boga");
        } else if ((m == 5) && (day > 21)) {
            System.out.println("Burcunuz: İkizler");
        }

        if ((m == 6) && (day <= 22)) {
            System.out.println("Burcunuz:İkizler");
        } else if ((m == 6) && (day > 22)) {
            System.out.println("Burcunuz:Yengec");
        }


        if ((m == 7) && (day <= 22)) {
            System.out.println("Burcunuz:Yengec");
        }else if ((m == 7) && (day > 22)) {
                System.out.println("Burcunuz:Aslan");
            }


        if ((m == 8) && (day <= 22)) {
            System.out.println("Burcunuz: Aslan");
        }else if ((m == 8) && (day > 22)) {
                System.out.println("Burcunuz:Basak");
            }


        if ((m == 9) && (day <= 22)) {
            System.out.println("Burcunuz: Basak");
        }else if ((m == 9) && (day > 22)){
                System.out.println("Burcunuz:Terazi");
            }


        if ((m == 10) && (day <= 22)) {
            System.out.println("Burcunuz: Terazi");
        }else if ((m == 10) && (day > 22)) {
                System.out.println("Burcunuz:Akrep");
            }


        if ((m == 11) && (day <= 21)) {
            System.out.println("Burcunuz:Akrep");
        }else if ((m == 11) && (day > 21)) {
                System.out.println("Burcunuz: Yay");
            }


        if ((m == 12) && (day <= 21)) {
            System.out.println("Burcunuz:Yay");
        }else if ((m == 12) && (day > 21)) {
                System.out.println("Burcunuz:Oglak");
            }


        if ((m == 1) && (day <= 21)) {
            System.out.println("Burcunuz:Ogalak");
        }else if ((m == 1) && (day > 21)) {
                System.out.println("Burcunuz:Kova");
            }


        if ((m == 2) && (day <= 19)) {
            System.out.println("Burcunuz:Kova");
        }else if ((m == 2) && (day > 19)) {
                System.out.println("Burcunuz:Balık");
            }
        }


    }


