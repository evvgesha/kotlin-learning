package lessons.lesson12.homeworks

fun main() {
    task1() // Чтобы проверить другую задачу, замените здесь номер.
}

// ==========================================
// Задачи на приведение коллекции к значению
// ==========================================

// 1. Проверить, что размер коллекции больше 5 элементов
fun task1() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val result = numbers.size > 5
    println(result)
}

// 2. Проверить, что коллекция пустая
fun task2() {
    val items = emptyList<Int>()
    val result = items.isEmpty()
    println(result)
}

// 3. Проверить, что коллекция не пустая
fun task3() {
    val items = listOf("Kotlin", "Java")
    val result = items.isNotEmpty()
    println(result)
}

// 4. Взять элемент по индексу или создать значение если индекса не существует
fun task4() {
    val list = listOf("apple", "banana", "orange")
    val item = list.getOrElse(5) { "default" }
    println(item)
}

// 5. Собрать коллекцию в строку
fun task5() {
    val words = listOf("Kotlin", "is", "awesome")
    val result = words.joinToString(separator = " ")
    println(result)
}

// 6. Посчитать сумму всех значений
fun task6() {
    val numbers = listOf(10, 20, 30, 40)
    val result = numbers.sum()
    println(result)
}

// 7. Посчитать среднее
fun task7() {
    val numbers = listOf(10, 20, 30, 40, 50)
    val result = numbers.average()
    println(result)
}

// 8. Взять максимальное число
fun task8() {
    val numbers = listOf(5, 12, 3, 42, 7)
    val result = numbers.maxOrNull()
    println(result)
}

// 9. Взять минимальное число
fun task9() {
    val numbers = listOf(5, 12, 3, 42, 7)
    val result = numbers.minOrNull()
    println(result)
}

// 10. Взять первое число или null
fun task10() {
    val numbers = listOf(42, 10, 20)
    val result = numbers.firstOrNull()
    println(result)
}

// 11. Проверить что коллекция содержит элемент
fun task11() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = numbers.contains(3)
    println(result)
}

// ==========================================
// Задачи на обработку коллекций
// ==========================================

// 12. Отфильтровать коллекцию по диапазону 18-30
fun task12() {
    val numbers = listOf(10, 18, 20, 25, 30, 35)
    val result = numbers.filter { it in 18..30 }
    println(result)
}

// 13. Выбрать числа, которые не делятся на 2 и 3 одновременно
fun task13() {
    val numbers = listOf(2, 3, 4, 6, 9, 12, 15, 18, 20)
    val result = numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
    println(result)
}

// 14. Очистить текстовую коллекцию от null элементов
fun task14() {
    val listWithNulls: List<String?> = listOf("Kotlin", null, "Java", null, "Swift")
    val result = listWithNulls.filterNotNull()
    println(result)
}

// 15. Преобразовать текстовую коллекцию в коллекцию длин слов
fun task15() {
    val words = listOf("apple", "banana", "kiwi", "strawberry")
    val lengths = words.map { it.length }
    println(lengths)
}

// 16. Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
fun task16() {
    val words = listOf("cat", "dog", "level", "kotlin")
    val result = words.associateWith { it.reversed() }
    println(result)
}

// 17. Отсортировать список в алфавитном порядке
fun task17() {
    val words = listOf("banana", "apple", "cherry", "date")
    val result = words.sorted()
    println(result)
}

// 18. Отсортировать список по убыванию
fun task18() {
    val numbers = listOf(15, 3, 89, 42, 7)
    val result = numbers.sortedDescending()
    println(result)
}

// 19. Распечатать квадраты элементов списка
fun task19() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { println(it * it) }
}

// 20. Группировать список по первой букве слов
fun task20() {
    val words = listOf("apple", "apricot", "banana", "blueberry", "cherry")
    val result = words.groupBy { it.first() }
    println(result)
}

// 21. Очистить список от дублей
fun task21() {
    val duplicates = listOf(1, 2, 2, 3, 4, 4, 4, 5)
    val result = duplicates.distinct()
    println(result)
}

// 22. Взять первые 3 элемента списка
fun task22() {
    val numbers = listOf(10, 20, 30, 40, 50)
    val result = numbers.take(3)
    println(result)
}

// 23. Взять последние 3 элемента списка
fun task23() {
    val numbers = listOf(10, 20, 30, 40, 50)
    val result = numbers.takeLast(3)
    println(result)
}