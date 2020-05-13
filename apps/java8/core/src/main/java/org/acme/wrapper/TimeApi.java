package org.acme.wrapper;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZoneId;

public class TimeApi {
    

    public static void main(String args[]) {

        final MonthDay birthday = MonthDay.of(Month.JULY, 4);
        System.out.println(birthday);
        
        LocalDate today = LocalDate.now();
		System.out.println("Current Date="+today);
		
		LocalDate covidDate = LocalDate.of(2019, Month.DECEMBER, 8);
		System.out.println("Covid-19 Date=" + covidDate);
		
        LocalTime now = LocalTime.now();
		System.out.println("Current Time=" + now);

        LocalTime nowTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Now I Tokyo: " + nowTokyo);

        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println("Today Date Time=" + todayDateTime);

        Instant timestamp = Instant.now();
        System.out.println("Current Timestamp: " + timestamp);
        
        final Duration minutes = Duration.ofMinutes(3);

        System.out.println("Now it is: " + LocalTime.now() + " finish: " + LocalTime.now().plus(minutes));
        
        System.out.println(today.isBefore(covidDate));

        LocalDate thisBirthday = LocalDate.of(2020, Month.JULY, 4);

        Period p = Period.between(thisBirthday, today);

        System.out.println(p);
        System.out.println(p.getDays());

    }

}