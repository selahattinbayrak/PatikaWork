package Döngüler;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scan.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = scan.nextInt();
        int ebob = 1;
        int ekok = 1;
        int i = 1;
        int k = 1;

        if (n1 > n2) {
            i = n2;
        } else {
            i = n1;
        }

        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }

        /*
        ekok=(n1*n2)/ebob;
         */
        System.out.println("ebob : " + ebob);
        System.out.println("ekok : " + ekok);

    }
}
