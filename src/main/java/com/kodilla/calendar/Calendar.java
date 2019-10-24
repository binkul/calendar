package com.kodilla.calendar;

import java.time.LocalDate;
import java.util.*;

public class Calendar {
    private static LocalDate date;

    private static void printDayNames() {
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
    }

    private static String formatDay(int day) {
        return day < 10 ? " 0" + day + " " : " " + day + " ";
    }

    private static void printFirstWeek() {
        int startDay = date.getDayOfWeek().getValue() - 1;
        StringBuilder firstWeek = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            if (i < startDay) {
                firstWeek.append("    ");
            } else {
                firstWeek.append(formatDay(date.getDayOfMonth()));
                date = date.plusDays(1);
            }
        }

        System.out.println(firstWeek.toString());
    }

    private static void printRestWeeks() {
        int month = date.getMonthValue();
        StringBuilder restWeeks = new StringBuilder();

        while (month == date.getMonthValue())
        {
            for (int i = 0; i < 7; i++) {
                restWeeks.append(formatDay(date.getDayOfMonth()));
                date = date.plusDays(1);
                if (month != date.getMonthValue()) {
                    break;
                }
            }
            restWeeks.append("\n");
        }

        System.out.println(restWeeks.toString());
    }

    public static void printCalendar(int month, int year) {
        date = LocalDate.of(year, month, 1);
        System.out.println(date.getMonth().name() + "-" + date.getYear());
        printDayNames();
        printFirstWeek();
        printRestWeeks();
    }
}
