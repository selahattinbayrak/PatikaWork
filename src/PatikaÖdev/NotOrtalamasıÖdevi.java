package PatikaÖdev;

import java.util.Scanner;

public class NotOrtalamasıÖdevi {
    public static void main(String[] args) {

        int mat,fizik,kimya,türkçe,tarih,müzik;

        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat=scan.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=scan.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=scan.nextInt();

        System.out.print("Türkçe Notunuz: ");
        türkçe=scan.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih=scan.nextInt();

        System.out.print("Müzik Notunuz: ");
        müzik=scan.nextInt();

        int toplam=(mat+fizik+kimya+türkçe+tarih+müzik);
        double notOrtalaması=toplam/6;
        System.out.println("Not Orlaması : "+notOrtalaması);


        String sonuc = (notOrtalaması>=60) ? "Geçti" : "kaldı";
        System.out.println("Sonuç : "+sonuc);



    }
}
