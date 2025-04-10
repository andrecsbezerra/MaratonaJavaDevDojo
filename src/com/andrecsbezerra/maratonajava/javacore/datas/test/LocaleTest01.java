package com.andrecsbezerra.maratonajava.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeIT = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIN = new Locale("hi", "IN");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeNL = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeIT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIN);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJP);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeNL);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("Hindi: " + df3.format(calendar.getTime()));
        System.out.println("Japonês: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));

        System.out.println(localeIT.getDisplayCountry(localeJP));
        System.out.println(localeCH.getDisplayCountry(localeIT));

    }
}
