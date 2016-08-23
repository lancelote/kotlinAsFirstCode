package lesson3.notes

import org.junit.Assert.*
import org.junit.Test

class Test {

    @Test
    fun factorialRecursive() {
        assertEquals(1.0, factorialRecursive(1), 1e-2)
        assertEquals(24.0, factorialRecursive(4), 1e-2)
        assertEquals(40320.0, factorialRecursive(8), 1e-2)
    }

    @Test
    fun factorialFor() {
        assertEquals(1.0, factorialFor(1), 1e-2)
        assertEquals(24.0, factorialFor(4), 1e-2)
        assertEquals(40320.0, factorialFor(8), 1e-2)
    }

    @Test
    fun isPrime() {
        assertFalse(isPrime(-1))
        assertFalse(isPrime(0))
        assertFalse(isPrime(1))
        assertTrue(isPrime(3))
        assertFalse(isPrime(8))
        assertTrue(isPrime(11))
    }

    @Test
    fun first1000Primes() {
        var count = 0
        for (n in 2..7919)
            if (isPrime(n))
                count++
        assertEquals(1000, count)
    }

    @Test
    fun isPerfect() {
        assertFalse(isPerfect(4))
        assertTrue(isPerfect(6))
        assertFalse(isPerfect(20))
        assertTrue(isPerfect(28))
    }

    @Test
    fun digitCountInNumber() {
        assertEquals(4, digitCountInNumber(5373393, 3))
        assertEquals(1, digitCountInNumber(0, 0))
    }
}
