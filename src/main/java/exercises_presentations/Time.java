package exercises_presentations;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Time {

    public static void dateNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDAteTime: " + localDateTime);
//        Instant now = Instant.now();
//        System.out.println("Instant: " + now);

    }

    public static void tokio() {
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Japan time: " + localDateTime);


    }

    public static void timeFormat() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println("data: " +formatter.format(localDateTime));


    }


    public static void main(String[] args) {
        dateNow();
        tokio();
        timeFormat();
    }
}
