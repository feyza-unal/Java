package day13loopsarrays;

import java.util.Scanner;

public class DowhileLoop01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
/*
example 1 kullanıcıdan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz
aksi halde ekrana kaybettin yazdiriniz
kullanici kazandikca oyun devam etmeli
 */

        int sayi=0;
        do {
            System.out.println("Bir sayi giriniz: ");
            sayi=input.nextInt();

            if (sayi<100){
                System.out.println("Kazandiniz..");
            }
            else{
                System.out.println("Kaybettiniz");
            }

        }while(sayi<100);


/*
example 2 kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz
 */

        do{
            System.out.println("Isim giriniz");
            char ilkHarf = input.next().charAt(0);
            if (ilkHarf>='A' && ilkHarf<='Z') {
                System.out.println("Ismi basariyla girdiniz...");
            }else{
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir...");
                break;
            }

        }while (true); //break ile döngüyü kırmasaydık sonsuz döngü olurdu
//infinite loop: sonsuz döngü

// arttıma azaltma kısmında hata yapılırsa "infinite loop" oluşur






















    }

}
