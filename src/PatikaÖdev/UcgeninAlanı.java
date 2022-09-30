package PatikaÖdev;

import java.util.Scanner;

public class UcgeninAlanı {
    public static void main(String[] args) {

        int a,b,c;
        double u,alan;


        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Üçgenin 1. dik Kenar uzunluğunu giriniz : ");
        a= scan.nextInt();
        System.out.print("Lütfen Üçgenin 2. dik Kenar uzunluğunu giriniz : ");
        b= scan.nextInt();
        System.out.print("Lütfen Üçgenin 3. dik Kenar uzunluğunu giriniz : ");
        c= scan.nextInt();

        u=(a+b+c)/2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));


        System.out.println("Üçgenin Alanı : " + alan);

    }
}
