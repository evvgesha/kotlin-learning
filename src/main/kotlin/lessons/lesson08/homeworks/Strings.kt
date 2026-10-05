package lessons.lesson08.homeworks

// 1. Преобразовать фразу по первому подходящему правилу и напечатать результат.
fun printFunnyPhrase(phrase: String) {
    val result = when {
        phrase.contains("невозможно") ->
            phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")

        phrase.startsWith("Я не уверен") ->
            "$phrase, но моя интуиция говорит об обратном"

        phrase.contains("катастрофа") ->
            phrase.replace("катастрофа", "интересное событие")

        phrase.endsWith("без проблем") ->
            phrase.replace("без проблем", "с парой интересных вызовов на пути")

        phrase.trim().isNotEmpty() && !phrase.trim().contains(" ") ->
            "Иногда, ${phrase.trim()}, но не всегда"

        else -> phrase
    }
    println(result)
}

// 2. Извлечь дату и время из строки лога и напечатать их по очереди.
fun printLogDateAndTime(log: String) {
    val dateAndTime = log.substringAfter("->").trim().split(" ")
    println(dateAndTime[0])
    println(dateAndTime[1])
}

// 3. Скрыть все цифры номера карты, кроме последних четырёх.
fun printMaskedCardNumber(cardNumber: String) {
    val digits = cardNumber.replace(" ", "")
    val hiddenDigits = "*".repeat(digits.length - 4)
    println(hiddenDigits + digits.takeLast(4))
}

// 4. Заменить символы адреса электронной почты на слова.
fun printFormattedEmail(email: String) {
    println(email.replace("@", " [at] ").replace(".", " [dot] "))
}

// 5. Напечатать имя файла с расширением из полного пути.
fun printFileName(path: String) {
    println(path.substringAfterLast("/"))
}

// 6. Составить и напечатать аббревиатуру из первых букв слов.
fun printAbbreviation(phrase: String) {
    val words = phrase.split(" ")
    var abbreviation = ""

    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0]
        }
    }

    println(abbreviation)
}

fun main() {
    printFunnyPhrase("Это невозможно выполнить за один день")
    printFunnyPhrase("Я не уверен в успехе этого проекта")
    printFunnyPhrase("Произошла катастрофа на сервере")
    printFunnyPhrase("Этот код работает без проблем")
    printFunnyPhrase("Удача")

    printLogDateAndTime("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    printMaskedCardNumber("4539 1488 0343 6467")
    printFormattedEmail("username@example.com")
    printFileName("C:/Пользователи/Документы/report.txt")
    printAbbreviation("Котлин лучший язык программирования")
}
