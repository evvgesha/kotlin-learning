package lessons.lesson12.homeworks

fun main() {

}

// 1. Проверить, что размер коллекции больше 5 элементов
val numbers1 = listOf(1, 2, 3, 4, 5, 6)
val isSizeGreaterThan5 = numbers1.size > 5

// 2. Проверить, что коллекция пустая
val itemsEmpty = emptyList<Int>()
val isEmpty = itemsEmpty.isEmpty()

// 3. Проверить, что коллекция не пустая
val itemsNotEmpty = listOf("Kotlin", "Java")
val isNotEmpty = itemsNotEmpty.isNotEmpty()

// 4. Взять элемент по индексу или создать значение если индекса не существует
val fruitList = listOf("apple", "banana", "orange")
val fruitElement = fruitList.getOrElse(5) { "default" }

// 5. Собрать коллекцию в строку
val words = listOf("Kotlin", "is", "awesome")
val wordsString = words.joinToString(separator = " ")

// 6. Посчитать сумму всех значений
val numbersSum = listOf(10, 20, 30, 40)
val totalSum = numbersSum.sum()

// 7. Посчитать среднее
val numbersAvg = listOf(10, 20, 30, 40, 50)
val averageValue = numbersAvg.average()

// 8. Взять максимальное число
val numbersList = listOf(5, 12, 3, 42, 7)
val maxNumber = numbersList.maxOrNull()

// 9. Взять минимальное число
val minNumber = numbersList.minOrNull()

// 10. Взять первое число или null
val numbersFirst = listOf(42, 10, 20)
val firstNumber = numbersFirst.firstOrNull()

// 11. Проверить что коллекция содержит элемент
val numbersContain = listOf(1, 2, 3, 4, 5)
val containsThree = numbersContain.contains(3)

// 12. Отфильтровать коллекцию по диапазону 18-30
val ages = listOf(10, 18, 20, 25, 30, 35)
val filteredAges = ages.filter { it in 18..30 }

// 13. Выбрать числа, которые не делятся на 2 и 3 одновременно
val numbersDiv = listOf(2, 3, 4, 6, 9, 12, 15, 18, 20)
val filteredNotDivisibleBy2And3 = numbersDiv.filterNot { it % 2 == 0 && it % 3 == 0 }

// 14. Очистить текстовую коллекцию от null элементов
val listWithNulls: List<String?> = listOf("Kotlin", null, "Java", null, "Swift")
val nonNullList = listWithNulls.filterNotNull()

// 15. Преобразовать текстовую коллекцию в коллекцию длин слов
val fruitWords = listOf("apple", "banana", "kiwi", "strawberry")
val wordLengths = fruitWords.map { it.length }

// 16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
val wordsMap = listOf("cat", "dog", "level", "kotlin")
val reversedToLengthMap = wordsMap.associate { it.reversed() to it.length }

// 17. Отсортировать список в алфавитном порядке
val unsortedWords = listOf("banana", "apple", "cherry", "date")
val sortedWords = unsortedWords.sorted()

// 18. Взять первые 3 элемента списка
val numbersTake = listOf(10, 20, 30, 40, 50)
val firstThree = numbersTake.take(3)

// 19. Распечатать квадраты элементов списка
val numbersSquare = listOf(1, 2, 3, 4, 5)
fun printSquares() {
    numbersSquare.forEach { println(it * it) }
}

// 20. Группировать список по первой букве слов
val groupWords = listOf("apple", "apricot", "banana", "blueberry", "cherry")
val groupedByFirstLetter = groupWords.groupBy { it.first() }

// 21. Очистить список от дублей
val duplicates = listOf(1, 2, 2, 3, 4, 4, 4, 5)
val distinctNumbers = duplicates.distinct()

// 22. Отсортировать список по убыванию
val numbersDesc = listOf(15, 3, 89, 42, 7)
val sortedDescendingNumbers = numbersDesc.sortedDescending()

// 23. Взять последние 3 элемента списка
val lastThree = numbersTake.takeLast(3)

// 24. Характеристика числовой коллекции
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

// 25. Анализ учебных оценок
fun analyzeGrades(grades: List<Int>): List<Int> =
    grades.filter { it < 60 }.sortedDescending().take(3).sorted()

// 26. Создание каталога по первой букве
val catalogSourceList = listOf(
    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
)

fun createCatalog(words: List<String>): Map<Char, List<String>> =
    words.map { it.lowercase() }.groupBy { it.first() }

// 27. Подсчёт средней длины слов в списке
fun averageWordLengthFormatted(words: List<String>): String {
    val average = words.map { it.length }.average()
    return "Средняя длина слова: " + String.format(java.util.Locale.US, "%.2f", average)
}

// 28. Категоризация чисел
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> =
    numbers.distinct().sortedDescending().groupBy { if (it % 2 == 0) "чётные" else "нечётные" }

// 29. Поиск первого подходящего элемента
fun findFirstMatchingAge(ages: List<Int?>, minAge: Int): Int? =
    ages.filterNotNull().firstOrNull { it > minAge }
