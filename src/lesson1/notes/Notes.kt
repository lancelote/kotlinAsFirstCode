package lesson1.notes

/**
 * Lesson 1
 */

import java.lang.Math.sqrt

fun sqr(x: Int): Int = x * x

fun sqr(x: Double): Double = x * x

fun discriminant(a: Double, b: Double, c: Double): Double = sqrt(sqr(b) - 4 * a * c)

fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val d: Double = discriminant(a, b, c)
    val x1 = (-b + d) / (2 * a)
    val x2 = (-b - d) / (2 * a)
    return x1 * x2
}

fun solveQuadraticEquation(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    val x1 = (-b + d) / (2 * a)
    val x2 = (-b - d) / (2 * a)

    println(x1)
    println(x2)

    println("x1 = $x1, x2 = $x2")
    println("x1 * x2 = ${x1 * x2}")
}

fun main(args: Array<String>) {
    val x1x2 = lesson1.notes.quadraticRootProduct(1.0, -3.0, 2.0)
    println("Root product: $x1x2")
}
