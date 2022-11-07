package day06nestedifswitch;

public class NestedIf01{
    public static void main(String[] args) {
/*
      Password'un ilk harfi buyuk harf ise
      'A' olursa gecerli password aksi halde gecersiz password
      Password'un ilk harfi kucuk harf ise
      'z' olursa gecerli password aksi halde gecersiz password

Note: Java "nested" kodlari calistirirken cok zaman harcar,
      buna "Time Complexity" denir.Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.
*/

        String pswd = "Axy12!";
        if (pswd.charAt(0)>='A' && pswd.charAt(0)<='Z') {

            if (pswd.charAt(0) == 'A') {
                System.out.println("gecerli password");
            } else
                System.out.println("gecersiz password");

        }else if(pswd.charAt(0)>='z' && pswd.charAt(0)<='z'){
            if (pswd.charAt(0) == 'z') {
                System.out.println("gecerli password");
            } else
                System.out.println("gecersiz password");

        }else
            System.out.println("Ilk karakter harf olmalıdır");


    }
}
