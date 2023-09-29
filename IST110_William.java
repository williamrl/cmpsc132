//=======================================================================================
//	IST110		Fall 2023
//
//	Type in this Java program. Get it to work properly.
//	This is to be done in class.
//
//	Submit this code to Canvas, when finished.
//=======================================================================================

import java.util.*;

public class IST110_William {
    final static int MIN_VALID_YEAR = 1700;
    final static int MAX_VALID_YEAR = 2022;
    public static void main (String[] args) {
        Scanner scn = new Scanner (System.in); //never closed
        int currDay = 1; //never used?
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

                if ((baseYear < MIN_VALID_YEAR) || (baseYear > MAX_VALID_YEAR))
                    System.out.println("Input Error> enter an invalid year.");
                else {
                    matchFound = false;
                    day = 1;
                    newYear = baseYear;
                    baseYearIsALeapYear = (baseYear % 4) == 0;
                    cntr = 0;

                    //-- main to loop to solve the problem.
                    while (!matchFound) {
                        newYear++;
                        cntr++;
                        
                        day = (day % 7) + 1;

                        newYearIsALeapYear = (newYear % 4 == 0);
                        if (newYearIsALeapYear){
                            day = (day % 7) + 1;
                        }
                        System.out.printf("%2d) Base = [%d, %5s], New =[%d, %5s] <%d>.\n", cntr, baseYear, baseYearIsALeapYear, newYear, newYearIsALeapYear, day);

                        if((day == 1) && (baseYearIsALeapYear == newYearIsALeapYear))
                            matchFound = true;
                    }
                
                    System.out.printf("\n---> Calandar %d can be used again in year %d. \n", baseYear, newYear);
                }
            }
        }
        return;
    }
}