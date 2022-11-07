package day03typecastingwrapperscanner;

public class TypeCasting01 {
//Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
//              byte < short < int < long < float < double
//Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
//Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

    public static void main(String[] args) {
        byte age=23;
        int newAge=age;

        long population = 1234;
        int newPopulation=(int)population;


        // example1: shortu double a çeviren kodu yazın

        short num1=231;
        double newNum1=num1;

        // example2: floatı byte yapan kodu yazın

        float num2=4.5F;
        byte newNum2=(byte)num2;

        // JAVA ONDALIK SAYIYI TAM SAYIYA ÇEVİRİRKEN ONDALIK KISMINI SİLER


        int number = 515;
        byte newNumber=(byte)number;
        System.out.println(newNumber);
        //byte -128...127 arasıdır (toplam 256) . 515i byte atmak için
        // 515/256=> kalan 3tür
        //kod 3 yazdırır


    }

}
