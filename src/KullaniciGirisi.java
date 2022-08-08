import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {


        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName= input.nextLine();

        System.out.print("Şifreniz:");
        password= input.nextLine();

        if(userName.equals("patika") && password.equals("Java123")) {
            System.out.print("Giriş Başarılı");
        }else{
            System.out.print("Bilgileriniz Yanlış,Şifreyi Sıfırlamak İsterminiz?\n1-Evet\n2-Hayır\nSeciniz:");

        }
        System.out.print("");
        int answer = input.nextInt();

        switch(answer){
            case 1:
                Scanner inp= new Scanner(System.in);
                System.out.print("yeni şifrenizi girin:");
                newPassword= inp.nextLine();
                if(newPassword.equals("Java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifreniz Bşarıyla Değiştirildi");
                }
                break;
            default:
                System.out.print("Sisteme Yeniden Giriniz");

        }


        }


        }





