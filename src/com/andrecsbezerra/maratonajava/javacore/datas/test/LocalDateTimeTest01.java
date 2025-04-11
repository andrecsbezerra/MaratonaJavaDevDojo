package com.andrecsbezerra.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDate date = LocalDate.of(2022,8,6);
//        LocalTime time = LocalTime.of(9, 45, 0);
        LocalDate date = LocalDate.parse("2025-01-01");
        LocalTime time = LocalTime.parse("00:00:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
