package lessons.lesson12.homeworks

fun main() {
    // 1. Проверить, что размер коллекции больше 5 элементов
    val numbers1 = listOf(1, 2, 3, 4, 5, 6)
    println(numbers1.size > 5)

    // 2. Проверить, что коллекция пустая
    val itemsEmpty = emptyList<Int>()
    println(itemsEmpty.isEmpty())

    // 3. Проверить, что коллекция не пустая
    val itemsNotEmpty = listOf("Kotlin", "Java")
    println(itemsNotEmpty.isNotEmpty())

    // 4. Взять элемент по индексу или создать значение если индекса не существует
    val fruitList = listOf("apple", "banana", "orange")
    println(fruitList.getOrElse(5) { "default" })

    // 5. Собрать коллекцию в строку
    val words = listOf("Kotlin", "is", "awesome")
    println(words.joinToString(separator = " "))

    // 6. Посчитать сумму всех значений
    val numbersSum = listOf(10, 20, 30, 40)
    println(numbersSum.sum())

    // 7. Посчитать среднее
    val numbersAvg = listOf(10, 20, 30, 40, 50)
    println(numbersAvg.average())

    // 8. Взять максимальное число
    val numbersMax = listOf(5, 12, 3, 42, 7)
    println(numbersMax.maxOrNull())

    // 9. Взять минимальное число
    println(numbersMax.minOrNull())

    // 10. Взять первое число или null
    val numbersFirst = listOf(42, 10, 20)
    println(numbersFirst.firstOrNull())

    // 11. Проверить что коллекция содержит элемент
    val numbersContain = listOf(1, 2, 3, 4, 5)
    println(numbersContain.contains(3))

    // 12. Отфильтровать коллекцию по диапазону 18-30
    val ages = listOf(10, 18, 20, 25, 30, 35)
    println(ages.filter { it in 18..30 })

    // 13. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val numbersDiv = listOf(2, 3, 4, 6, 9, 12, 15, 18, 20)
    println(numbersDiv.filterNot { it % 2 == 0 && it % 3 == 0 })

    // 14. Очистить текстовую коллекцию от null элементов
    val listWithNulls: List<String?> = listOf("Kotlin", null, "Java", null, "Swift")
    println(listWithNulls.filterNotNull())

    // 15. Преобразовать текстовую коллекцию в коллекцию длин слов
    val fruitWords = listOf("apple", "banana", "kiwi", "strawberry")
    println(fruitWords.map { it.length })

    // 16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    val wordsMap = listOf("cat", "dog", "level", "kotlin")
    println(wordsMap.associate { it.reversed() to it.length })

    // 17. Отсортировать список в алфавитном порядке
    val unsortedWords = listOf("banana", "apple", "cherry", "date")
    println(unsortedWords.sorted())

    // 18. Взять первые 3 элемента списка
    val numbersTake = listOf(10, 20, 30, 40, 50)
    println(numbersTake.take(3))

    // 19. Распечатать квадраты элементов списка
    val numbersSquare = listOf(1, 2, 3, 4, 5)
    numbersSquare.forEach { println(it * it) }

    // 20. Группировать список по первой букве слов
    val groupWords = listOf("apple", "apricot", "banana", "blueberry", "cherry")
    println(groupWords.groupBy { it.first() })

    // 21. Очистить список от дублей
    val duplicates = listOf(1, 2, 2, 3, 4, 4, 4, 5)
    println(duplicates.distinct())

    // 22. Отсортировать список по убыванию
    val numbersDesc = listOf(15, 3, 89, 42, 7)
    println(numbersDesc.sortedDescending())

    // 23. Взять последние 3 элемента списка
    println(numbersTake.takeLast(3))

    // 24. Характеристика числовой коллекции
    println(describeCollection(emptyList()))
    println(describeCollection(listOf(1, 2)))
    println(describeCollection(listOf(0, 1, 2, 3, 4)))
    println(describeCollection(listOf(5000, 3000, 2001, 100, 50)))
    println(describeCollection(listOf(10, 10, 10, 10, 10)))
    println(describeCollection(listOf(1234567890, 1234567890)))
    println(describeCollection(listOf(-15, -20, -30, -40, -50)))
    println(describeCollection(listOf(1001, 2000, 3000, 4000, 5000)))
    println(describeCollection(listOf(3, 14, 1, 2, 5)))
    println(describeCollection(listOf(100, 200, 300, 400, 500)))

    // 25. Анализ учебных оценок
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(analyzeGrades(grades))

    // 26. Создание каталога по первой букве
    println(createCatalog(catalogSourceList))

    // 27. Подсчёт средней длины слов в списке
    println(averageWordLengthFormatted(catalogSourceList))

    // 28. Категоризация чисел
    val numbersCategorize = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(categorizeNumbers(numbersCategorize))

    // 29. Поиск первого подходящего элемента
    val agesList = listOf(22, 18, 30, 45, 17, null, 60)
    println(findFirstMatchingAge(agesList, 18))
}

// Функции к задачам 24-29
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

fun analyzeGrades(grades: List<Int>): List<Int> =
    grades.filter { it >= 60 }.sorted().take(3)

val catalogSourceList = listOf(
    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
)

fun createCatalog(words: List<String>): Map<Char, List<String>> =
    words.map { it.lowercase() }.groupBy { it.first() }

fun averageWordLengthFormatted(words: List<String>): String {
    val average = words.map { it.length }.average()
    return String.format(java.util.Locale.US, "%.2f", average)
}

fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> =
    numbers.distinct().sortedDescending().groupBy { if (it % 2 == 0) "четные" else "нечетные" }

fun findFirstMatchingAge(ages: List<Int?>, minAge: Int): Int? =
    ages.filterNotNull().firstOrNull { it > minAge }
