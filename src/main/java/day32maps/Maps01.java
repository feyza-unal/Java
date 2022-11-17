package day32maps;

import java.util.HashMap;

public class Maps01 {

// interview!!!
    //size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yazin
    // " I like to move it, move it" => I=1 like=1 to=1 move=2 it=2

    public static void main(String[] args) {
        String str="I like to move it, move it";

        //noktalama isaretlerini sil
        str = str.replaceAll("\\p{Punct}","");

        //kelimeleri almak icin split kullanalim
        String[] kelimeler = str.split(" ");

        HashMap<String,Integer> gorunum = new HashMap<>();
        for (String w:kelimeler) {
            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi==null) {
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(gorunum); //{move=2, like=1, I=1, to=1, it=2}

    }
}
