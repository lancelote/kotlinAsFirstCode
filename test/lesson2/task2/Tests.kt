package lesson2.task2

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class Tests {

    @Test
    fun isNumberHappy() {
        assertTrue(isNumberHappy(1533))
        assertTrue(isNumberHappy(9009))
        assertFalse(isNumberHappy(3644))
    }

    @Test
    fun queenThreatens() {
        assertTrue(queenThreatens(3, 6, 7, 6))
        assertTrue(queenThreatens(8, 1, 1, 8))
        assertFalse(queenThreatens(7, 6, 5, 7))
    }

    @Test
    fun brickPasses() {
        assertTrue(brickPasses(2, 10, 5, 6, 3))
        assertTrue(brickPasses(4, 4, 4, 4, 4))
        assertFalse(brickPasses(6, 5, 4, 3, 6))
        assertTrue(brickPasses(3, 2, 1, 1, 2))
    }

    @Test
    fun circleInside() {
        assertFalse(circleInside(0.0, 0.0, 6.0, 0.0, 0.0, 5.0))
        assertFalse(circleInside(0.0, 0.0, 1.0, 10.0, 10.0, 9.0))
        assertTrue(circleInside(2.0, 2.0, 2.0, 2.0, 2.0, 2.0))
        assertTrue(circleInside(-2.0, 3.0, 2.0, -2.0, 0.0, 5.0))
        assertFalse(circleInside(1.0, 2.0, 3.0, 4.0, 5.0, 6.0))
    }
}