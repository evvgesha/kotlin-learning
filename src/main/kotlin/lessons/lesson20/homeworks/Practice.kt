package lessons.lesson20.homeworks

// Практика по функциям-расширениям (Extension Functions)

// 1. Расширение для String: подсчет гласных букв
fun String.countVowels(): Int {
    val vowels = setOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'a', 'e', 'i', 'o', 'u')
    return count { it.lowercaseChar() in vowels }
}

// 2. Расширение для List<Int>: поиск второго максимального элемента
fun List<Int>.secondMax(): Int? {
    return distinct().sortedDescending().getOrNull(1)
}

// 3. Расширение для Int: проверка на четность
val Int.isEven: Boolean
    get() = this % 2 == 0

// 4. Расширение для T?: безопасное получение значения или дефолта
fun <T> T?.orDefault(default: T): T {
    return this ?: default
}

fun main() {
    println("=== Практика: Extension Functions ===")

    // 1. countVowels
    val text = "Kotlin - отличный язык!"
    println("Гласных в '$text': ${text.countVowels()}")

    // 2. secondMax
    val nums = listOf(10, 42, 5, 42, 18, 99)
    println("Второй максимум в $nums: ${nums.secondMax()}")

    // 3. isEven
    println("Число 8 четное? ${8.isEven}")
    println("Число 7 четное? ${7.isEven}")

    // 4. orDefault
    val nullableStr: String? = null
    println("Результат: ${nullableStr.orDefault("Значение по умолчанию")}")
}
