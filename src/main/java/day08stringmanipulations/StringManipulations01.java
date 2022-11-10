package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
// example 1) userdan aldığınız ismin ilk ve son harfini yazdırın

        Scanner input = new Scanner(System.in);
/*        System.out.println("lütfen isminizi girin:");
        String isim = input.next();
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);

        System.out.println(""+ilkHarf+sonHarf);                           // hocanın kodu
        System.out.println("ilk harf:"+ilkHarf+" "+"son harf:"+sonHarf);


//2.yol
        String ilk = isim.substring(0,1);
        String son = isim.substring(isim.length()-1);
        System.out.println(ilk+son); // başa "" koymamıza gerek yok

//example 2) verilen stringdeki hayvan isimlerini ekrana yazdırın
//         "Ben kedi eşim tavuk oğlum inek sever"

        String str="Ben kedi, eşim köpek, oğlum sever tavşan";
        String kedi = str.substring(4,8);
        String kopek = str.substring(15,20);
        String tavsan = str.substring(34);
        System.out.println(kedi+" "+kopek+" "+tavsan);

// yazılan code sadece bazı durumlar için çalışırsa o code'a "HARD CODING" denir (ölü kod)
// yazılan code her durum için çalışırsa o koda "DYNAMIC CODING" denir.
// substring() in 2 kullanımı vardır.
//    i)substring( başlangıç indeksi, bitiş indeksi) stringin ortasından bir parça almaya yarar
//    ii))substring( başlangıç indeksi) stringi indexten sonuna kadar almaya yarar
*/
// example 3)ilk isim ve soy isim içeren isimlerdenilk ve soyismin baş harflerini yazdırın

        //1.yol
        System.out.println("Ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0, 1);

        String b = tamIsim.split(" ")[1].substring(0, 1);

        System.out.println(a + b);






    }

}

