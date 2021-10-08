package no.viktorij.oblig2;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year % 100 == 0 && year % 400 != 0)
            return false;

        if (year % 400 == 0)
            return true;

        return year % 4 == 0;
    }
}
