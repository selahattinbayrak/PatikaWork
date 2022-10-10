package Döngüler;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        int n,r;
        double kombinasyon;

        Scanner scan=new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplamak için C(n,r)\n" +
                "n değerini giriniz");
        n= scan.nextInt();
        System.out.println("r degerini giriniz");
        r= scan.nextInt();

        int n1=1;
        for (int i = 1; i <=n ; i++) {
            n1=n1*i;
        }
        System.out.println("n! = "+n1);

        int r1=1;
        for (int j = 1; j <=r; j++) {
            r1=r1*j;
        }
        System.out.println("r! = "+r1);

        int nrFark=n-r;

        int nrFark1=1;
        for (int k = 1; k <= nrFark; k++) {
            nrFark1=nrFark1*k;
        }
        System.out.println("(n-r)! = "+nrFark1);

        kombinasyon=n1/(r1*(nrFark1));
        System.out.println("C(n,r)=n!/(r!*(n-r)!) = " + kombinasyon);
    }
}
