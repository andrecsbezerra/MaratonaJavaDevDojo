package com.andrecsbezerra.maratonajava.javacore.datas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1744284796511L); //long representando os ms
        date.setTime(date.getTime() + (1000 * 60 * 60));
        System.out.println(date);
    }
}
