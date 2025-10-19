package epn.gr04.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorParameterizedTest {

    private final Calculator calculator = new Calculator();

    static Stream<org.junit.jupiter.params.provider.Arguments> provideNumbersForMultiply() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(2, 3, 6),
                org.junit.jupiter.params.provider.Arguments.of(-2, 3, -6),
                org.junit.jupiter.params.provider.Arguments.of(0, 5, 0),
                org.junit.jupiter.params.provider.Arguments.of(7, 7, 49)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForMultiply")
    void testMultiplyWithMethodSource(double a, double b, double expected) {
        // When
        double result = calculator.multiply(a, b);

        // Then
        assertEquals(expected, result);
    }
}
