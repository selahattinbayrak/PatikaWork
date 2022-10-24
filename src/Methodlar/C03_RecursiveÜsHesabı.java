package Methodlar;

import java.util.Scanner;

public class C03_RecursiveÜsHesabı {
    static int power(int n, int k) {
        if (k == 0) {
            return 1;
        }
        int result = n * power(n, (k - 1));
        return result;
    }

    public static void main(String[] args) {
        int n, k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = scan.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = scan.nextInt();
        System.out.println("sonuç : "+power(n, k));

    }
}
