import no.viktorij.oblig2.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Leap_year_test {

    /* this test checks one of the criteria
     for a year not to be a leap year. The wanted result is false*/
    @ParameterizedTest
    @MethodSource("year")
    public void is_year_divisible_by_100_and_not_400(boolean expected, int input) {
        assertEquals(expected,
                LeapYear.isLeapYear(input));
    }

    // use a stream to check multiple input values
    public static Stream year() {
        return Stream.of(
                Arguments.of(false, 1700),
                Arguments.of(false, 1900),
                Arguments.of(true, 2000),
                Arguments.of(false, 2100)

        );
    }

    // check if the year is divisible by 400
    @ParameterizedTest
    @MethodSource("year_divide_400")
    public void is_year_divisible_by_400(boolean expected, int input) {
        assertEquals(expected,
                LeapYear.isLeapYear(input));
    }

    public static Stream year_divide_400() {
        return Stream.of(
                Arguments.of(true, 1600),
                Arguments.of(false, 1900),
                Arguments.of(true, 2000),
                Arguments.of(false, 2100)

        );
    }

    //check if the year is divisible by 4
    @ParameterizedTest
    @MethodSource("year_divide_4")
    public void is_the_year_divisible_4(boolean expected, int input) {
        assertEquals(expected,
                LeapYear.isLeapYear(input));
    }

    public static Stream year_divide_4() {
        return Stream.of(
                Arguments.of(true, 1972),
                Arguments.of(false, 1999),
                Arguments.of(true, 2000),
                Arguments.of(false, 2102)

        );
    }
}
