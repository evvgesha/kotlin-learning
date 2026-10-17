package lessons.lesson12.homeworks

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 12, 15, 18, 20, 25, 30, 35)
    val words = listOf("apple", "banana", "cherry", "date", "kiwi", "strawberry")

    // 1. Проверить, что размер коллекции больше 5 элементов
    println(numbers.size > 5)

    // 2. Проверить, что коллекция пустая
    println(emptyList<Int>().isEmpty())

    // 3. Проверить, что коллекция не пустая
    println(numbers.isNotEmpty())

    // 4. Взять элемент по индексу или вернуть значение по умолчанию, если индекса не существует
    println(numbers.getOrElse(20) { -1 })

    // 5. Собрать коллекцию в строку через разделитель
    println(words.joinToString(separator = ", "))

    // 6. Посчитать сумму всех значений
    println(numbers.sum())

    // 7. Посчитать среднее
    println(numbers.average())

    // 8. Взять максимальное число
    println(numbers.maxOrNull())

    // 9. Взять минимальное число
    println(numbers.minOrNull())

    // 10. Взять первое число или null
    println(numbers.firstOrNull())

    // 11. Проверить, что коллекция содержит элемент
    println(numbers.contains(3))

    // 12. Отфильтровать коллекцию по диапазону от 18 до 30
    println(numbers.filter { it in 18..30 })

    // 13. Выбрать числа, которые не делятся на 2 и 3 одновременно
    println(numbers.filterNot { it % 2 == 0 && it % 3 == 0 })

    // 14. Очистить текстовую коллекцию от null элементов
    val wordsWithNull: List<String?> = listOf("Kotlin", null, "Java", null, "Swift")
    println(wordsWithNull.filterNotNull())

    // 15. Преобразовать текстовую коллекцию в коллекцию длин слов
    println(words.map { it.length })

    // 16. Преобразовать коллекцию в map, где ключи - перевёрнутые слова, а значения - их длина
    println(words.associate { it.reversed() to it.length })

    // 17. Отсортировать список в алфавитном порядке
    println(words.sorted())

    // 18. Взять первые 3 элемента списка
    println(numbers.take(3))

    // 19. Распечатать квадраты элементов списка
    numbers.take(5).forEach { println(it * it) }

    // 20. Сгруппировать список по первой букве слов
    println(words.filter { it.isNotEmpty() }.groupBy { it.first() })

    // 21. Очистить список от дублей
    val duplicates = listOf(1, 2, 2, 3, 4, 4, 5)
    println(duplicates.distinct())

    // 22. Отсортировать список по убыванию
    println(numbers.sortedDescending())

    // 23. Взять последние 3 элемента списка
    println(numbers.takeLast(3))

    // 24. Вызов функции характеристики коллекции
    println(describeCollection(emptyList()))
    println(describeCollection(listOf(0, 1, 2)))
    println(describeCollection(numbers))

    // 25. Вызов функции анализа оценок
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(analyzeGrades(grades))

    // 26. Вызов функции создания каталога
    val catalogWords = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы",
        "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга"
    )
    println(createCatalog(catalogWords))

    // 27. Вызов функции подсчёта средней длины слова
    println(averageWordLengthFormatted(catalogWords))

    // 28. Вызов функции категоризации чисел
    val testNumbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7, 4, 2)
    println(categorizeNumbers(testNumbers))

    // 29. Вызов функции поиска подходящего возраста
    val ages: List<Int?> = listOf(22, 18, 30, 45, 17, null, 60)
    println(findFirstMatchingAge(ages, 18))
}

// 24. Функция характеристики числовой коллекции
fun describeCollection(numbers: Collection<Int>): String = when {
    numbers.isEmpty() -> "Пусто"
    numbers.size < 5 -> "Короткая"
    numbers.first() == 0 -> "Стартовая"
    numbers.sum() > 10000 -> "Массивная"
    numbers.average() == 10.0 -> "Сбалансированная"
    numbers.joinToString("").length == 20 -> "Клейкая"
    (numbers.maxOrNull() ?: 0) < -10 -> "Отрицательная"
    (numbers.minOrNull() ?: 0) > 1000 -> "Положительная"
    numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
    else -> "Уникальная"
}

// 25. Функция анализа оценок (топ-3 лучших неудовлетворительных оценок < 60)
fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades.filter { it < 60 }
        .sortedDescending()
        .take(3)
        .sorted()
}

// 26. Функция создания каталога по первой букве в нижнем регистре
fun createCatalog(words: List<String>): Map<Char, List<String>> {
    return words.map { it.lowercase() }
        .groupBy { it.first() }
}

// 27. Функция подсчёта средней длины слова с форматированием до двух знаков
fun averageWordLengthFormatted(words: List<String>): String {
    val average = words.map { it.length }.average()
    return "Средняя длина слова: " + String.format(java.util.Locale.US, "%.2f", average)
}

// 28. Функция категоризации чисел на чётные и нечётные с сортировкой по убыванию
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers.distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "чётные" else "нечётные" }
}

// 29. Функция поиска первого возраста больше заданного
fun findFirstMatchingAge(ages: List<Int?>, minAge: Int): Int? {
    return ages.filterNotNull()
        .firstOrNull { it > minAge }
}
