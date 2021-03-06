package lesson2.task1

import org.junit.Assert.assertEquals
import org.junit.Test

class Tests {

    @Test
    fun ageDescription() {
        assertEquals("21 год", ageDescription(21))
        assertEquals("132 года", ageDescription(132))
        assertEquals("12 лет", ageDescription(12))
        assertEquals("199 лет", ageDescription(199))
    }

    @Test
    fun timeForHalfWay() {
        assertEquals(2.5, timeForHalfWay(1.0, 5.0, 2.0, 4.0, 3.0, 3.0), 1e-2)
        assertEquals(3.67, timeForHalfWay(4.0, 3.0, 1.0, 4.0, 1.0, 6.0), 1e-2)
        assertEquals(4.4, timeForHalfWay(3.0, 0.0, 1.0, 6.0, 2.0, 5.0), 1e-2)
    }

    @Test
    fun whichRookThreatens() {
        assertEquals(0, whichRookThreatens(1, 2, 3, 4, 5, 6))
        assertEquals(1, whichRookThreatens(5, 3, 7, 3, 4, 8))
        assertEquals(2, whichRookThreatens(6, 8, 8, 6, 6, 3))
        assertEquals(3, whichRookThreatens(3, 7, 8, 7, 3, 5))
    }

    @Test
    fun rookOrBishopThreatens() {
        assertEquals(0, rookOrBishopThreatens(4, 5, 5, 7, 8, 8))
        assertEquals(1, rookOrBishopThreatens(2, 8, 6, 8, 1, 6))
        assertEquals(2, rookOrBishopThreatens(5, 4, 3, 7, 1, 8))
        assertEquals(3, rookOrBishopThreatens(1, 6, 7, 6, 3, 8))
    }

    @Test
    fun triangleKind() {
        assertEquals(-1, triangleKind(3.0, 7.5, 4.0))
        assertEquals(1, triangleKind(5.0, 3.0, 4.0))
        assertEquals(2, triangleKind(4.0, 6.0, 8.0))
        assertEquals(0, triangleKind(1.0, 1.5, 1.5))
    }

    @Test
    fun segmentLength() {
        assertEquals(-1, segmentLength(1, 2, 3, 4))
        assertEquals(-1, segmentLength(5, 7, 1, 3))
        assertEquals(0, segmentLength(1, 2, 2, 4))
        assertEquals(3, segmentLength(3, 6, 0, 9))
        assertEquals(2, segmentLength(2, 5, 3, 9))
        assertEquals(1, segmentLength(3, 6, 1, 4))
        assertEquals(4, segmentLength(1, 15, 10, 14))
    }
}