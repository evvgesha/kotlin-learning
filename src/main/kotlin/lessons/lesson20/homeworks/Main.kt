package lessons.lesson20.homeworks

fun main() {
    println("=== 1. getAround ===")
    println(arrayOf(1, 2, 3, 4, 5).getAround()) // (1, 5)
    println(emptyArray<Int>().getAround()) // (null, null)

    println("\n=== 2. MutableList.sort ===")
    val numbers = mutableListOf(5, 2, 8, 1, 9)
    val asc = numbers.sort(true)
    println("По возрастанию: $asc, исходный: $numbers")
    val desc = numbers.sort(false)
    println("По убыванию: $desc, исходный: $numbers")

    println("\n=== 3. mapByIndex ===")
    val map: Map<String, List<String>>? = mapOf(
        "fruits" to listOf("apple", "banana", "cherry"),
        "animals" to listOf("dog", "cat"),
        "empty" to emptyList()
    )
    println(map.mapByIndex(0)) // {fruits=apple, animals=dog, empty=null}
    println(map.mapByIndex(2)) // {fruits=cherry, animals=null, empty=null}
    val nullMap: Map<String, List<String>>? = null
    println(nullMap.mapByIndex(0)) // null

    println("\n=== 4. Number.within ===")
    println(10.within(12, 3)) // true (12 - 10 = 2 <= 3)
    println(10.within(15, 3)) // false (15 - 10 = 5 > 3)
    println(5.5.within(5.2, 0.5)) // true

    println("\n=== 5. encrypt & decrypt ===")
    val original = "Hello Kotlin 2026!"
    val encrypted = original.encrypt(3)
    val decrypted = encrypted.decrypt(3)
    println("Original: $original")
    println("Encrypted: $encrypted")
    println("Decrypted: $decrypted")
    println("Matches: ${original == decrypted}")

    println("\n=== 6. twitterize ===")
    "Котлин".twitterize(listOf("@alex", "@ivan", "@sergey"))
}
