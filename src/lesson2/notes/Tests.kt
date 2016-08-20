package lesson2.notes

import org.junit.Assert.*
import org.junit.Test

class Test {
    @Test
    fun testPointInsideCircle() {
        assertTrue(pointInsideCircle(1.0, 1.0, 0.0, 0.0, 2.0))
        assertFalse(pointInsideCircle(2.0, 2.0, 0.0, 0.0, 2.0))
    }

    @Test
    fun testMinBiRoot() {
        assertEquals(Double.NaN, minBiRoot(0.0, 0.0, 1.0), 1e-2)
        assertEquals(Double.NaN, minBiRoot(0.0, 1.0, 2.0), 1e-2)
        assertEquals(-2.0, minBiRoot(0.0, 1.0, -4.0), 1e-10)
        assertEquals(Double.NaN, minBiRoot(1.0, -2.0, 4.0), 1e-2)
        assertEquals(Double.NaN, minBiRoot(1.0, 3.0, 2.0), 1e-2)
        assertEquals(-1.41, minBiRoot(1.0, -3.0, 2.0), 1e-2)
    }
}
