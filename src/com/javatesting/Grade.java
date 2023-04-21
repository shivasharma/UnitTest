package com.javatesting;

public class Grade {

    public String gradeLetter(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Number grade cannot be 0");
        }  if (grade < 60) {
            return "F";

        }  if (grade < 70) {
            return "D";

        }  if (grade < 80) {
            return "C";

        }  if (grade < 90) {
            return "B";

        } else {
            return "A";
        }

    }
    }

