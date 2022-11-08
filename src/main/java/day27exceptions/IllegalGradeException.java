package day27exceptions;
//Eger Exception Class'a extend ederseniz sizin Class'iniz "Compile Time Exception" olur
public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);  //parent'ta bu mesajı kabul edecek constructor'ı kullan
    }

}

// kendi exception'ımızı oluşturduk