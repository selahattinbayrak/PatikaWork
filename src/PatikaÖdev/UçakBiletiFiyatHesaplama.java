package PatikaÖdev;

import java.util.Scanner;

public class UçakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double mesafeUcret=0.10, gidisDönüşİndirimi=0,indirimliTutar = 0,toplamTutar=0,normalTutar;
        double yasIndirim,yasIndirim12=0.5,yasİndirim12_24=0.10,yasİndirim65=0.3, gidişDönüşInd=0.2;
        boolean isError=false;

        Scanner scan=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe= scan.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas= scan.nextInt();
        System.out.println("Yolculuk Tipini Giriniz\n1=> Tek Yön\n2=> Gidiş Dönüş");
        yolculukTipi= scan.nextInt();



        if ((mesafe>0 & yas>0) & (yolculukTipi>=1 && yolculukTipi<=2)){
            normalTutar=mesafe*mesafeUcret;
            if (yas<12) {
                yasIndirim=normalTutar*yasIndirim12;
                indirimliTutar=normalTutar-yasIndirim;
            } else if (yas>=12 && yas<=24) {
                yasIndirim=normalTutar*yasİndirim12_24;
                indirimliTutar=normalTutar-yasIndirim;
            } else if (yas<65 && yas>24) {
                indirimliTutar=normalTutar;
            } else if (yas>=65){
                yasIndirim=normalTutar*yasİndirim65;
                indirimliTutar=normalTutar-yasIndirim;


            }
            if (yolculukTipi==2){
                gidisDönüşİndirimi=indirimliTutar*gidişDönüşInd;
            }
            toplamTutar=(indirimliTutar-gidisDönüşİndirimi)*2;

        }else {
            isError=true;
        }

        if (isError){
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            System.out.println("Toplam Tutar : " + toplamTutar);
        }
    }
}
