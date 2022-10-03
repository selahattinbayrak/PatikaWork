package PatikaÖdev;

import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        String userName,password,newPassword,talep;
        String kullanıcıAdı="patika",parola="java123";

        Scanner scan= new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName= scan.nextLine();

        System.out.print("Şifreniz : ");
        password= scan.nextLine();

        if (userName.equals(kullanıcıAdı) && password.equals(parola)){
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Bilgileriniz Yanlış ! \nŞifrenizi sıfırlamak ister misiniz\n" +
                    "Evet ise : 1 \nHayır ise : 2 tuşuna basınız");
            talep= scan.nextLine();
            if (talep.equals("1")){
                System.out.println("Yeni Şifrenizi Giriniz");
                newPassword= scan.nextLine();
                if (newPassword.equals(parola)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else {
                    newPassword=password;
                    System.out.println("Şifre Oluşturuldu");
                }
            } else {
                System.out.println("Şifre oluşturulamadı");
            }


        }
    }
}
