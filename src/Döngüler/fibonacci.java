package Döngüler;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayisi girin: ");
        int n = input.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print("0 1");
        for (int i = 1; i < n; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
