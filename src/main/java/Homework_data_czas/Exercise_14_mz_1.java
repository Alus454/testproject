package Homework_data_czas;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exercise_14_mz_1 {
    public static void main(String[] args) {
        LocalDateTime tokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyo);

    }
}
