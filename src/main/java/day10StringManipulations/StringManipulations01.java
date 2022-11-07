package day10StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
       String a= "Java kolaydir.";
       boolean b=a.startsWith("kola",5);
        System.out.println(b);

// startsWith("kola",5) kodu ilk 5 karakterden sonraki Stringe bakar
// o stringin "kola" ile başlayıp başlamadığını kontrol eder.

        String c=a.replaceFirst("a","*");
        System.out.println(c);

        String x=a.replaceAll("[A-Z]","#");
        System.out.println(x);

        String d=a.concat(" Anladin mi?");
        System.out.println(d);
// concat() methodu 2 stringi birbirine yapıştırmaya yarar.
// concatenation işlemi iki türlü yapılabilir
//      i) + ile
//      ii) concat() ile

//java bir method üretmişse o methodu kullanmak "best practice"dir.

        String e="      Tom Hanks       ";
        System.out.println("e = " + e);

        String f=e.trim();
        System.out.println("f = " + f);
// trim() methodu bir stringin baş ve sonundaki "space" karakterini siler, aradaki "space karakterlerine dokunmaz"


        String h="Java";
        String i="Java";
        int k=h.compareTo(i);
        System.out.println("k = " + k);

// comprateTo(i) kod iki tane    String'i alfabetik(lexicographic) olarak karşilaştirir.
// Buyuk harf e duyarilidir.
// Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i) kullanabilirsiniz.
// h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.

//a.repeat(5) kodu a stringini yan yana 5 kere yapıştırır
        String n=a.repeat(5);
        System.out.println("n = " + n);

// methodun üstüne gelip cmd'ye basılı tutarak methoda tıkladığımızda methodun içine girip özelliklerini açar



    }

}
