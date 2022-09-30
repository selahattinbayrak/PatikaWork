package PatikaÖdev;

import java.util.Scanner;

public class VucutKitleİndeksi {
    public static void main(String[] args) {
        double boy, kg;

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz : ");
        boy=scan.nextDouble();
        System.out.print("Lütfen Kilonuzu giriniz : ");
        kg= scan.nextDouble();

        double vKitleIndeksi=kg/(boy*boy);
        System.out.print("VucutKitle İndeksiniz : " + vKitleIndeksi);
    }
}
