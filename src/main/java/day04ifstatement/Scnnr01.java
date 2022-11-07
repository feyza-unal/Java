package day04ifstatement;

import java.util.Scanner;

public class Scnnr01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

/*      System.out.println("ilk adinizi girin: ");
        String ilkIsim = input.next();

        System.out.println("orta isminizi varsa griin: ");
        String ortaIsim = input.next();

        System.out.println("soy isminizi yazin: ");
        String soyIsim = input.next();

        System.out.println("kimlik numaranizi giriniz: ");
        String kimlik = input.next();

         System.out.println(ilkIsim+" "+ortaIsim+" "+soyIsim);
         System.out.println(kimlik);

         // 2.YOL
        System.out.println("isminizi, soyadinizi ve kimlik girin:");
        String ilk=input.next();
        String orta=input.next();
        String  soy=input.next();
        String kimlik=input.next();

        System.out.println(ilk+" "+orta+" "+soy);
        System.out.println(kimlik);

*/       // 3.YOL
        System.out.println("isminizi ve soy isminizi girin:");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);


    }
}
