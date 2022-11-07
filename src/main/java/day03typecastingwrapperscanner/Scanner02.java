package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
//Example: Sayiları kullanıcıdan alan ve toplama işlemi yapan kodu yazın

        Scanner giris = new Scanner(System.in); //giris yerine  çoğu kişi input  kullanır

        System.out.println("ilk sayiyi girin:");
        double sayi1 = giris.nextDouble();      //nextdouble kullanıcıdan sayiyi alır

        System.out.println("ikinci sayiyi girin:");
        double sayi2 = giris.nextDouble();

        System.out.println(sayi1+sayi2);

    }


}
