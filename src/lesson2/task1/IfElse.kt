@file:Suppress("UNUSED_PARAMETER")
package lesson2.task1

import java.lang.Math.*

/**
 * Простая
 *
 * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
 * вернуть строку вида: «21 год», «32 года», «12 лет».
 */
fun ageDescription(age: Int): String {
    return when {
        age > 10 && age < 20 -> "$age лет"
        age % 10 == 1        -> "$age год"
        age % 10 < 5         -> "$age года"
        else                 -> "$age лет"
    }
}

/**
 * Простая
 *
 * Путник двигался t1 часов со скоростью v1 км/час, затем t2 часов — со скоростью v2 км/час
 * и t3 часов — со скоростью v3 км/час.
 * Определить, за какое время он одолел первую половину пути?
 */
fun timeForHalfWay(t1: Double, v1: Double,
                   t2: Double, v2: Double,
                   t3: Double, v3: Double): Double {
    val distance = (t1 * v1 + t2 * v2 + t3 * v3) / 2.0
    return when {
        distance <= t1 * v1           -> distance / v1
        distance <= t1 * v1 + t2 * v2 -> t1 + (distance - t1 * v1) / v2
        else                          -> t1 + t2 + (distance - t1 * v1 - t2 * v2) / v3
    }
}

/**
 * Есть ли шах от ладьи
 */
fun rookCheck(kingX: Int, kingY: Int, rookX: Int, rookY: Int): Boolean {
    return kingX == rookX || kingY == rookY
}

/**
 * Простая
 *
 * Нa шахматной доске стоят черный король и две белые ладьи (ладья бьет по горизонтали и вертикали).
 * Определить, не находится ли король под боем, а если есть угроза, то от кого именно.
 * Вернуть 0, если угрозы нет, 1, если угроза только от первой ладьи, 2, если только от второй ладьи,
 * и 3, если угроза от обеих ладей.
 */
fun whichRookThreatens(kingX: Int, kingY: Int,
                       rookX1: Int, rookY1: Int,
                       rookX2: Int, rookY2: Int): Int {
    val rook1Danger = rookCheck(kingX, kingY, rookX1, rookY1)
    val rook2Danger = rookCheck(kingX, kingY, rookX2, rookY2)
    return when {
        rook1Danger && rook2Danger -> 3
        rook1Danger                -> 1
        rook2Danger                -> 2
        else                       -> 0
    }
}

/**
 * Есть ли шах от слона
 */
fun bishopCheck(kingX: Int, kingY: Int, bishopX: Int, bishopY: Int): Boolean {
    return kingX - kingY == bishopX - bishopY || kingX + kingY == bishopX + bishopY
}

/**
 * Простая
 *
 * На шахматной доске стоят черный король и белые ладья и слон
 * (ладья бьет по горизонтали и вертикали, слон — по диагоналям).
 * Проверить, есть ли угроза королю и если есть, то от кого именно.
 * Вернуть 0, если угрозы нет, 1, если угроза только от ладьи, 2, если только от слона,
 * и 3, если угроза есть и от ладьи и от слона.
 */
fun rookOrBishopThreatens(kingX: Int, kingY: Int,
                          rookX: Int, rookY: Int,
                          bishopX: Int, bishopY: Int): Int {
    val rookDanger = rookCheck(kingX, kingY, rookX, rookY)
    val bishopDanger = bishopCheck(kingX, kingY, bishopX, bishopY)
    return when {
        rookDanger && bishopDanger -> 3
        rookDanger                 -> 1
        bishopDanger               -> 2
        else                       -> 0
    }
}

/**
 * Простая
 *
 * Треугольник задан длинами своих сторон a, b, c.
 * Проверить, является ли данный треугольник остроугольным (вернуть 0),
 * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
 * Если такой треугольник не существует, вернуть -1.
 */
fun triangleKind(a: Double, b: Double, c: Double): Int {
    val bigger = max(max(a, b), c)
    val smaller = min(min(a, b), c)
    val middle = a + b + c - bigger - smaller
    val hypotenuse = sqrt(smaller*smaller + middle*middle)
    return when {
        smaller + middle <= bigger -> -1
        hypotenuse > bigger        -> 0
        hypotenuse == bigger       -> 1
        else                       -> 2
    }
}

/**
 * Средняя
 *
 * Даны четыре точки на одной прямой: A, B, C и D.
 * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
 * Найти длину пересечения отрезков AB и CD.
 * Если пересечения нет, вернуть -1.
 */
fun segmentLength(a: Int, b: Int, c: Int, d: Int): Int {
    return when {
        b < c || a > d             -> -1
        a <= c && c <= b && b <= d -> b - c
        c <= a && a <= d && d <= b -> d -a
        c <= a && d <= d           -> b - a
        else                       -> d - c
    }
}