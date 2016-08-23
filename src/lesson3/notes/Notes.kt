package lesson3.notes

fun factorialRecursive(n: Int): Double = if (n < 2) 1.0 else n * factorialRecursive(n - 1)

fun factorialFor(n: Int): Double {
    var result = 1.0  // Мутирующая переменная
    for (i in 1..n)
        result *= i
    return result
}

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (m in 2..n-1)
        if (n % m == 0) return false
    return true
}

fun fastIsPrime(n: Int): Boolean {
    if (n < 2) return false
    for (m in 2..Math.sqrt(n.toDouble()).toInt())
        if (n % m == 0) return false
    return true
}

fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n/2)
        if (n % m == 0) {
            sum += m
            if (sum > n) break
        }
    return sum == n
}

fun isPerfectContinue(n: Int): Boolean {
    var sum = 1
    for (m in 2..n/2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

fun digitCountInNumber(n: Int, m: Int): Int {
    var count = 0
    var number = n
    do {
        if (m == number % 10) count++
        number /= 10
    } while (number > 0)
    return count
}

fun digitCountInNumberRecursive(n: Int, m: Int): Int =
    if (n == m) 1 else if (n < 10) 0
    else digitCountInNumberRecursive(n / m, 10) + digitCountInNumberRecursive(n % 10, m)
