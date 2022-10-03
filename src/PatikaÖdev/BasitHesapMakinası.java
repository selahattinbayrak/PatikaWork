package PatikaÖdev;

import java.util.Scanner;

public class BasitHesapMakinası {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz");
        n1 = scan.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Sçiminiz : ");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölüm : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. Tekrar Deneyiniz");


        }
    }
}
