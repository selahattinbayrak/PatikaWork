package Methodlar;

import java.util.Scanner;

public class C05_RecursiveDesen {
    static void desen(int n, int tempNumber, int k){

        if (n >0 && k==0) {
            System.out.print(n+" ");
            n-=5;
            desen(n, tempNumber,0);

        }else if (n<=0) {
            System.out.print(n+" ");
            n+=5;
            desen(n,tempNumber,1);

        }else if (n<=tempNumber && k==1) {
            System.out.print(n+" ");
            n+=5;
            desen(n,tempNumber,1);

        }
    }
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("N sayısı : ");
        int n= scan.nextInt();
        desen(n,n,0);

    }
}
