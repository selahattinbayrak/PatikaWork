package Döngüler;

import java.util.Scanner;

public class BasamakSayısıToplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi= scan.nextInt();
        int gecSayi=sayi;
        int basSayi;
        int toplam=0;
        System.out.print(sayi+"= ");
        while (gecSayi!=0){
            basSayi=gecSayi%10;
            System.out.print(basSayi +" + ");
            toplam+=basSayi;
            gecSayi/=10;
        }
        System.out.println("= "+toplam);

    }
}
