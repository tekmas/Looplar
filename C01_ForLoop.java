package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        Scanner scan =new Scanner(System.in);
        System.out.println("10dan küçük bir tamsayı girin");
        int sayi = scan.nextInt();
        int faktoryel =1;
        for (int i = 1; i <=sayi ; i++) {
            if (i==sayi){
                System.out.print(i);
            }
            else {
                System.out.print((i*faktoryel)+"*");
            }
        }
    }
}
