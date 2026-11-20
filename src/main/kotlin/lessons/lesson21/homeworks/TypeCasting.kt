package lessons.lesson21.homeworks

// Задача 1: Определение типа данных через оператор is
fun analyzeDataType(data: Any) {
    when (data) {
        is String -> println("Это строка: $data")
        is Number -> println("Это число: $data")
        is List<*> -> println("Это список, количество элементов: ${data.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${data.size}")
        else -> println("Неизвестный тип данных")
    }
}

// Задача 2: Безопасное приведение к списку с использованием as?
fun safeCastToList(data: Any): Int {
    val list = data as? List<*>
    return list?.size ?: -1
}

// Задача 3: Длина строки или 0 для Any?
fun getStringLengthOrZero(data: Any?): Int {
    val str = data as? String
    return str?.length ?: 0
}

// Задача 4: Функция-расширение toSquare для Any
fun Any.toSquare(): Double {
    val num = when (this) {
        is Number -> this.toDouble()
        is String -> this.toDouble()
        else -> throw IllegalArgumentException("Unsupported type for squaring: $this")
    }
    return num * num
}

// Задача 5: Сумма Int и Double значений в списке
fun sumIntOrDoubleValues(list: List<Any>): Double {
    var sum = 0.0
    for (item in list) {
        when (item) {
            is Int -> sum += item.toDouble()
            is Double -> sum += item
        }
    }
    return sum
}

// Задача 6: Безопасное приведение к List<*> и печать строк с предупреждениями
fun tryCastToListAndPrint(data: Any) {
    val list = data as? List<*>
    if (list != null) {
        for (item in list) {
            if (item is String) {
                println(item)
            } else {
                println("Предупреждение: элемент '$item' не является строкой")
            }
        }
    } else {
        println("Ошибка: переданный объект не является списком")
    }
}
