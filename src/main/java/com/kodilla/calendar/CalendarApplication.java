package com.kodilla.calendar;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalendarApplication {

    public static void main(String[] args) {
        Calendar.printCalendar(10, 2019);
        Calendar.printCalendar(11, 2019);
        Calendar.printCalendar(12, 2019);
    }

}
