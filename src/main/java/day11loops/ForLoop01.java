package day11loops;
import java.util.Scanner;
public class ForLoop01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

// Ex1: 3den 6ya kadar tamsayiların toplamını bulan kodu yazın
        int sum=0;
        for ( int i=3 ; i<7 ; i++ ){
            sum = sum+i;
        }
        System.out.println(sum);

// Note: System.out.println(sum); loop'un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir
//       System.out.println(sum); loop'un icine yazilirsa her bir loop için "sum"in hangi degerlerini aldigini yazdirir.

// Ex2: 6dan 3e kadar tamsayiların çarpimini bulan kodu yazın
        int multiply=1;
        for ( int i=6 ; i>2 ; i--) {
            multiply=multiply*i;
        }
        System.out.println(multiply);

// Ex3: Verilen tamsayının rakamları toplamını bulun.
        int num = -385;
        num=Math.abs(num);
// sayı artık negatifler içinde çalışır
        int sonuc=0;
        for (int i=385; i>0; i=i/10){
            sonuc = sonuc + i%10;
        }
        System.out.println("sonuc = " + sonuc);

// Ex4: verilen stringi ters çeviren kodu yazın. (interview)
        String str= "Kaba";
        String ters="";
// concatenation yapılacaksa "" kullan.
        for (int i = str.length()-1 ; i >= 0 ; i--){
           char c=str.charAt(i);
           ters=ters+c;
        }
        System.out.println("ters = " + ters);
// 2.yol
        for (int i = str.length()-1; i>=0; i-- ){
            System.out.print(str.charAt(i));
        }









    }
}
