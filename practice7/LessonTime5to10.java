package practice7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class LessonTime5to10 {
    public static Scanner sc = new Scanner(System.in);
    public static LocalDateTime dateTime = LocalDateTime.now();

//    Lesson 5: Get time now of New York
    public static void timeNewYork() {
        LocalDateTime timeNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Time of New York: " + timeNewYork);
    }

//    Lesson 6: Get time now.
    public static void getTimeNow() {
        System.out.println("Now: " + dateTime);
    }

//    Lesson 7: Get the last day of the current month.
    public static void getLastDayCurrentMonth() {
        YearMonth yearMonthNow = YearMonth.now();
        LocalDate lastOfMonth = yearMonthNow.atEndOfMonth();
        System.out.println(" The last day of the current month: " + lastOfMonth);
    }

//    Lesson 8: Get the last day of the month.
    public static  void getLastDayOfMonth() {
        System.out.println("Inout the day: ");
        String month = sc.nextLine();
        try {
            LocalDate localDate = LocalDate.parse(month);
            System.out.println("The last of the month: " + localDate.lengthOfMonth());
        } catch (DateTimeParseException e) {
            System.out.println("Error format!");
            e.printStackTrace();
        }
    }

//    Lesson 9: The first/end day of week
    public static void firstDayOfWeek() {
        int day = dateTime.getDayOfWeek().getValue();
        LocalDateTime firstDay = dateTime.minusDays(day-1);
        LocalDateTime lastDay = dateTime.plusDays(7-day);
        System.out.println("The first day of the week" + firstDay);
        System.out.println("The last day of the week" + lastDay);

    }

//    Lesson 10: The first/end day of current month.
    public static void firstDayCurrentMonth() {
        TemporalAdjuster firstAdjuster = TemporalAdjusters.firstDayOfMonth();
        LocalDateTime firstDayOfMonth = dateTime.with(firstAdjuster);
        System.out.println("The first day of month: " + firstDayOfMonth);
        TemporalAdjuster endAdjuster = lastDayOfMonth();
        LocalDateTime lastDayOfMonth = dateTime.with(endAdjuster);
        System.out.println("The last day of month: " + lastDayOfMonth);

    }

    public static void main(String[] args) {
        System.out.println("Lesson 5: Get time now of New York");
        timeNewYork();

        System.out.println("Lesson 6: Get time now.");
        getTimeNow();

        System.out.println("Lesson 7: Get the last day of the current month.");
        getLastDayCurrentMonth();

        System.out.println("Lesson 8: Get the last day of the month.");
        getLastDayOfMonth();

        System.out.println("Lesson 9: The first/end day of week");
        firstDayOfWeek();

        System.out.println("Lesson 10: The first/end day of current month.");
        firstDayCurrentMonth();
    }
}
