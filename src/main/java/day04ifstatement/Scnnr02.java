package day04ifstatement;

import java.util.Scanner;

public class  Scnnr02 {
    //Example: Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz
//           Ali Can ==> AC

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

         /*
        System.out.println("isminizi girin:");
        char ilk = input.next().charAt(0);

        System.out.println("soyisminizi girin:");
        char son = input.next().charAt(0);

        System.out.println(""+ ilk + son);


        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
     Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
      Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
         */

        // 2. YOL

        System.out.println("tam isminizi girin: ");
        String tamIsim = input.nextLine();

        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);






    }  }