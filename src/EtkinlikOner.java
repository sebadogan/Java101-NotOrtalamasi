import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {

        double temp;

        Scanner input= new Scanner(System.in);
        System.out.print("Sıcaklık Degerini Giriniz:");
        temp = input.nextDouble();

        if(temp<5) {
            System.out.println("Kayak Yapabilirsiniz");
        } else if((temp>5)&&(temp<15)) {

            }if(temp<=15) {
            System.out.println("Sinemaya Gidebilirsiniz");
            }if(temp==15) {
            System.out.println("Pikniğe Gidebilirsiniz.");

        }else if((temp>15)&&(temp<=25)) {

            }if(temp<=25){
            System.out.println("Piknige Gidebilirsiniz");
            }if(temp>=25){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
