package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

/*
        verilen yılın "leap year" olup olmadığını kontrol eden kodu yazın
        i) Yıl 100'e bölünürse 400e de bölünmelidir     ->1600+  1800-
        ii) Yıl 100'e bölünmezse 4e bölünmelidir        ->1996+  2001-
 */
        int year = 2022;
        String leapYear = year%100==0 ? (year%400==0 ? "leap year" : "leap year degil") :  (year%4==0 ? "leap year" : "leap year degil");
        System.out.println(leapYear);

/*
     Aşağıdaki kurallara göre passwordun geçerli olup olmadığını kontrol eden kodu yazın
       i)8 karakterden fazla  veya 8 karakter varsa ilk harfi 'i' olmalıdır
       ii) 8den az kar. varsa ilk harfi 'K' olmalı


        String pwd = "i2a3ed54";
        char ilkharf=pwd.charAt(0);
        String pwdSonuc = pwd.length()<8 ? (ilkharf=='K'? "gecerli": "gecersiz" ) : (ilkharf=='i' ?"gecerli" : "gecersiz");
        System.out.println(pwdSonuc);


 */






    }
}
