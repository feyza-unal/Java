package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
//  Note: Switch de sadece int, byte, short, char, String data tipleri kullanilabilir
//  Note: Eger 3 den fazla durum varsa switch() tercih ederiz

//  Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz

        Scanner input = new Scanner(System.in);
        System.out.println("Islem icin sembol giriniz (+,-,*,/,%):");
        char islem = input.next().charAt(0);
        System.out.println("1. sayiyi girin:");
        double sayi1 = input.nextDouble();
        System.out.println("2. sayiyi girin:");
        double sayi2 = input.nextDouble();

        switch (islem){
            case '+':
                System.out.println("toplam: "+(sayi1+sayi2));
                break;
            case '-':
                System.out.println("fark: "+(sayi1-sayi2));
                break;
            case '*':
                System.out.println("carpim: "+(sayi1*sayi2));
                break;
            case '/':
                System.out.println("bölme: "+(sayi1/sayi2));
                break;
            case '%':
                System.out.println("yüzde "+((sayi1*sayi2)/100));
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");
        }

    }
}
