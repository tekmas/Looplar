package day18_nestedForLoop;

import java.util.Scanner;

public class C10_While {
    public static void main(String[] args) {
        // ) Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println(" lütfen bir sayı girin ");
        int input = scan.nextInt();
        int rakam=0;
        int rakamlartoplami=0;
        while(input>0){
            rakam=input%10;
            rakamlartoplami += rakam;
            input/=10;
        }
        System.out.println("girilen sayının rakamları toplamı: "+rakamlartoplami);
    }
}
