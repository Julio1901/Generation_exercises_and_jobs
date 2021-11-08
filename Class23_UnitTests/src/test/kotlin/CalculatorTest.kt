import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculatorTest {
    //Test scenario

    val calculator = Calculator()


    @Test
    fun sum() {
        assertEquals(10, calculator.sum(5, 5))
    }

    @Test
    fun subtration() {
        assertEquals(5, calculator.subtration(10, 5))
    }

    @Test
    fun division() {
        assertEquals(4, calculator.division(8, 2))
    }

    @Test
    fun multiplication() {
        assertEquals(10, calculator.multiplication(5, 2))
    }

    @Test
    fun power() {
        assertEquals(243.0, calculator.power(3.0, 5))
    }

    @Test
    fun squadRoot() {
        assertEquals(2.0, calculator.squadRoot(4.0))
    }
}