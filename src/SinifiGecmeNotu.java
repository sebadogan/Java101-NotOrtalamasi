import java.util.Scanner;

public class SinifiGecmeNotu {
    public static void main(String[] args) {

        int mat, phys, turk, chem, music, nLesson=0;
        double avrg=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat= input.nextInt();
        if((mat<100) &&(mat>0)) {
            nLesson += 1;
            avrg += mat;
        }else{
            System.out.println("Notunu 0-100 arasında giriniz");

        }

        System.out.print("Fizik Notunuz:");
        phys= input.nextInt();
        if((phys<100) &&(phys>0)) {
            nLesson += 1;
            avrg += phys;
        }else{
            System.out.println("Notunu 0-100 arasında giriniz");

        }

        System.out.print("Türkçe Notunuz:");
        turk= input.nextInt();
        if((turk<100) &&(turk>0)) {
            nLesson += 1;
            avrg += turk;
        }else{
            System.out.println("Notunu 0-100 arasında giriniz");

        }

        System.out.print("Kimya Notunuz:");
        chem= input.nextInt();
        if((chem<100) &&(chem>0)) {
            nLesson += 1;
            avrg += chem;
        }else{
            System.out.println("Notunu 0-100 arasında giriniz");

        }

        System.out.print("Müzik Notunuz:");
        music= input.nextInt();
        if((music<100) &&(music>0)) {
            nLesson += 1;
            avrg += music;
        }else{
            System.out.println("Notunu 0-100 arasında giriniz");

        }

        double avarage= avrg/nLesson;
        if(avarage>= 55) {
            System.out.println("Sınıfı Geçtiniz\nOrtalamanız:" + avarage);
        }else {
            System.out.println("Sınıfta Kaldınız\nOrtalamanız:" + avarage);
        }
                }
        }


