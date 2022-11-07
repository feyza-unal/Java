package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Kara kara dusunme Ankara";
        int indexA = str.indexOf("kara");  //bulduğu ilk indeksi bize verir
        System.out.println(indexA);

        int lastIndexA = str.lastIndexOf("kara");
        System.out.println(lastIndexA);

        String s ="Mississipi";
        int idxI = s.indexOf('i');
        System.out.println(idxI);

        int idxIss1 = s.indexOf("iss");
        System.out.println(idxIss1);

        int idxIss2 = s.lastIndexOf("iss");
        System.out.println(idxIss2);


// EX 1: bir stringdeki karakterin tekrarli veya tekrarsız olup olmadığını yazın

        String t = "Helloooo";
        if (t.indexOf('o')==t.lastIndexOf('o')){
            System.out.println("tekrarsiz");
        }else{
            System.out.println("tekrarli");
        }

        String u ="Learn Java earn money";
        int idxU = u.indexOf("e",4);
        System.out.println(idxU);

        String m="Hello everyone!";
        int e=m.lastIndexOf( "e",7);
        System.out.println(e);

//  lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede
//  verilen sayiyi "index" olarak kabul edip en bastan
//  bu indexe kadar olan karakterleri bir kutu icine aliniz ve
//  lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.

        String v = "    ";
        boolean bosMu = v.isEmpty();
        System.out.println("bosMu = " + bosMu);
        String x = "    ";
        boolean blankMi = x.isBlank();
        System.out.println("blankMi = " + blankMi);

//EX 2: userdan alınan isim mutlaka space'den farklı en az bir karakter icermeli
        Scanner input=new Scanner(System.in);
        System.out.println("isminizi girin:");
        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("sana ismini gir dedim");
        }else{
            System.out.println(ilk);
        }



    }

}
