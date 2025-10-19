package epn.gr04.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Debe sumar dos números correctamente")
    void testAdd() {
        double result = calculator.add(5, 3);
        assertEquals(8.0, result);
    }

    @Test
    @DisplayName("Debe restar dos números correctamente")
    void testSubtract() {
        double result = calculator.subtract(5, 3);
        assertEquals(2.0, result);
    }

    @Test
    @DisplayName("Debe multiplicar dos números correctamente")
    void testMultiply() {
        double result = calculator.multiply(4, 2);
        assertEquals(8.0, result);
    }

    @Test
    @DisplayName("Debe dividir dos números correctamente")
    void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result);
    }

    @Test
    @DisplayName("Debe lanzar excepción al dividir por cero")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    @DisplayName("Debe calcular potencia correctamente")
    void testPower() {
        double result = calculator.power(2, 3);
        assertEquals(8.0, result);
    }

    @Test
    @DisplayName("Debe calcular raíz cuadrada correctamente")
    void testSqrt() {
        double result = calculator.sqrt(16);
        assertEquals(4.0, result);
    }

    @Test
    @DisplayName("Debe lanzar excepción al sacar raíz de número negativo")
    void testSqrtNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-4));
    }
}
