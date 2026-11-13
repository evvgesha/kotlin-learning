package lessons.lesson20.homeworks

import kotlin.math.absoluteValue

// 1. Функция-расширение для массива чисел: пара из первого и последнего элемента (или null to null если пуст)
fun Array<Int>.getAround(): Pair<Int?, Int?> {
    return if (isEmpty()) {
        null to null
    } else {
        first() to last()
    }
}

// 2. Функция-расширение для изменяемого списка элементов: сортирует на месте и возвращает как неизменяемый список
fun <T : Comparable<T>> MutableList<T>.sort(direction: Boolean): List<T> {
    if (direction) {
        sort()
    } else {
        sortDescending()
    }
    return toList()
}

// 3. Функция-расширение для nullable словаря Map<R, List<R>>?
fun <R> Map<R, List<R>>?.mapByIndex(index: Int): Map<String, R?>? {
    return this
        ?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(index) }
}

// 4. Метод расширения within для Number с проверкой допустимого отклонения
fun Number.within(other: Number, deviation: Number): Boolean {
    val actual = toDouble() - other.toDouble()
    return actual.absoluteValue <= deviation.toDouble()
}

// 5. Методы расширения encrypt и decrypt для String со сдвигом по таблице Unicode
fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

// 6. Метод расширения twitterize для String: вывод буквы и автора под ней
fun String.twitterize(authors: List<String>) {
    if (authors.isEmpty() || isEmpty()) return
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}
