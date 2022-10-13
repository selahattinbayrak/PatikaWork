package Döngüler;

import java.util.Scanner;

public class KuvvetHesaplama {

    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

    public static void main(String[] args) {
        int n, sayac=0,sayac2=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz");
        n= scan.nextInt();

        System.out.println("4'ün kuvvetleri");

        for (int i = 1; i <=n; i*=4) {
            sayac+=1;
           System.out.println("4^"+(sayac-1)+"="+i);


        }

        System.out.println("5'in kuvvetleri");
        for (int i = 1; i <=n; i*=5) {
            sayac2 += 1;
            System.out.println("5^" + (sayac2-1) + "=" + i);
        }

    }
}
