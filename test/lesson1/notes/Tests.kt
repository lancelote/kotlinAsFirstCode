package lesson1.notes

import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test
    fun testSqr() {
        assertEquals(0, sqr(0))
        assertEquals(4, sqr(2))
        assertEquals(9, sqr(-3))
    }
}