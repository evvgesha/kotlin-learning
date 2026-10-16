package lessons.lesson13.homeworks

val food = mapOf(
    "Овощи" to listOf("Картофель", "Морковь", "Лук"),
    "Фрукты" to listOf("Яблоки", "Груши", "Апельсины"),
    "Ягоды" to listOf("Виноград", "Клубника", "Голубика"),
    "Орехи" to listOf("Арахис", "Фундук", "Макадамия"),
    "Зелень" to listOf(),
)

fun main() {
    task1() // Чтобы проверить другую задачу, замените здесь номер.
}

// ==========================================
// Практические задания
// ==========================================

// 1. Создай переменную без указания типа и присвой ей значение по ключу "Овощи". Объясни какой тип переменной должен быть.
fun task1() {
    val vegetables = food["Овощи"]
    // Тип переменной: List<String>? (nullable список строк), так как при обращении по ключу через map[key]
    // значение может отсутствовать (вернётся null).
    println("Тип: List<String>?, значение: $vegetables")
}

// 2. Выведи данные в виде "Ключ: Значение1, Значение2" используя цикл for а потом функцию forEach.
fun task2() {
    println("--- Цикл for ---")
    for ((category, items) in food) {
        println("$category: ${items.joinToString(", ")}")
    }

    println("--- Функция forEach ---")
    food.forEach { (category, items) ->
        println("$category: ${items.joinToString(", ")}")
    }
}

// 3. Создай not nullable переменную типа List<String> и присвой ей значение по ключу "Фрукты".
fun task3() {
    val fruits: List<String> = food.getValue("Фрукты")
    println(fruits)
}

// 4. Создай not nullable переменную типа List<String> и присвой ей значение по ключу "Крупы". Используй в качестве значения по умолчанию пустой список, если ключа нет.
fun task4() {
    val cereals: List<String> = food.getOrDefault("Крупы", emptyList())
    println(cereals)
}

// 5. Создай not nullable переменную типа List<String> и присвой ей значение по ключу "Рыба". Если ключа нет, нужно вывести в консоль сообщение об отсутствии ключа и присвоить переменной пустой список.
fun task5() {
    val fish: List<String> = food.getOrElse("Рыба") {
        println("Ключ 'Рыба' отсутствует в словаре")
        emptyList()
    }
    println(fish)
}

// 6. Выведи сообщение "Продукты для вегетарианца" если в словаре нет ключей "Мясо" и "Рыба"
fun task6() {
    if (!food.containsKey("Мясо") && !food.containsKey("Рыба")) {
        println("Продукты для вегетарианца")
    }
}

// 7. Преобразуй словарь в список строк типа "Ключ: [значение1, значение2]"
fun task7() {
    val result: List<String> = food.map { (category, items) ->
        "$category: [${items.joinToString(", ")}]"
    }
    println(result)
}

// 8. Преобразуй ключи словаря путём добавления порядкового номера, чтобы получилось "1. Овощи", "2. Фрукты" и так далее
fun task8() {
    var index = 1
    val result = food.mapKeys { "${index++}. ${it.key}" }
    println(result)
}

// 9. Преобразуй значения словаря в среднюю длину строк списка
fun task9() {
    val result = food.mapValues { (_, items) ->
        if (items.isEmpty()) 0.0 else items.map { it.length }.average()
    }
    println(result)
}

// 10. Выведи сообщение "Продуктов нет" если словарь пуст
fun task10() {
    if (food.isEmpty()) {
        println("Продуктов нет")
    }
}

// 11. Выведи сообщение "Не все категории заполнены", если есть хотя-бы один пустой список в значениях. Реализуй для методов all и any
fun task11() {
    // Через any: есть хотя бы одна пустая категория
    if (food.values.any { it.isEmpty() }) {
        println("Не все категории заполнены (any)")
    }

    // Через all: не все категории непустые
    if (!food.values.all { it.isNotEmpty() }) {
        println("Не все категории заполнены (all)")
    }
}

// 12. Отфильтруй словарь по ключам, начинающихся с буквы "О"
fun task12() {
    val result = food.filterKeys { it.startsWith("О") }
    println(result)
}

// 13. Отфильтруй словарь так, чтобы в списке продуктов был хотя бы один начинающийся на "А". Методы any и all можно применять к коллекциям
fun task13() {
    val result = food.filterValues { items -> items.any { it.startsWith("А") } }
    println(result)
}

// 14. Посчитай количество ключей, значения которых содержат слова с буквой "д"
fun task14() {
    val count = food.count { (_, items) ->
        items.any { it.contains("д", ignoreCase = true) }
    }
    println(count)
}

// 15. Создай новый словарь из food в котором нет орехов
fun task15() {
    val withoutNuts = food - "Орехи"
    println(withoutNuts)
}

// 16. Преобразуй в изменяемый словарь и добавь в него мясо
fun task16() {
    val mutableFood = food.toMutableMap()
    mutableFood["Мясо"] = listOf("Курица", "Говядина", "Свинина")
    println(mutableFood)
}

// 17. Удали из этого изменяемого словаря фрукты и ягоды
fun task17() {
    val mutableFood = food.toMutableMap()
    mutableFood["Мясо"] = listOf("Курица", "Говядина", "Свинина")
    mutableFood.remove("Фрукты")
    mutableFood.remove("Ягоды")
    println(mutableFood)
}