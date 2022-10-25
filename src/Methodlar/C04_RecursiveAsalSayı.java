package Methodlar;

import java.util.Scanner;

public class C04_RecursiveAsalSayı {
    static void isPrimeNumber(int n, int k) {
        if (n == k) {
            System.out.println(n + " sayısı ASALDIR");
            return;
        } else if (n % k == 0) {
            System.out.println(n + " sayısı ASAL değildir");
            return;
        }
        isPrimeNumber(n, k + 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = scan.nextInt();
        isPrimeNumber(n, 2);

    }
}
