package lessons.lesson11.homeworks

// 1. Определите функцию doSomething, которая не принимает аргументов и не возвращает значения
fun doSomething() {
}

// 2. Определите функцию getUserName, которая не принимает аргументов и возвращает строку (String)
fun getUserName(): String {
    return ""
}

// 3. Определите функцию printGreeting, которая принимает строковый аргумент greeting и не возвращает значения
fun printGreeting(greeting: String) {
}

// 4. Определите функцию calculateArea, которая принимает два аргумента типа Double и возвращает значение типа Double
fun calculateArea(width: Double, height: Double): Double {
    return width * height
}

// 5. Определите функцию findMax, которая принимает два целых числа и возвращает целое число (Int)
fun findMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 6. Определите функцию isNullOrEmpty, которая принимает строку (String?) и возвращает логическое значение (Boolean)
fun isNullOrEmpty(text: String?): Boolean {
    return text == null || text.isEmpty()
}

// 7. Определите функцию logError, которая принимает строковый аргумент message и не возвращает значения
fun logError(message: String) {
}

// 8. Определите функцию getFullName, которая принимает два строковых аргумента (firstName и lastName) и возвращает строку (String)
fun getFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

// 9. Определите функцию calculateDiscount, которая принимает аргумент price типа Double и возвращает значение типа Double
fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

// 10. Определите функцию isValid, которая принимает аргумент input типа String? и возвращает логическое значение (Boolean)
fun isValid(input: String?): Boolean {
    return input != null
}

// 11. Напишите функцию greet, которая принимает строковый параметр name и возвращает приветственное сообщение в виде строки
fun greet(name: String): String {
    return "Привет, $name!"
}

// 12. Напишите функцию calculateSum, которая принимает два целых числа в качестве параметров и возвращает их сумму с использованием оператора return
fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

// 13. Создайте функцию getMax, которая принимает два числа и возвращает большее из них, используя return
fun getMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 14. Напишите функцию calculateTotalCost, которая принимает словарь товаров и их цены, а затем возвращает итоговую стоимость
fun calculateTotalCost(items: Map<String, Double>): Double {
    var total = 0.0
    for (price in items.values) {
        total += price
    }
    return total
}

// 15. Реализуйте функцию printPositiveNumbers, которая принимает список чисел и выводит только положительные числа. Если встречается отрицательное число, функция должна прекратить выполнение с помощью return без возврата значения
fun printPositiveNumbers(numbers: List<Int>) {
    for (num in numbers) {
        if (num < 0) return
        if (num > 0) println(num)
    }
}

// 16. Напишите функцию replaceString, которая принимает список строк и искомую строку. Функция должна перебрать список и заменить первое вхождение искомой строки на её версию в верхнем регистре, после чего завершить выполнение с помощью return без возврата значения
fun replaceString(strings: MutableList<String>, target: String) {
    for (i in 0 until strings.size) {
        if (strings[i] == target) {
            strings[i] = target.uppercase()
            return
        }
    }
}

// 17. Создайте функцию findFirstEvenNumber, которая принимает список целых чисел. Функция должна выводить каждый номер. При нахождении первого чётного числа она должна вывести сообщение "Чётное число найдено" и завершить выполнение с помощью return без возврата значения
fun findFirstEvenNumber(numbers: List<Int>) {
    for (number in numbers) {
        println(number)
        if (number % 2 == 0) {
            println("Чётное число найдено")
            return
        }
    }
}
