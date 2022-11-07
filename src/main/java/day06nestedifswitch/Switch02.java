package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
/*
     Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz
 Note: toLowerCase() methodu bir String'deki tum character'leri kucuk harfe cevirir.
       toUpperCase() methodu bir String'deki tum character'leri buyuk harfe cevirir.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini girin");
        String ay = input.next().toLowerCase();     //büyük harflerle girilebilir diye küçük harfe çeviriyoruz

        switch (ay){
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "ağustos":
                System.out.println("ağustos");
            case "eylül":
                System.out.println("eylül");
            case "ekim":
                System.out.println("ekim");
            case "kasım":
                System.out.println("kasım");
            case "aralık":
                System.out.println("aralık");
                break;                              // bütün ayları yazdırmak için en son aralık ayına break koyduk
            default:
                System.out.println("gecerli ay ismi girin:");
        }















    }
}
