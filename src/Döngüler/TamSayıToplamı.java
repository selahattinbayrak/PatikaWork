package Döngüler;

import java.util.Scanner;

public class TamSayıToplamı {
    public static void main(String[] args) {
        int n,total=0;

        Scanner scan=new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz : ");
            n= scan.nextInt();
            if (n%4==0){
                total+=n;
            } else if (n%2==0) {
                total+=n;
            }
        } while (n%2==0);
        System.out.println("Tek Sayı Girdiniz");
        System.out.println("Girilen Değerlerin Toplamı : " + total);
    }
}
