package day18_nestedForLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alip
        // while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı girin");
        int input= scan.nextInt();
        int sayi=1;
        while (sayi<input) {
            if (sayi < input-1) {
                System.out.print(sayi + ", ");
            }
             else  {
                System.out.print(sayi);
            }
             sayi++;
        }
        System.out.println("");
                // Ayni soruyu do-while loop ile yapalim
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi<input); //önce do çalıştığından koşulu sağlamasada 1 kere çalışır



    }

}
