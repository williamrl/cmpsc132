//=======================================================================================
//	IST110		Fall 2023
//
//	Type in this Java program. Get it to work properly.
//	This is to be done in class.
//
//	Submit this code to Canvas, when finished.
//=======================================================================================

import java.util.*;

public class InClass_TypeIn_Java_Program_FrugalCalendar {
    final static int MIN_VALID_YEAR = 1700;
    final static int MAX_VALID_YEAR = 2022;
    public static void main (String[] args) {
        Scanner scn = new Scanner (System.in);
        int currDay = 1;
        int baseYear = MIN_VALID_YEAR + 1;
        boolean matchFound = false;
        int day = 1;
        int newYear, cntr = 0;
        boolean baseYearIsALeapYear;
        boolean newYearIsALeapYear;

        //-- Loop to allow user to try several different years.
        while ((baseYear >= MIN_VALID_YEAR) && (baseYear <= MAX_VALID_YEAR)) {
            baseYear = MIN_VALID_YEAR;

            //-- Loop until user enters a year within the constraints.
            while ((baseYear < MIN_VALID_YEAR) || (baseYear > MAX_VALID_YEAR)) {
                System.out.printf(("\n\nEnter a year from %d to %d:  "), MIN_VALID_YEAR, MAX_VALID_YEAR);
                baseYear = scn.nextInt();

                if ((baseYear < MIN_VALID_YEAR) || (baseYear > MAX_VALID_YEAR)) {
                    System.out.printf(null, args)
                }
            }
        }
    }
}