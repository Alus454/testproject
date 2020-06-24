package Homework_data_czas;

import java.time.Duration;
import java.time.LocalTime;

public class Exercise_13_mz_1 {

    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(14, 11);
        LocalTime time2 = LocalTime.of(18,41);
        Duration czas = Duration.between(time1,time2);
        System.out.println(czas);
    }
}
