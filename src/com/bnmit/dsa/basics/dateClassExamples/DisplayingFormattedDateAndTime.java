package com.bnmit.dsa.basics.dateClassExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayingFormattedDateAndTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Date/Time before formatting: " + obj);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        // E -> Day of the week (Mon - Sun)
        // D -> Day of the year (366 Days including leap year)
        // d -> Date of the month (1-31)
        // MMM - Month Name (Jan - Dec)
        // MM - Month Number (1-12)
        String formattedDateTime = obj.format(format);
        System.out.println("Date/Time after formatting: " + formattedDateTime);
    }
}
