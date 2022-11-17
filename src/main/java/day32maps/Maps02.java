package day32maps;

import java.util.HashMap;

public class Maps02 {

// interview!!!
    //size verilen bir kelimedeki harflerin kacar kere kullanildigini gosteren kodu yaziniz

    public static void main(String[] args) {

        String kelime = "abbcaa";
        HashMap<String,Integer> gorunum = new HashMap<>();

        String[] harfler = kelime.split("");
        for (String w:harfler){
            Integer harfSayisi = gorunum.get(w);
            if (harfSayisi == null){
                gorunum.put(w, 1);
            }else {
                gorunum.put(w, harfSayisi+1);
            }
        }
        System.out.println(gorunum); //{a=3, b=2, c=1}





    }
}
