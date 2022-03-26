package day17_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("1 harf girin");
        char ilkHarf = scan.next().charAt(0);
        System.out.println("2. harfi girin");
        char sonHarf = scan.next().charAt(0);
        if (ilkHarf < sonHarf) {
            for (char i = ilkHarf; i <= sonHarf; i++) {
                System.out.println(i);
            }
        }
        else if (ilkHarf > sonHarf){
            for (char i = sonHarf; i <= ilkHarf; i++) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("2 harfde aynı");
        }
    }
}
