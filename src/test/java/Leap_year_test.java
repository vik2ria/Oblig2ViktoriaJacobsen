import no.viktorij.oblig2.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Leap_year_test {

    @ParameterizedTest
    @MethodSource("year")
    public void is_the_year_a_leap_year(String expected, int input) {
        assertEquals(expected,
                LeapYear.isLeapYear(input));
    }

    public static Stream year() {
        return Stream.of(
                Arguments.of("The chosen year is a leap year", 2000),
                Arguments.of("The chosen year is a leap year", 1972),
                Arguments.of("The year is not a leap year", 1900)
        );
    }
}
