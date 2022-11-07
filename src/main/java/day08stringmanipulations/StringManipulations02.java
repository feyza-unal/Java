package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

//      replace() stringdeki herhangi bir karakteri veya karakterli değiştirmek için kullanılır
// example 1: stringdeki space haric kaç tane character kullanıldığını gosteren kodu yazın


        String str = "Ali okula gitti.";
        int num = str.replace(" ","").length();
        // "Aliokulagitti." olacak
        System.out.println("num = " + num);

// example 2: Stringdeki tüm 'a' harflerini 'A' ya çevirin

        String cumle = "Ankara nın taşına gözlerimin yasina bak.";
        String yeni = cumle.replace("a","A");
        System.out.println(yeni);


// example 3: stringdeki tüm "kara" kelimesinin yerine "*" koyun
        String s="Kara kara düşünme Ankara";
        String yenis = s.replace("kara","*");
        System.out.println("yenis = " + yenis);

// example 4: stringdeki tüm sayılara "*"a cevirin
        String stdId = "AC202117004";
       String yeniId = stdId.replaceAll("[0-9]","*"); //rakamlar yerine *
        System.out.println("yeniId = " + yeniId);

/*
    bir grup datayı ifade eden kodlara "regex" denir. (regular expressions:regex)

    1) tüm rakamlar -> [0-9]
    2) tüm küçük harfler -> [a-z]
    3) tüm büyük harfler ->[A-Z]
    4) tüm harfler -> [a-zA-Z]
    5) sesli harfler ->[aeiouAEIOU]
    6) space -> [ ]
    7) tüm rakamlar ve harfler [0-9a-zA-Z]
    8) tüm noktalama işaretleri \\p{Punct}

    1)Rakamlar hariç tüm karakterler ->[^0-9]
    2)küçük harfler hariç tüm karakterler ->[^a-z]
    3) Buyuk harfler haric tum characterler ==> [^A-Z]
    4) Tum harfler haric tum characterler ==> [^a-zA-Z]
    5) Space haric ==> [^ ]
 */

// example 5: stringde kullanılan noktalama işaretleri, rakamlar ve space hariç tüm karakterlerin yasını bulan kodu yazınız

       String u = "Ali 13 yasinda, dersem inanma!...";
       int sonuc =  u.
                     replaceAll("[0-9]","").
                     replace(" ","").
                     replaceAll("\\p{Punct}","").
                     length();

       System.out.println(sonuc);

//Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
//           i)Space haric en az sekiz karakter olmali
//           ii)En az 1 sembol icermeli
//           iii)En az 1 rakam icermeli
//           iv)En az 1 buyuk harf icermeli
//           v)En az 1 kucuk harf icermeli

        String pwd="B78c? K!m";
        boolean first = pwd.replace(" ","").length()>7;                //i- space'i sildik
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0; //ii- semboller dışındakileri sildik (Znin sonunda space var)
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;       //iii- rakamşar hariç sildik
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;      //iV- büyük harfler dışında sildik
        boolean fifth = pwd.replaceAll("['a-z]","").length()>0;        //V- küçük harfler dışında sildik

        boolean pwdGecerli = first && second && third && fourth && fifth;
        if (pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else
            System.out.println("Password'unuz gecerli degildir...");

//Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz

        String sss = "Sen yapmazsan, ben ?...";
        int sayiNoktalama = sss.replaceAll("[^\\p{Punct}]","").length();

        System.out.println("sayiNoktalama = " + sayiNoktalama);

//Example 8:Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
//         aksi halde "Normal" yazdirin.

        String v = "Kalex";
        boolean baslangıc = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangıc && bitis ? "Harika" : "Normal";
        System.out.println("result = " + result);

    }
}
