package lessons.lesson06.homeworks

// 1. По номеру месяца напечатать время года.
fun printSeason(month: Int) {
    val season = when (month) {
        12, 1, 2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Некорректный номер месяца"
    }
    println(season)
}

// 2. Перевести возраст собаки в человеческие годы.
fun printDogAgeInHumanYears(dogAge: Double) {
    if (dogAge < 0) {
        println("Возраст собаки не может быть отрицательным")
        return
    }

    if (dogAge <= 2) {
        println(dogAge * 10.5)
    } else {
        println(21 + (dogAge - 2) * 4)
    }
}

// 3. Выбрать способ перемещения по длине маршрута.
fun printTransport(distanceInKilometers: Double) {
    when {
        distanceInKilometers < 0 ->
            println("Длина маршрута не может быть отрицательной")
        distanceInKilometers <= 1 -> println("пешком")
        distanceInKilometers <= 5 -> println("велосипед")
        else -> println("автотранспорт")
    }
}

// 4. Посчитать бонусные баллы за покупку.
fun printBonusPoints(purchaseAmount: Double) {
    if (purchaseAmount < 0) {
        println("Сумма покупки не может быть отрицательной")
        return
    }

    val fullHundreds = (purchaseAmount / 100).toInt()
    if (purchaseAmount <= 1000) {
        println(fullHundreds * 2)
    } else {
        println(fullHundreds * 3)
    }
}

// 5. Определить тип документа по расширению файла.
fun printDocumentType(extension: String) {
    val fileExtension = extension.trim().removePrefix(".").lowercase()
    val documentType = when (fileExtension) {
        "txt", "doc", "docx", "pdf" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif", "bmp" -> "Изображение"
        "xls", "xlsx", "csv" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println(documentType)
}

// 6. Перевести температуру из C в F или из F в C.
fun convertTemperature(temperature: Double, unit: String) {
    when (unit.trim().uppercase()) {
        "C" -> {
            val fahrenheit = temperature * 9 / 5 + 32
            println("${fahrenheit}F")
        }
        "F" -> {
            val celsius = (temperature - 32) * 5 / 9
            println("${celsius}C")
        }
        else -> println("Неизвестная единица измерения. Используйте C или F")
    }
}

// 7. Посоветовать одежду по температуре воздуха.
fun printClothingRecommendation(temperature: Int) {
    when {
        temperature < -30 || temperature > 35 -> println("не выходить из дома")
        temperature < 10 -> println("куртка и шапка")
        temperature <= 18 -> println("ветровка")
        else -> println("футболка и шорты")
    }
}

// 8. Напечатать доступную категорию фильмов по возрасту.
fun printMovieCategory(age: Int) {
    when {
        age < 0 -> println("Возраст не может быть отрицательным")
        age <= 9 -> println("детские")
        age <= 18 -> println("подростковые")
        else -> println("18+")
    }
}

fun main() {
    printSeason(3)
    printDogAgeInHumanYears(3.0)
    printTransport(4.0)
    printBonusPoints(1200.0)
    printDocumentType("pdf")
    convertTemperature(20.0, "C")
    printClothingRecommendation(15)
    printMovieCategory(16)
}
