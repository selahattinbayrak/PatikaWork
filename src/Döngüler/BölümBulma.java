package Döngüler;

import java.util.Scanner;

public class BölümBulma {

    // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
    // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

    public static void main(String[] args) {
        int k, sayac=0,toplam=0,ortalama;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        k= scan.nextInt();

        for (int i = 1; i <=k; i++) {
            if (i%3 == 0 && i%4==0) {
               sayac+=1;
               toplam+=i;
               System.out.print("3 ve 4'e tam bölünen sayılar : " +i +"\n");
            }
        }
         ortalama=toplam/sayac;
        System.out.print("3 ve 4'e tam bölünen sayıların Ortalaması : " + ortalama);
    }
}
