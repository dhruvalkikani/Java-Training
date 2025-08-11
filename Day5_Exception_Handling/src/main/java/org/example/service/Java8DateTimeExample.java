package org.example.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Java8DateTimeExample {
    public static void main(String[] args) {
        // Get current date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        // Get current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date & Time: " + currentDateTime);

        // Format the current date in a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Get current date and time with zone information
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Zoned Date & Time (Asia/Kolkata): " + zonedDateTime);

        // Get current instant (timestamp)
        Instant nowInstant = Instant.now();
        System.out.println("Current Instant: " + nowInstant);

        // Create a Duration of 5 hours, 30 minutes
        Duration duration = Duration.ofHours(5).plusMinutes(30);
        System.out.println("Duration of 5 hours 30 minutes: " + duration);

        // Add duration to current date-time
        LocalDateTime futureDateTime = currentDateTime.plus(duration);
        System.out.println("Date & Time after duration: " + futureDateTime);
    }
}
