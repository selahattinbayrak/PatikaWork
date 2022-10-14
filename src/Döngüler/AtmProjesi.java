package Döngüler;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int rigt = 3;
        int balance = 1500; //bakiye
        int select; //kullnıcı seçimi

        while (rigt > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = scan.nextLine();
            System.out.print("Parolanız : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, X bankasına Hoşgeldiniz");
                do {
                    System.out.println("1- Para Ytırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            int price = scan.nextInt();//ücret
                            balance += price;
                            System.out.println("Para Yatırma İşlminiz Tamamlandı");
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            } else {
                rigt--;
                System.out.println("Hatalı Kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (rigt == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz ");
                } else {
                    System.out.println("Kalan Hakkınız : " + rigt);
                }

            }
        }
    }
}
