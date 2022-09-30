package PatikaÖdev;

import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5, total;
        double aFiyat, eFiyat, dFiyat, mFiyat, pFiyat;
        double aKg, eKg, dKg, mKg, pKg;


        Scanner scan=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        aKg= scan.nextDouble();
        aFiyat=aKg*armut;

        System.out.print("Elma Kaç Kilo ? :");
        eKg= scan.nextDouble();
        eFiyat=eKg*elma;

        System.out.print("Domates Kaç Kilo ? :");
        dKg= scan.nextDouble();
        dFiyat=dKg*domates;

        System.out.print("Muz Kaç Kilo ? :");
        mKg= scan.nextDouble();
        mFiyat=mKg*muz;

        System.out.print("Patlıcan Kaç Kilo ? :");
        pKg= scan.nextDouble();
        pFiyat=pKg*patlıcan;

        total=(aFiyat+eFiyat+dFiyat+mFiyat+pFiyat);
        System.out.print("Toplam Tutar : " + total);


    }
}
