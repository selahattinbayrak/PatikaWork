package Döngüler;

import java.util.Scanner;

public class MinMaxDeğerBulma {
    public static void main(String[] args) {
        int n, number, maxNumber = 0, minNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        n = input.nextInt();


        for ( int i = 1; i <= n; i++) {
            System.out.print(i + ".sayıyı giriniz : ");
            number = input.nextInt();

            if (number < minNumber) {
                minNumber = number;
            }
            else if (number > maxNumber) {
                maxNumber = number;
            }


        }
        System.out.println("En buyuk sayi: " + maxNumber);
        System.out.println("En kucuk sayi: " + minNumber);

    }
}
