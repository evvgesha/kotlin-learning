package lessons.lesson22.homeworks

fun main() {
    println("=== Задачи 1 - 9: Воспроизведение и перехват исключений ===")
    runExceptionsDemo()

    println("\n=== Задача 10: catchable ===")
    // Успешный вызов без исключений
    catchable(listOf(1, 2, "3"))

    // Проверка перехвата каждого из ожидаемых типов исключений
    val testCases: List<Pair<String, Any?>> = listOf(
        "NullPointerException" to null,
        "ClassCastException" to "WTF?",
        "IndexOutOfBoundsException" to listOf(""),
        "IllegalArgumentException" to listOf(1, 2, 3),
        "NumberFormatException" to listOf(1, 2, "WTF?"),
        "IllegalStateException" to listOf(1, 2, "4")
    )

    for ((name, input) in testCases) {
        try {
            print("Проверка $name: ")
            catchable(input)
        } catch (e: Throwable) {
            println("-> Исключение выброшено дальше: ${e::class.simpleName}\n")
        }
    }

    println("=== Задача 11: MyAssertionError ===")
    try {
        throw MyAssertionError("Алярм!!")
    } catch (e: MyAssertionError) {
        println("Перехвачено: ${e.message}\n")
    }

    println("=== Задача 12: MyRuntimeException ===")
    try {
        triggerIndexOutOfBoundsAndThrowCustom()
    } catch (e: MyRuntimeException) {
        println("Перехвачено MyRuntimeException с причиной: ${e.cause}")
    }
}
