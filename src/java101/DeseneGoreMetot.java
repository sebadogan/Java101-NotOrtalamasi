package java101;
import java.util.Scanner;
public class DeseneGoreMetot {

    static void desen (int n){

        if(n>0) {
            System.out.print(n+ " ");
            desen(n-5);
        }
        System.out.print(n+ " ");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("desen icin sayi giriniz: ");
        int n=scan.nextInt();

        desen(n);
    }
}
