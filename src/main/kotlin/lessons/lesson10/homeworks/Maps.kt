package lessons.lesson10.homeworks

fun main() {
    task1() // Чтобы проверить другую задачу, замените здесь номер.
}

// 1. Создать пустой неизменяемый словарь с ключами и значениями Int.
fun task1() {
    val numbers: Map<Int, Int> = emptyMap()
    println(numbers)
}

// 2. Создать словарь с ключами Float и значениями Double.
fun task2() {
    val numbers: Map<Float, Double> = mapOf(1.5f to 2.5, 3.0f to 4.75)
    println(numbers)
}

// 3. Создать изменяемый словарь с ключами Int и значениями String.
fun task3() {
    val words = mutableMapOf<Int, String>()
    println(words)
}

// 4. Добавить несколько пар в изменяемый словарь.
fun task4() {
    val words = mutableMapOf<Int, String>()
    words[1] = "один"
    words[2] = "два"
    println(words)
}

// 5. Получить значения по существующему и отсутствующему ключам.
fun task5() {
    val words = mutableMapOf(1 to "один", 2 to "два")
    println(words[1])
    println(words[3])
}

// 6. Удалить пару по ключу.
fun task6() {
    val words = mutableMapOf(1 to "один", 2 to "два")
    words.remove(1)
    println(words)
}

// 7. Разделить каждый ключ Double на значение Int. Для нуля вывести «бесконечность».
fun task7() {
    val numbers = mapOf(10.0 to 2, 5.0 to 0)
    for ((number, divisor) in numbers) {
        if (divisor == 0) {
            println("бесконечность")
        } else {
            println(number / divisor)
        }
    }
}

// 8. Заменить значение по существующему ключу.
fun task8() {
    val words = mutableMapOf(1 to "один", 2 to "два")
    words[2] = "ДВА"
    println(words)
}

// 9. Объединить два словаря в третий с помощью циклов.
fun task9() {
    val first = mapOf(1 to "один", 2 to "два")
    val second = mapOf(3 to "три", 4 to "четыре")
    val combined = mutableMapOf<Int, String>()

    for ((key, value) in first) {
        combined[key] = value
    }
    for ((key, value) in second) {
        combined[key] = value
    }
    println(combined)
}

// 10. Создать словарь «имя — список чисел» и добавить несколько пар.
fun task10() {
    val scores = mutableMapOf<String, List<Int>>()
    scores["Аня"] = listOf(5, 4, 5)
    scores["Борис"] = listOf(4, 3)
    println(scores)
}

// 11. Получить множество по ключу и добавить в него строку.
fun task11() {
    val groups = mutableMapOf(1 to mutableSetOf("Аня", "Борис"))
    val names = groups[1]
    if (names != null) {
        names.add("Вика")
        println(names)
    }
}

// 12. Вывести значения словаря, если в ключе-паре есть число 5.
fun task12() {
    val places = mapOf(
        Pair(1, 2) to "первое",
        Pair(3, 5) to "второе",
        Pair(5, 7) to "третье"
    )
    for ((pair, value) in places) {
        if (pair.first == 5 || pair.second == 5) {
            println(value)
        }
    }
}

// 13. Библиотека: автор — список книг.
fun task13() {
    val library = mapOf(
        "Пушкин" to listOf("Капитанская дочка", "Евгений Онегин")
    )
    println(library)
}

// 14. Растения: тип — список названий.
fun task14() {
    val plants = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Берёза", "Дуб")
    )
    println(plants)
}

// 15. Команды: название — список игроков.
fun task15() {
    val teams = mapOf(
        "Команда А" to listOf("Анна", "Иван"),
        "Команда Б" to listOf("Пётр", "Ольга")
    )
    println(teams)
}

// 16. Курс лечения: дата — список препаратов.
fun task16() {
    val treatment = mapOf(
        "09.10.2026" to listOf("Препарат А", "Препарат Б")
    )
    println(treatment)
}

// 17. Путешествия: страна — город — список интересных мест.
fun task17() {
    val travelGuide = mapOf(
        "Сербия" to mapOf(
            "Белград" to listOf("Калемегдан", "Храм Святого Саввы")
        )
    )
    println(travelGuide)
}
