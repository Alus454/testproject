package Homework_data_czas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercise_12_mz_1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 01, 01);
        LocalDate date2 = LocalDate.of(2017, 05, 05);
        Period p = Period.between(date, date2);
        long p2 = ChronoUnit.DAYS.between(date, date2);
        System.out.println("Years: " + p.getYears() + " Months: " + p.getMonths() + " Days: " + p.getDays());
        System.out.println("Together days: "+ p2);
    }
}
