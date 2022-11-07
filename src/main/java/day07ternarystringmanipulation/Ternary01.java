package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
//Example 1: Bir sayinin pozitif olup olmadığını
//          ekrana yazdiran kodu yaziniz

// 1.Yol: if-else
    int a=12;
    if (a>0){
        System.out.println("pozitif");
    }
    else{
        System.out.println("pozitif degil");
    }

// 2. Yol: ternary
//                    condition  ?  true ise :  false ise
     String result  =   a>0      ? "pozitif" : "pozitif değil" ;
        System.out.println(result);

// example 2: iki sayıdan küçük olanı seçen kodu yazın

     int b=12;
     int c=23;
     int sonuc = b<c ? b : c;
        System.out.println(sonuc);
// example 3: verilen sayinin mutlak degerini hesaplayan kodu yazın
        int d = -45;
        int mutlak = d<0 ? d*(-1) : d;
        System.out.println(mutlak);

// example 4: Iki tane sayıyı aynı işaretli ise çarpın değilse "işlem yapamam" mesajı verin
        int e=12;
        int f=-10;
        Object isaret= ( e>0 && f>0 ) || ( e<0 && f<0 ) ? e*f : "islem yapamam";
        System.out.println(isaret);

// NOTE:  ternary farklı data tiplerinde sonuc return ederse sonucun data tipini "Object" yapın












    }

}
