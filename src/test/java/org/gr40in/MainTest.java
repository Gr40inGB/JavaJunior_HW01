package org.gr40in;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void getAverageForEvenNumbers() {
        assertEquals(Main.getAverageForEvenNumbers(new BigDecimal(12), -12, 0.21, 24L), OptionalDouble.of(8.0));
        assertEquals(Main.getAverageForEvenNumbers(15), OptionalDouble.empty());
        assertEquals(Main.getAverageForEvenNumbers(-12.06), OptionalDouble.empty());
        assertEquals(Main.getAverageForEvenNumbers(2,10), OptionalDouble.of(6));
    }

    @Test
    void printAverageForEvenNumbers() {

    }
}
