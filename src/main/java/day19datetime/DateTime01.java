package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

// ekrana anlık tarihi yazdırın
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate); //2022-10-21

// anlık zamanı yazdırın
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);  //20:52:57.441895


// anlık tarihi ve anlık zamanı ekrana yazdırın
        LocalDateTime currentDateTime= LocalDateTime.now() ;
        System.out.println(currentDateTime);  //2022-10-21T20:52:57.442099


// japonyadaki anlık tarihi ve anlık zamanı ekrana yazdırın
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);  //2022-10-22T02:52:57.442936


        LocalDateTime currentDateTimeInIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);  //2022-10-21T20:52:57.443060

// bugunden 789 gun sonra emekli olacağınıza göre, emeklilik tarihini hesaplayan kodu yazın
// kod başka zaman çalıştırıldığında doğru sonucu vermesi için bugünün tarihini sabit tutmalıyız
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate=countDate.plusDays(789);
        System.out.println(retireDate); //2024-12-18

// iki çocuğunuzun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız

        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        Long diff= ChronoUnit.DAYS.between(dobAli,dobVeli);
        //  between() methodu kullanılırken daha eski tarih öne yazılmalıdır
        System.out.println(diff); //2824

// İstanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız
// 29 mayıs 1453       29 ekim 1923

        LocalDate istanbulunFethi=LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulusu=LocalDate.of(1923,10,29);

        Long diff2= ChronoUnit.MONTHS.between(istanbulunFethi,cumhuriyetKurulusu);
        System.out.println(diff2); //5645

// verilen tarihin hangi burcta olduğunu gösteren kodu yazınız
        LocalDate myDate = LocalDate.of(1998,06,01);
        int day=myDate.getDayOfMonth();
        int month=myDate.getMonthValue();


        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }

/*
        if((day>20 && month==3) || (day<21 && month==4)){
            System.out.println("Koç Burcu");
        }
        if((day>20 && month==4) || (day<21 && month==5)){
            System.out.println("Boğa Burcu");
        }
        if((day>20 && month==5) || (day<22 && month==6)){
            System.out.println("İkizler Burcu");
        }
        if((day>21 && month==6) || (day<23 && month==7)){
            System.out.println("Yengeç Burcu");
        }
        if((day>22 && month==7) || (day<24 && month==8)){
            System.out.println("Aslan Burcu");
        }
        if((day>23 && month==8) || (day<24 && month==9)){
            System.out.println("Başak Burcu");
        }
        if((day>23 && month==9) || (day<24 && month==10)){
            System.out.println("Terazi Burcu");
        }
        if((day>23 && month==10) || (day<23 && month==11)){
            System.out.println("Akrep Burcu");
        }
        if((day>22 && month==11) || (day<22 && month==12)){
            System.out.println("Yay Burcu");
        }
        if((day>21 && month==12) || (day<21 && month==1)){
            System.out.println("Oğlak Burcu");
        }
        if((day>20 && month==1) || (day<20 && month==2)){
            System.out.println("Kova Burcu");
        }
        if((day>19 && month==2) || (day<21 && month==3)){
            System.out.println("Boğa Burcu");
        }

 */
    }
}

