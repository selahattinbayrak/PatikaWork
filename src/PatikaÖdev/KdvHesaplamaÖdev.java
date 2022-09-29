package PatikaÖdev;

import java.util.Scanner;

public class KdvHesaplamaÖdev {
    public static void main(String[] args) {
        double fiyat;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürünün fiyatını giriniz");
        fiyat= scan.nextDouble();

        double kdvOran= (fiyat>0 && fiyat<=1000) ? 0.18 : 0.08;


        double kdvTutarı=fiyat*kdvOran;
        double kdvliTutar=fiyat+kdvTutarı;
        System.out.println("Kdv'siz tutar :" + fiyat);
        System.out.println("Kdv Oranı :" + kdvOran);
        System.out.println("Kdv Tutarı :" + kdvTutarı);
        System.out.println("Kdv'li Tutar :" + kdvliTutar);
    }

}
