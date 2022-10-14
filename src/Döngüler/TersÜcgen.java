package Döngüler;

import java.util.Scanner;

public class TersÜcgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Basamak Sayısı giriniz :");
        int basSayı=scan.nextInt();

        for (int i = basSayı; i >0 ; i--) {
            for (int k = 1; k <= (basSayı - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
