package lessons.lesson21.homeworks

fun main() {
    println("=== Задача 1: analyzeDataType ===")
    analyzeDataType("Привет, Котлин!")
    analyzeDataType(42)
    analyzeDataType(3.14)
    analyzeDataType(listOf(1, 2, 3, 4))
    analyzeDataType(mapOf("a" to 1, "b" to 2))
    analyzeDataType(true)

    println("\n=== Задача 2: safeCastToList ===")
    println(safeCastToList(listOf("apple", "banana", "cherry"))) // 3
    println(safeCastToList("не список")) // -1
    println(safeCastToList(123)) // -1

    println("\n=== Задача 3: getStringLengthOrZero ===")
    println(getStringLengthOrZero("Kotlin")) // 6
    println(getStringLengthOrZero(null)) // 0
    println(getStringLengthOrZero(12345)) // 0

    println("\n=== Задача 4: toSquare ===")
    println(4.toSquare()) // 16.0
    println(4.2.toSquare()) // 17.64
    println("4.2".toSquare()) // 17.64
    println("5".toSquare()) // 25.0

    println("\n=== Задача 5: sumIntOrDoubleValues ===")
    val mixedList: List<Any> = listOf(10, "строка", 5.5, true, 20, 4.5, listOf(1, 2))
    println("Сумма Int и Double: ${sumIntOrDoubleValues(mixedList)}") // 40.0

    println("\n=== Задача 6: tryCastToListAndPrint ===")
    val listWithDifferentTypes: Any = listOf("Первая строка", 100, "Вторая строка", false, "Третья строка")
    tryCastToListAndPrint(listWithDifferentTypes)
    println("--- Тест с не-списком ---")
    tryCastToListAndPrint("Просто строка")
}
