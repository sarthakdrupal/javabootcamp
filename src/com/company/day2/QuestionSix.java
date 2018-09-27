package com.company.day2;

import java.util.Random;

public class QuestionSix {
    public static void main(String[] args) {
        try {
            Random random = new Random();
            int val = random.nextInt(10);
            if (val < 5) {
                int x = 9;
                int y = x / 0;
            }
            String string = null;
            string.toCharArray();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

}
