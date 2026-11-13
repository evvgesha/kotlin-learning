package lessons.lesson19.homeworks

fun main() {
    println("=== 1. getMiddleElement ===")
    println(getMiddleElement(listOf(1, 2, 3))) // 2
    println(getMiddleElement(listOf(1, 2, 3, 4))) // null
    println(getMiddleElement(listOf("a", "b", "c", "d", "e"))) // c

    println("\n=== 2. ListHolder ===")
    val holder = ListHolder<String>()
    holder.add("первый")
    holder.add("второй")
    println(holder.get())

    println("\n=== 3 & 4. Mapper and PhrasesToListOfStrings ===")
    val mapper = PhrasesToListOfStrings()
    println(mapper.map("Kotlin is an awesome language"))
    println(mapper.map(listOf("Hello world", "Good morning")))

    println("\n=== 5. transposition ===")
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    val transposed = transposition(map)
    println(transposed)

    println("\n=== 6 & 7. StringValidator ===")
    val strValidator = StringValidator()
    println(strValidator.validate("Hello")) // true
    println(strValidator.validate("  ")) // false
    println(strValidator.validate(null)) // false

    println("\n=== 8. OddValidator ===")
    val oddValidator = OddValidator()
    println(oddValidator.validate(4)) // true (чётное)
    println(oddValidator.validate(7)) // false

    println("\n=== 9. ListValidator ===")
    val listValidator = ListValidator<Number>()
    println(listValidator.validate(listOf(1, 2.5, 3L))) // true
    println(listValidator.validate(listOf(1, null, 3))) // false
    println(listValidator.validate(listOf(1, 0, 3))) // false (0 приводится к 0.0)
}
