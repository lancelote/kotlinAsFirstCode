package lesson2.notes

import lesson1.notes.discriminant

/**
 * Lesson 2
 */

/**
 * Пример ветвления
 */
fun max(n: Int, m: Int): Int = if (m > n) m else n

/**
 * Число корней квадратного уравнения
 */
fun quadraticRootNumber(a: Double, b: Double, c: Double): Int {
    val d = lesson1.notes.discriminant(a, b, c)
    return if (d > 0.0) 2 else if (d == 0.0) 1 else 0
}

/**
 * Табличная форма ветвления
 */
fun quadraticRootNumber2(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0.0  -> 2
        d == 0.0 -> 1
        else     -> 0
    }
}

/**
 * Словестная нотация для ошибки
 */
fun gradeNotation(grade: Int): String = when (grade) {
    5 -> "отлично"
    4 -> "хорошо"
    3 -> "удовлетворительно"
    2 -> "неудовлетворительно"
    else -> "неизвестная оценка $grade"
}

/**
 * Лежит ли точка внутри круга
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double): Boolean {
    return Math.pow(x - x0, 2.0) + Math.pow(y - y0, 2.0) <= r * r
}

/**
 * Рассчитывает минимальный из имеющихся корней биквадратного уравнения
 */
fun minBiRoot(a: Double, b: Double, c: Double): Double {
    if (a == 0.0) {
        if (b == 0.0) return Double.NaN
        val bc = -c / b
        if (bc < 0.0) return Double.NaN
        return -Math.sqrt(bc)
    }
    val d = discriminant(a, b, c)
    if (d < 0.0) return Double.NaN
    val y1 = (-b + Math.sqrt(d)) / (2 * a)
    val y2 = (-b - Math.sqrt(d)) / (2 * a)
    val y3 = Math.max(y1, y2)
    if (y3 < 0.0) return Double.NaN
    return -Math.sqrt(y3)
}
