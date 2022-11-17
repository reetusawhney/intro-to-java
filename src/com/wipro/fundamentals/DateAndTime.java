package com.wipro.fundamentals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args){
        //print current date/time
//        System.out.println((LocalDate.now()));
//        System.out.println((LocalTime.now()));
//        System.out.println((LocalDateTime.now()));

        // create custom date
//        LocalDate date = LocalDate.of(2025,12,31);
//        LocalDate date1 = LocalDate.of(2050,01,18);
//        LocalDate date2 = LocalDate.of(2024, Month.JANUARY,22);
//
//        System.out.println(date);
//        System.out.println(date1);
//        System.out.println(date2);

        // Create CUSTOM time
//        LocalTime time = LocalTime.of(18,30,5);
//        System.out.println(time);

        // Exception and other date/time manipulation
//        LocalDate date = LocalDate.of(2022,13, 15);
//        System.out.println(date);

       LocalDate date = LocalDate.of(2024,5,01);
//        //Immutability -dates are immutable.
//        date.plusDays(1); //results get lost
//        date = date.plusDays(1);// Immutability - dates are Immutable
//        System.out.println(date);

        // get the day of the week
//        System.out.println(date.getDayOfWeek());

        // date/time formatting
//        LocalDate date =LocalDate(date);
//        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM-dd-yyyy");
//        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MMMM-dd~yyyy");
//        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("M/d/y");
//        System.out.println(date.format(formatter));

//        LocalTime time= LocalTime.of(4,15,20);
//        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("hh.mm.ss");
//        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("h.m.s");
//        System.out.println(time.format(formatter));

        LocalDate date1 = LocalDate.of(2022, 10, 25);
        DateTimeFormatter formatter =     DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(date1.format(formatter));

    }
}
