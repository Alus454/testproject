package Homework_data_czas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise_15_mz_1 {
    public static void main(String[] args) {
        LocalTime bydgoszcz = LocalTime.now(ZoneId.of("Europe/Warsaw"));
        System.out.println(bydgoszcz);
        LocalDateTime time = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY.MMMM.DD, hh:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy' roku,' EEEE hh:mm:ss", new Locale("pl"));
//        System.out.println(formatter);
        System.out.println(time.format(formatter2));
    }
}
//3 lutego 2018 roku, sobota 22:22:27