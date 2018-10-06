package com.company.day4;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class QuestionNine {
    public static void main(String[] args) {
        //System.out.println(ZoneId.systemDefault());
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        //allZoneIds.forEach(e-> System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(e))));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        String formattedDate = localDateTime.format(DateTimeFormatter.ofPattern("yyy-MMMM-dd"));
        System.out.println(formattedDate);
    }
}
