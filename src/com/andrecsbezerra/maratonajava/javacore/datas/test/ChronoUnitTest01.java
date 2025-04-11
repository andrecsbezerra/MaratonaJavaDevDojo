package com.andrecsbezerra.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
//        Period p1 = Period.between(now, nowAfterTwoYears);
//        Period p2 = Period.ofDays(10);
//        Period p3 = Period.ofWeeks(58);
//        Period p4 = Period.ofMonths(3);
//        Period p5 = Period.ofYears(4);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())).getMonths());
//        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
//        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.YEARS));
//        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));

        LocalDateTime aniversario = LocalDateTime.of(2005, Month.JANUARY, 14,20,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.SECONDS.between(aniversario, now));
        System.out.println(ChronoUnit.MINUTES.between(aniversario, now));
        System.out.println(ChronoUnit.HOURS.between(aniversario, now));
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));

    }
}
