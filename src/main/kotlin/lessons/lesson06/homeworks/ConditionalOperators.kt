package lessons.lesson06.homeworks

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

fun printDogAgeInHumanYears(dogAge: Double) {
    if (dogAge < 0) {
        println("Возраст собаки не может быть отрицательным")
        return
    }

    val humanAge = if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }
    println(humanAge)
}

fun printTransport(distanceInKilometers: Double) {
    when {
        distanceInKilometers < 0 ->
            println("Длина маршрута не может быть отрицательной")
        distanceInKilometers <= 1 -> println("пешком")
        distanceInKilometers <= 5 -> println("велосипед")
        else -> println("автотранспорт")
    }
}

fun printBonusPoints(purchaseAmount: Double) {
    if (purchaseAmount < 0) {
        println("Сумма покупки не может быть отрицательной")
        return
    }

    val hundreds = (purchaseAmount / 100).toInt()
    val pointsPerHundred = if (purchaseAmount <= 1000) 2 else 3
    println(hundreds * pointsPerHundred)
}

fun printDocumentType(extension: String) {
    val normalizedExtension = extension.trim().removePrefix(".").lowercase()
    val documentType = when (normalizedExtension) {
        "txt", "doc", "docx", "pdf" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif", "bmp" -> "Изображение"
        "xls", "xlsx", "csv" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println(documentType)
}

fun convertTemperature(temperature: Double, unit: String) {
    when (unit.trim().uppercase()) {
        "C" -> {
            val fahrenheit = temperature * 9 / 5 + 32
            print(fahrenheit)
            print("F")
        }
        "F" -> {
            val celsius = (temperature - 32) * 5 / 9
            print(celsius)
            print("C")
        }
        else -> println("Неизвестная единица измерения. Используйте C или F")
    }
}

fun printClothingRecommendation(temperature: Int) {
    when {
        temperature < -30 || temperature > 35 -> println("не выходить из дома")
        temperature < 10 -> println("куртка и шапка")
        temperature <= 18 -> println("ветровка")
        else -> println("футболка и шорты")
    }
}

fun printMovieCategory(age: Int) {
    when {
        age < 0 -> println("Возраст не может быть отрицательным")
        age <= 9 -> println("детские")
        age <= 18 -> println("подростковые")
        else -> println("18+")
    }
}
