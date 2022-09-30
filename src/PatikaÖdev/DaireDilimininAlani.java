package PatikaÖdev;

import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        double pi=3.14, a, r;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz");
        r= scan.nextDouble();
        System.out.println("Lütfen daire diliminin merkez açısını giriniz");
        a= scan.nextDouble();

        double alan=(pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı : " + alan);
    }
}
