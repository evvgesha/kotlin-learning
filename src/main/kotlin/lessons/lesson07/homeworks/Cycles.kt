package lessons.lesson07.homeworks

// Напечатать числа от 1 до 10.
fun printNumbersFromOneToTen() {
    for (number in 1..10) {
        println(number)
    }
}

// Напечатать квадраты чисел от 1 до 5.
fun printSquaresFromOneToFive() {
    for (number in 1..5) {
        println(number * number)
    }
}

// Напечатать числа от 10 до 1 в обратном порядке.
fun printNumbersFromTenToOne() {
    for (number in 10 downTo 1) {
        println(number)
    }
}

// Напечатать чётные числа от 20 до 2 в обратном порядке.
fun printEvenNumbersFromTwentyToTwo() {
    for (number in 20 downTo 2 step 2) {
        println(number)
    }
}

// Напечатать каждое третье число в диапазоне от 1 до 30.
fun printEveryThirdNumberToThirty() {
    for (number in 1..30 step 3) {
        println(number)
    }
}

// Напечатать числа от 100 до 50 с шагом 5.
fun printNumbersFromOneHundredToFifty() {
    for (number in 100 downTo 50 step 5) {
        println(number)
    }
}

// Создать переменную длины списка и напечатать его индексы, начиная с нуля.
fun printListIndexes() {
    val length = 5
    for (index in 0 until length) {
        println(index)
    }
}

// Сложить числа от 1 до 10 с помощью цикла while.
fun printSumFromOneToTen() {
    var number = 1
    var sum = 0

    while (number <= 10) {
        sum += number
        number++
    }

    println(sum)
}

// Посчитать цифры числа, начиная со 100 и уменьшая число на 1 после каждой итерации.
fun printDigitCountsFromOneHundred() {
    var number = 100

    while (number > 0) {
        println(countDigits(number))
        number--
    }
}

fun countDigits(number: Int): Int {
    var remainingNumber = number
    var digitCount = 0

    while (remainingNumber > 0) {
        digitCount++
        remainingNumber /= 10
    }

    return digitCount
}

// Складывать числа от 1, пока сумма не станет больше 50. Использовать do while.
fun printSumUntilOverFifty() {
    var number = 1
    var sum = 0

    do {
        sum += number
        number++
    } while (sum <= 50)

    println(sum)
}

// Найти наибольшее целое число, факториал которого не больше 1000.
fun printLargestFactorialNumberUnderOneThousand() {
    var number = 1
    var factorial = 1

    while (factorial * (number + 1) <= 1000) {
        number++
        factorial *= number
    }

    println(number)
}

// Перебирать числа от 1 и остановиться на первом числе, которое делится на 7.
fun printNumbersUntilMultipleOfSeven() {
    var number = 1

    while (true) {
        if (number % 7 == 0) break
        println(number)
        number++
    }
}

// Печатать числа от 1 и остановиться при достижении числа 25.
fun printNumbersUntilTwentyFive() {
    var number = 1

    while (true) {
        if (number == 25) break
        println(number)
        number++
    }
}

// Напечатать числа от 1 до 10, пропуская 3 и 7.
fun printNumbersExceptThreeAndSeven() {
    for (number in 1..10) {
        if (number == 3 || number == 7) continue
        println(number)
    }
}

// Напечатать числа от 20 до 1, пропуская каждое четвёртое число.
fun printNumbersFromTwentyToOneSkippingMultiplesOfFour() {
    for (number in 20 downTo 1) {
        if (number % 4 == 0) continue
        println(number)
    }
}

fun main() {
    printNumbersFromOneToTen()
    printSquaresFromOneToFive()
    printNumbersFromTenToOne()
    printEvenNumbersFromTwentyToTwo()
    printEveryThirdNumberToThirty()
    printNumbersFromOneHundredToFifty()
    printListIndexes()
    printSumFromOneToTen()
    printDigitCountsFromOneHundred()
    printSumUntilOverFifty()
    printLargestFactorialNumberUnderOneThousand()
    printNumbersUntilMultipleOfSeven()
    printNumbersUntilTwentyFive()
    printNumbersExceptThreeAndSeven()
    printNumbersFromTwentyToOneSkippingMultiplesOfFour()
}
