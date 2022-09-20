package practice7;

import java.time.LocalDateTime;
import java.util.Calendar;

public class LessonTime1to4 {
//    Lesson1: Creat object "day" by class calendar.
    public static Calendar c = Calendar.getInstance();

//    Lesson 2: Get default calendar time.
    public static void showCalendar() {
        int cDay = c.get(Calendar.DAY_OF_MONTH);
        int cMonth = c.get(Calendar.MONTH);
        int cYear = c.get(Calendar.YEAR);
        int cHour = c.get(Calendar.HOUR);
        int cMinute = c.get(Calendar.MINUTE);
        System.out.println(cDay + "/" + (cMonth + 1) + "/" + cYear + " " + cHour + ":" + cMinute);
    }

//    Lesson 3: Get max of time from default calendar.
    public static void maxCalendar(){
        int maxCalendarDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int maxCalendarMonth = c.getActualMaximum(Calendar.MONTH);
        int maxCalendarHour = c.getActualMaximum(Calendar.HOUR);
        int maxCalendarMinute = c.getActualMaximum(Calendar.MINUTE);
        System.out.println("Day max of month: " + maxCalendarDay);
        System.out.println("Month max of year: " + maxCalendarMonth);
        System.out.println("Hour max of day: " + maxCalendarHour);
        System.out.println("Minute max of hour: " + maxCalendarMinute);
    }
//    Lesson 4: Get min of time from default calendar.
    public static void minCalendar(){
        int minCalendarDay = c.getActualMinimum(Calendar.DAY_OF_MONTH);
        int minCalendarMonth = c.getActualMinimum(Calendar.MONTH);
        int minCalendarHour = c.getActualMinimum(Calendar.HOUR);
        int minCalendarMinute = c.getActualMinimum(Calendar.MINUTE);
        System.out.println("Day min of month: " + minCalendarDay);
        System.out.println("Month min of year: " + minCalendarMonth);
        System.out.println("Hour min of day: " + minCalendarHour);
        System.out.println("Minute min of hour: " + minCalendarMinute);
    }

    LocalDateTime dateTime = LocalDateTime.now();
    public static void main(String[] args) {
//    Lesson 2: Get default calendar time.
        System.out.println("Now calender info: ");
        showCalendar();

//    Lesson 3: Get max of time from default calendar.
        maxCalendar();

//    Lesson 4: Get min of time from default calendar.
        minCalendar();
    }
}
