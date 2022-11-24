package collections;

import java.util.HashMap;
import java.util.Scanner;

public class example_2 {
    public static void main(String[] args) {
/* 1- Kullanıcıdan bir kişinin kimlik numarasını(4 haneli), tam ismini, adresini , telefonunu alın.
2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
4- Tüm kullanicilarin isimlerini ekrana yazdıralım
 */
        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String secim = "";
        do {
            HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.println("Adinizi soyadinizi giriniz ");
            kisiBilgileri.put("tam isim", input.nextLine());//kullanicidasn alinan isim direk map'e atandi
            System.out.println("Adresinizi giriniz");
            kisiBilgileri.put("adres", input.nextLine());
            System.out.println("Lutfen telefon numaranizi giriniz");
            kisiBilgileri.put("telefon", input.nextLine());

            System.out.println("Kimlik no giriniz ");
            kisiListesi.put(input.nextInt(), kisiBilgileri);//TC'yi kisiListesi map'ine ekledik

            input.nextLine();//DUMMY

            System.out.println("kisiBilgileri" + kisiBilgileri);
            System.out.println("kisiListesi" + kisiListesi);
            System.out.println("Devam etmek istiyormusunuz E/H ");
            secim = input.nextLine();
        } while (secim.equalsIgnoreCase("E"));
        System.out.println("Gormek istediginizi kisinin TC numarasini giriniz ");
        System.out.println(kisiListesi.get(input.nextInt()));


        }

}