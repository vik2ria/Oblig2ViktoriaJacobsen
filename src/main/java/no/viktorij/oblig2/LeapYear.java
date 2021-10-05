package no.viktorij.oblig2;

public class LeapYear {

    public static String isLeapYear(int year) {
        String leapYearMessage = "The chosen year is a leap year";

        if (year % 100 == 0 && year % 400 != 0)
            return "The year is not a leap year";

        if (year % 400 == 0)
            return leapYearMessage;

        if (year % 4 == 0)
            return leapYearMessage;



        return "The year is not a leap year";
    }
}
