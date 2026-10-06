package lessons.lesson07.homeworks

// 1. Вывести числа от 1 до 5.
fun task1() {
    for (number in 1..5) println(number)
}

// 2. Вывести чётные числа от 1 до 10.
fun task2() {
    for (number in 1..10) {
        if (number % 2 == 0) println(number)
    }
}

// 3. Вывести числа от 5 до 1.
fun task3() {
    for (number in 5 downTo 1) println(number)
}

// 4. Вывести числа от 10 до 1, уменьшая их на 2.
fun task4() {
    for (number in 10 downTo 1 step 2) println(number)
}

// 5. Вывести числа от 1 до 9 с шагом 2.
fun task5() {
    for (number in 1..9 step 2) println(number)
}

// 6. Вывести каждое третье число от 1 до 20.
fun task6() {
    for (number in 1..20 step 3) println(number)
}

// 7. Вывести числа от 3 до size, не включая size, с шагом 2.
fun task7() {
    val size = 10
    for (number in 3 until size step 2) println(number)
}

// 8. С помощью while вывести квадраты чисел от 1 до 5.
fun task8() {
    var number = 1
    while (number <= 5) {
        println(number * number)
        number++
    }
}

// 9. Уменьшить число от 10 до 5 с помощью while, затем вывести результат.
fun task9() {
    var number = 10
    while (number > 5) number--
    println(number)
}

// 10. С помощью do while вывести числа от 5 до 1.
fun task10() {
    var number = 5
    do {
        println(number)
        number--
    } while (number >= 1)
}

// 11. Повторять do while, пока счётчик меньше 10, начиная с 5.
fun task11() {
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)
}

// 12. Перебрать числа от 1 до 10 и остановиться при достижении 6.
fun task12() {
    for (number in 1..10) {
        if (number == 6) break
        println(number)
    }
}

// 13. Выводить числа от 1 в цикле while и остановиться при достижении 10.
fun task13() {
    var number = 1
    while (true) {
        if (number == 10) break
        println(number)
        number++
    }
}

// 14. В цикле for от 1 до 10 пропустить чётные числа.
fun task14() {
    for (number in 1..10) {
        if (number % 2 == 0) continue
        println(number)
    }
}

// 15. В цикле while вывести числа от 1 до 10, пропуская кратные 3.
fun task15() {
    var number = 0
    while (number < 10) {
        number++
        if (number % 3 == 0) continue
        println(number)
    }
}

fun main() {
    val task = 1 // Поменяй число на номер задачи от 1 до 15.

    when (task) {
        1 -> task1()
        2 -> task2()
        3 -> task3()
        4 -> task4()
        5 -> task5()
        6 -> task6()
        7 -> task7()
        8 -> task8()
        9 -> task9()
        10 -> task10()
        11 -> task11()
        12 -> task12()
        13 -> task13()
        14 -> task14()
        15 -> task15()
    }
}
