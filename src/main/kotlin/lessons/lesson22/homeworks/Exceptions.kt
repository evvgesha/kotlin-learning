package lessons.lesson22.homeworks

// Вспомогательная рекурсивная функция для вызова StackOverflowError (Задание 8)
fun recursiveCall() {
    recursiveCall()
}

// Задания 1 - 9: Воспроизведение фрагментов кода, вызывающих исключения, и их перехват в try-catch
fun runExceptionsDemo() {
    // 1. NullPointerException
    try {
        val str: String? = null
        str!!
    } catch (e: NullPointerException) {
        println("It is NullPointerException! 🎉")
    }

    // 2. IndexOutOfBoundsException
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("It is IndexOutOfBoundsException! 🎉")
    }

    // 3. ClassCastException
    try {
        val any: Any = ""
        any as Int
    } catch (e: ClassCastException) {
        println("It is ClassCastException! 🎉")
    }

    // 4. IllegalArgumentException
    try {
        require(false)
    } catch (e: IllegalArgumentException) {
        println("It is IllegalArgumentException! 🎉")
    }

    // 5. NumberFormatException
    try {
        "".toInt()
    } catch (e: NumberFormatException) {
        println("It is NumberFormatException! 🎉")
    }

    // 6. IllegalStateException
    try {
        check(false)
    } catch (e: IllegalStateException) {
        println("It is IllegalStateException! 🎉")
    }

    // 7. OutOfMemoryError
    try {
        (0..Long.MAX_VALUE).map { Long.MAX_VALUE }
    } catch (e: OutOfMemoryError) {
        println("It is OutOfMemoryError! 🎉")
    }

    // 8. StackOverflowError
    try {
        recursiveCall()
    } catch (e: StackOverflowError) {
        println("It is StackOverflowError! 🎉")
    }
}

// Задание 10: Функция, принимающая nullable аргумент типа Any
fun catchable(arg: Any?) {
    try {
        arg!!
        arg as List<*>
        arg[2]
        require(arg[2] is String)
        check((arg[2] as String).toInt() == 3)
    } catch (e: Throwable) {
        val result = when (e) {
            is NullPointerException -> "It is NullPointerException"
            is ClassCastException -> "It is ClassCastException"
            is IndexOutOfBoundsException -> "It is IndexOutOfBoundsException"
            is NumberFormatException -> "It is NumberFormatException"
            is IllegalArgumentException -> "It is IllegalArgumentException"
            is IllegalStateException -> "It is IllegalStateException"
            else -> "It is unknown exception"
        }
        println(result)
        throw e
    }
    println("We have a fantastically good argument!")
}

// Задание 12: Код, провоцирующий IndexOutOfBoundsException и выбрасывающий MyRuntimeException
fun triggerIndexOutOfBoundsAndThrowCustom() {
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("Произошёл IndexOutOfBoundsException")
        throw MyRuntimeException(e)
    }
}
