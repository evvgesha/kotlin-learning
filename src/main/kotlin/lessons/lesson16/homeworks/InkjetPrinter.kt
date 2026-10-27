package lessons.lesson16.homeworks

class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        "\u001B[31;43m", // красный на жёлтом
        "\u001B[32;44m", // зелёный на синем
        "\u001B[33;45m", // жёлтый на фиолетовом
        "\u001B[34;42m", // синий на зелёном
        "\u001B[35;46m", // фиолетовый на бирюзовом
        "\u001B[36;41m"  // бирюзовый на красном
    )

    override fun print(text: String) {
        val words = text.split(" ")
        words.forEachIndexed { index, word ->
            val style = colorPairs[index % colorPairs.size]
            println("$style$word\u001B[0m")
        }
    }
}