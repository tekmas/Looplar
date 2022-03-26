package day18_nestedForLoop;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");

        }

        for (int i = 100; i <=999 ; i++) {
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.print(i+" ");
            }
        }
    }
}