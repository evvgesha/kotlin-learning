package lessons.lesson11.homeworks

// ==========================================
// Задачи на сигнатуру метода
// ==========================================

// 1. Не принимает аргументов и не возвращает значения.
fun task1() {
}

// 2. Принимает два целых числа и возвращает их сумму.
fun task2(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает.
fun task3(text: String) {
}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun task4(numbers: List<Int>): Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num
    }
    return if (numbers.isEmpty()) 0.0 else sum / numbers.size
}

// 5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun task5(text: String?): Int? {
    return text?.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число.
fun task6(): Double? {
    return null
}

// 7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun task7(numbers: List<Int>?) {
}

// 8. Принимает целое число и возвращает nullable строку.
fun task8(number: Int): String? {
    return "$number"
}

// 9. Не принимает аргументов и возвращает список nullable строк.
fun task9(): List<String?> {
    return listOf("one", null, "two")
}

// 10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun task10(text: String?, number: Int?): Boolean? {
    return null
}

// ==========================================
// Задачи на написание кода
// ==========================================

// 1. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// 2. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 3. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// 4. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (num in numbers) {
        if (num < 0) {
            return num
        }
    }
    return null
}

// 5. Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(items: List<String?>) {
    for (item in items) {
        if (item == null) return
        println(item)
    }
}
