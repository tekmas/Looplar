package day18_nestedForLoop;

import java.util.Scanner;

public class WhileLoop_2 {
    // Kullanicidan bir sayi alin ve
    // bu sayinın tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı girin");
        int input= scan.nextInt();
        // for loop ile de yapabiliriz ama biz
        // while loop ile yapalim
        int bolen=1;
        int sayac=0;
        while(bolen<=input){
            if (input % bolen == 0){
                System.out.print(bolen + " ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + " sayini bolen " + sayac + " adet sayi vardir");

    }
}
