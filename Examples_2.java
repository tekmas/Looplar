package day18_nestedForLoop;

import java.util.Scanner;

public class Examples_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("başlangıç değerini girin");
        int bas = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("girdiğiniz sayıdan büyükbir sayı girin");
        int bitis = scan2.nextInt();
        if (bitis>bas){
            for (int i = bas; i <= bitis; i++) {
                if (i % 2 == 0) {
                    System.out.print( i + ",");
                }
            }
        }
        else  {
            while (bas > bitis || bas == bitis) {
                System.out.println("lütfen başlangıç değerini bitiş değerinden küçük giriniz");
                Scanner scan3 = new Scanner(System.in);
                System.out.println("başlangıç değerini girin");
                int ilk = scan3.nextInt();
                Scanner scan4 = new Scanner(System.in);
                System.out.println("bitiş değerini girin");
                int son = scan4.nextInt();
                if (son>ilk){
                    for (int i = bas; i <= bitis; i++) {
                        if (i % 2 == 0) {
                            System.out.print( i + ",");
                        }
                    }
                }
            }
        }
    }
}