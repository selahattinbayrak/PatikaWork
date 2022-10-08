package PatikaÖdev;

import java.util.Scanner;

public class CinZoydagı {
    public static void main(String[] args) {
        int birthYear, sonuc;
        System.out.print("Lütfen doğum yılınızı giriniz : ");
        Scanner scan=new Scanner(System.in);
        birthYear= scan.nextInt();
        sonuc=birthYear%12;

        switch (sonuc){
            case 0:
                System.out.print("Çin Zoydağı Burcunuz : Maymun");
                break;
            case 1 :
                System.out.print("Çin Zoydağı Burcunuz : Horoz");
                break;
            case 2 :
                System.out.print("Çin Zoydağı Burcunuz : Köpek");
                break;
            case 3 :
                System.out.print("Çin Zoydağı Burcunuz : Domuz");
                break;
            case 4 :
                System.out.print("Çin Zoydağı Burcunuz : Fare");
                break;
            case 5 :
                System.out.print("Çin Zoydağı Burcunuz : Öküz");
                break;
            case 6 :
                System.out.print("Çin Zoydağı Burcunuz : Kaplan");
                break;
            case 7 :
                System.out.print("Çin Zoydağı Burcunuz : Tavşan");
                break;
            case 8 :
                System.out.print("Çin Zoydağı Burcunuz : Ejderha");
                break;
            case 9 :
                System.out.print("Çin Zoydağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin Zoydağı Burcunuz : At");
                break;
            case 11 :
                System.out.print("Çin Zoydağı Burcunuz : Koyun");
                break;

        }


    }
}
