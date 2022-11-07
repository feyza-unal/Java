package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

//Ex1: Bir stringdeki "m" karakteri hariç tum karakterleri yazdırın
        String str="Andromeda";
        for (int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if (c!='m' && c!='M'){
                System.out.print(c);
            }
        }
        System.out.println();
// 2.yol
        for (int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if (c=='m'){
                continue;
            }
            System.out.print(c);
        }

        System.out.println();
// Continue olunca devamındaki kodlar çalışmaz. artırmaya geri döner
// loop'un çalışmamasını istersek continue kullanırız

// Ex3: 1den 100e kadar 6 ile bölünenler haric tum tamsayıları ekrana yazdırın
        for (int i=1; i<=100; i++){
            if (i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();
//Ex4: Verilen stringdeki 'm' den önceki karakterleri yazdırınız

        String str2="Luxemburg";
        for (int i=0; i<str2.length(); i++){
            char c=str2.charAt(i);
            if (c=='m'){
                break;
            }
            System.out.print(c);
        }








    }
}
