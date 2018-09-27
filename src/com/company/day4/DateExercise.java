package com.company.day4;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateExercise {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YY");
        System.out.println(simpleDateFormat.format(Calendar.getInstance().getTime()));
        System.out.println((simpleDateFormat.format(simpleDateFormat.parse("04/12/18"))));

    }
}
