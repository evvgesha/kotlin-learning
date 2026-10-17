package lessons.lesson13.homeworks

fun main() {
    val food = mapOf(
        "Овощи" to listOf("Картофель", "Морковь", "Лук"),
        "Фрукты" to listOf("Яблоки", "Груши", "Апельсины"),
        "Ягоды" to listOf("Виноград", "Клубника", "Голубика"),
        "Орехи" to listOf("Арахис", "Фундук", "Макадамия"),
        "Зелень" to listOf(),
    )

    // 1. Создай переменную без указания типа и присвой ей значение по ключу "Овощи". Объясни какой тип переменной должен быть
    val vegetables = food["Овощи"] // Тип List<String>?, так как обращение по ключу через [] возвращает значение или null, если ключ не найден
    println(vegetables)

    // 2. Выведи данные в виде "Ключ: Значение1, Значение2" используя цикл for а потом функцию forEach
    for ((key, value) in food) {
        println("$key: ${value.joinToString(", ")}")
    }
    food.forEach { (key, value) ->
        println("$key: ${value.joinToString(", ")}")
    }

    // 3. Создай not nullable переменную типа List<String> и присвой ей значение по ключу "Фрукты"
    val fruits: List<String> = food.getValue("Фрукты")
    println(fruits)

    // 4. Создай not nullable переменную типа List<String> и присвой ей значение по ключу "Крупы". Используй в качестве значения по умолчанию пустой список,  если ключа нет
    val cereals: List<String> = food.getOrDefault("Крупы", emptyList())
    println(cereals)

    // 5. Создай not nullable переменную типа List<String> и присвой ей значение по ключу "Рыба". Если ключа нет, нужно вывести в консоль сообщение об отсутствии ключа и присвоить переменной пустой список
    val fish: List<String> = food.getOrElse("Рыба") {
        println("Ключ \"Рыба\" не найден")
        emptyList()
    }
    println(fish)

    // 6. Выведи сообщение "Продукты для вегетарианца" если в словаре нет ключей "Мясо" и "Рыба"
    if (!food.containsKey("Мясо") && !food.containsKey("Рыба")) {
        println("Продукты для вегетарианца")
    }

    // 7. Преобразуй словарь в список строк типа "Ключ: [значение1, значение2]"
    val foodList: List<String> = food.map { "${it.key}: ${it.value}" }
    println(foodList)

    // 8. Преобразуй ключи словаря путём добавления порядкового номера, чтобы получилось "1. Овощи", "2. Фрукты" и так далее
    val numberedFood = food.entries.mapIndexed { index, (key, value) ->
        "${index + 1}. $key" to value
    }.toMap()
    println(numberedFood)

    // 9. Преобразуй значения словаря в среднюю длину строк списка
    val avgLengths = food.mapValues { (_, items) ->
        if (items.isEmpty()) 0.0 else items.map { it.length }.average()
    }
    println(avgLengths)

    // 10. Выведи сообщение "Продуктов нет" если словарь пуст
    if (food.isEmpty()) {
        println("Продуктов нет")
    }

    // 11. Выведи сообщение "Не все категории заполнены", если есть хотя-бы один пустой список в значениях. Реализуй для методов all и any
    if (food.values.any { it.isEmpty() }) {
        println("Не все категории заполнены (через any)")
    }
    if (!food.values.all { it.isNotEmpty() }) {
        println("Не все категории заполнены (через all)")
    }

    // 12. Отфильтруй словарь по ключам, начинающихся с буквы "О"
    val filteredByO = food.filterKeys { it.startsWith("О") }
    println(filteredByO)

    // 13. Отфильтруй словарь так, чтобы в списке продуктов был хотя бы один начинающийся на "А". Методы any и all можно применять к коллекциям
    val filteredByA = food.filterValues { items -> items.any { it.startsWith("А") } }
    println(filteredByA)

    // 14. Посчитай количество ключей, значения которых содержат слова с буковой "д"
    val countWithD = food.count { (_, items) -> items.any { it.contains("д", ignoreCase = true) } }
    println(countWithD)

    // 15. Создай новый словарь из food в котором нет орехов
    val foodWithoutNuts = food - "Орехи"
    println(foodWithoutNuts)

    // 16. Преобразуй в изменяемый словарь и добавь в него мясо
    val mutableFood = food.toMutableMap()
    mutableFood["Мясо"] = listOf("Говядина", "Свинина", "Курица")
    println(mutableFood)

    // 17. Удали из этого изменяемого словаря фрукты и ягоды
    mutableFood.remove("Фрукты")
    mutableFood.remove("Ягоды")
    println(mutableFood)
}
