package com.company.day4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class QuestionEight {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-YYYY-W-E");
        System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
    }
}
