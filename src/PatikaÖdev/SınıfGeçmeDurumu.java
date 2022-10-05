package PatikaÖdev;

import java.util.Scanner;

public class SınıfGeçmeDurumu {
    public static void main(String[] args) {
        int mat, fizik,türkce,kimya,müzik, dersSayisi=5;

        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat=scan.nextInt();
        if (mat<0 || mat>100){
            mat=0;
            dersSayisi--;
        }


        System.out.print("Fizik Notunuz : ");
        fizik=scan.nextInt();
        if (fizik<0 || fizik>100){
            fizik=0;
            dersSayisi--;
        }

        System.out.print("Türkçe Notunuz : ");
        türkce=scan.nextInt();
        if (türkce<0 || türkce>100){
            türkce=0;
            dersSayisi--;
        }

        System.out.print("Kimya Notunuz : ");
        kimya=scan.nextInt();
        if (kimya<0 || kimya>100){
            kimya=0;
            dersSayisi--;
        }

        System.out.print("Müzik Notunuz : ");
        müzik=scan.nextInt();
        if (müzik<0 || müzik>100){
            müzik=0;
            dersSayisi--;
        }

        double avarage =(mat+fizik+türkce+kimya+müzik) / dersSayisi;

        if (avarage<=55 ){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");

        } else{
            System.out.println("Tebrikler, sınıf geçtiniz !");
        }
        System.out.println("Ortalamanız : " + avarage);
    }
}
