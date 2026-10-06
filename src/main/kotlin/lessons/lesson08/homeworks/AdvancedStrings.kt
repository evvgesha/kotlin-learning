package lessons.lesson08.homeworks

// 7. Все слова с большой буквы
fun capitalWords(text: String): String {
    val words = text.split(" ")
    var result = ""

    for (word in words) {
        if (word.isNotEmpty()) {
            result += word[0].uppercase() + word.substring(1).lowercase() + " "
        }
    }

    return result.trim()
}

// 8. Игра в разведчика
fun encrypt(text: String) {
    var paddedText = text
    if (paddedText.length % 2 != 0) paddedText += " "

    var encryptedText = ""
    for (index in paddedText.indices step 2) {
        encryptedText += paddedText[index + 1]
        encryptedText += paddedText[index]
    }

    println(encryptedText)
}

fun decrypt(text: String) {
    var decryptedText = ""
    for (index in text.indices step 2) {
        decryptedText += text[index + 1]
        decryptedText += text[index]
    }

    println(decryptedText.trim())
}

// 9. Таблица умножения с динамической шириной столбцов
fun multiplicationTable(start: Int, end: Int) {
    var columnWidth = maxOf(start.toString().length, end.toString().length)

    for (row in start..end) {
        for (column in start..end) {
            columnWidth = maxOf(columnWidth, (row * column).toString().length)
        }
    }

    print(" ".repeat(columnWidth))
    for (column in start..end) {
        print("%${columnWidth}d".format(column))
    }
    println()

    for (row in start..end) {
        print("%${columnWidth}d".format(row))
        for (column in start..end) {
            print("%${columnWidth}d".format(row * column))
        }
        println()
    }
}

fun main() {
    val task = 7 // Поменяй на 8 или 9, чтобы запустить другую задачу.

    when (task) {
        7 -> println(capitalWords("котлин лучший язык программирования"))
        8 -> {
            encrypt("Kotlin")
            decrypt("oKltni")
        }
        9 -> multiplicationTable(1, 5)
    }
}
