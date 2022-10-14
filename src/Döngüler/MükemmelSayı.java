package Döngüler;

import java.util.Scanner;

public class MükemmelSayı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " Mükemmel Sayıdır");
        } else {
            System.out.println(number + " Mükemmel Sayı Değildir.");
        }
    }


}
