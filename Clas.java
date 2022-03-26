package day18_nestedForLoop;

public class Clas {
    public static void main(String[] args) {
        int sayi = 1234;
        int toplam=0;
        toplam+= sayi%10;
        sayi/=10;
        toplam+= sayi%10;
        sayi/=10;
        toplam+= sayi%10;
        sayi/=10;
        toplam+= sayi%10;
        sayi/=10;
        System.out.println(toplam  );
        if (sayi%2==0) {
            System.out.println("çift");
        }

        }
    }

