package day03typecastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*
        JAVA PRIMITIVE'LERE METHODLAR EKLEYEREK YENİ BİR YAPI OLUŞTURUR
        BU YAPIYA "WRAPPER CLASS" DENİR

        PRIMITIVE       WRAPPER
            byte    ==>  Byte
            short   ==>  Short
           * int    ==>  Integer
            long    ==>  Long
            float   ==>  Float
            double  ==>  Double
            boolean ==>  Boolean
           * char   ==>  Character

        WRAPPERLAR NON-PRIMITIVE DİR
         */

        byte primitiveByte=12;

        //"primitiveByte" yazıp nokta koyduğumuzda method çıkmaz.
        // çünkü primitive'ler method içermez


        Byte wrapperByte=12;
        // "wrapperByte" yazip noktaya bastığımızda methodlar çıkar.
        // çünkü wrapperlar method içerir(non-primitive'dir)

        //Example: byte data type'ın en küçük ve en büyül değerini yazdırın

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        //Example: short, int, long data type'larının en büyük ve en küçük değerlerini yazdırın.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //Long.MAX_VALUE.sout DİYEREK DE YAZDIRIR

        // PRIMITIVE'LER NASIL WRAPPER YAPILIR (AUTOBOXING)

        float f1=13.99F;
        Float wrapperF1=f1;

        // WRAPPERLAR NASIL PRIMITIVE LERE ÇEVRİLİR (UNBOXING)

        Character w1 ='s';
        char primitiveW1 = w1;

        // AUTOBOXING VE UNBOXING JAVA TARAFINDAN OTOMATIK YAPILIR


    }
}
