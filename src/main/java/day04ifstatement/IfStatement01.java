package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

// Example: sayi pozitifse ekrana pozitif yazdırın
        int s = 12;
        if (s>0){
            System.out.println("pozitif");
        }

// example: verilen karakter büyük harf ise ekrana büyük harf yazdırın

        char ch='A';
        if (ch>='A' && ch<='Z'){
            System.out.println("buyuk harf");

            //example: verilen sayi uc basamakli ise ekrana uc basamakli yazdirin
            int sayi=-123;

            sayi=Math.abs(sayi);
            if (sayi>99 && sayi<1000){ //>=100 yazdığımızda 2 işlem yapacağı için daha yavaş çalışır
                System.out.println("uc basamakli");
            }
//example: verilen sayı çift ise ekrana çift yazdır

            int num=34;
            if (num%2==0){
                System.out.println("cifttir");

            }

        }
//example: verilen sayi 300den küçük veya 1200den büyükse ekrana harika sayi yazdirin

        int x=2000;
        if (x<300 || x>1200 ){
            System.out.println("harika sayi");
        }








    }
}
