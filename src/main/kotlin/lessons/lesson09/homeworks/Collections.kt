package lessons.lesson09.homeworks

// Найти элемент массива, в котором есть указанная подстрока, и напечатать его.
fun printElementContaining(words: Array<String>, part: String) {
    for (word in words) {
        if (word.contains(part)) {
            println(word)
            return
        }
    }
}

// Проверить циклом, есть ли строка во множестве, и напечатать true или false.
fun printIsInSet(words: Set<String>, wordToFind: String) {
    var found = false

    for (word in words) {
        if (word == wordToFind) {
            found = true
            break
        }
    }

    println(found)
}

fun main() {
    // 1. Создать массив из пяти целых чисел со значениями от 1 до 5.
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // 2. Создать пустой массив строк размером 10 элементов.
    val emptyWords = Array(10) { "" }

    // 3. Создать массив Double, где каждое значение равно удвоенному индексу.
    val doubledIndexes = DoubleArray(5) { index -> index * 2.0 }

    // 4. Заполнить массив значениями индексов, умноженных на 3.
    val tripledIndexes = IntArray(5)
    for (index in tripledIndexes.indices) {
        tripledIndexes[index] = index * 3
    }

    // 5. Создать массив из трёх nullable строк: одна null и две строки.
    val nullableWords = arrayOf<String?>("один", null, "два")

    // 6. Скопировать массив целых чисел в новый массив с помощью цикла.
    val copiedNumbers = IntArray(numbers.size)
    for (index in numbers.indices) {
        copiedNumbers[index] = numbers[index]
    }

    // 7. Вычесть значения второго массива из первого и напечатать результат.
    val firstNumbers = intArrayOf(10, 20, 30)
    val secondNumbers = intArrayOf(1, 2, 3)
    val differences = IntArray(firstNumbers.size)
    for (index in firstNumbers.indices) {
        differences[index] = firstNumbers[index] - secondNumbers[index]
        println(differences[index])
    }

    // 8. Найти индекс числа 5 в массиве циклом while или напечатать -1.
    val numbersToSearch = intArrayOf(3, 8, 5, 1)
    var index = 0
    var fiveIndex = -1
    while (index < numbersToSearch.size) {
        if (numbersToSearch[index] == 5) {
            fiveIndex = index
            break
        }
        index++
    }
    println(fiveIndex)

    // 9. Напечатать каждый элемент массива и указать, чётный он или нечётный.
    for (number in numbersToSearch) {
        if (number % 2 == 0) {
            println("$number чётное")
        } else {
            println("$number нечётное")
        }
    }

    // 10. Найти и напечатать элемент массива строк, содержащий указанную подстроку.
    printElementContaining(arrayOf("яблоко", "банан", "ананас"), "нан")

    // 1. Создать пустой неизменяемый список целых чисел.
    val emptyNumbers = emptyList<Int>()

    // 2. Создать неизменяемый список из трёх строк.
    val greetings = listOf("Hello", "World", "Kotlin")

    // 3. Создать изменяемый список чисел от 1 до 5.
    val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)

    // 4. Добавить в список числа 6, 7 и 8.
    mutableNumbers.add(6)
    mutableNumbers.add(7)
    mutableNumbers.add(8)

    // 5. Удалить из списка строк элемент "World".
    val mutableGreetings = mutableListOf("Hello", "World", "Kotlin")
    mutableGreetings.remove("World")

    // 6. Напечатать каждый элемент списка целых чисел.
    for (number in mutableNumbers) {
        println(number)
    }

    // 7. Получить и напечатать второй элемент списка строк.
    val words = listOf("первый", "второй", "третий")
    println(words[1])

    // 8. Изменить элемент списка с индексом 2.
    mutableNumbers[2] = 100

    // 9. Объединить два списка строк с помощью циклов.
    val firstWords = listOf("раз", "два")
    val secondWords = listOf("три", "четыре")
    val allWords = mutableListOf<String>()
    for (word in firstWords) {
        allWords.add(word)
    }
    for (word in secondWords) {
        allWords.add(word)
    }

    // 10. Найти минимальный и максимальный элементы списка с помощью цикла.
    val values = listOf(5, 2, 9, -1, 7)
    var minimum = values[0]
    var maximum = values[0]
    for (value in values) {
        if (value < minimum) minimum = value
        if (value > maximum) maximum = value
    }
    println(minimum)
    println(maximum)

    // 11. Создать новый список только из чётных чисел исходного списка.
    val evenNumbers = mutableListOf<Int>()
    for (value in values) {
        if (value % 2 == 0) {
            evenNumbers.add(value)
        }
    }

    // 1. Создать пустое неизменяемое множество целых чисел.
    val emptyNumberSet = emptySet<Int>()

    // 2. Создать неизменяемое множество из трёх чисел.
    val numberSet = setOf(1, 2, 3)

    // 3. Создать изменяемое множество строк.
    val mutableWordSet = mutableSetOf("Kotlin", "Java", "Scala")

    // 4. Добавить в множество строки "Swift" и "Go".
    mutableWordSet.add("Swift")
    mutableWordSet.add("Go")

    // 5. Удалить число 2 из изменяемого множества.
    val mutableNumberSet = mutableSetOf(1, 2, 3)
    mutableNumberSet.remove(2)

    // 6. Напечатать каждый элемент множества целых чисел.
    for (number in numberSet) {
        println(number)
    }

    // 7. Проверить циклом, есть ли строка во множестве.
    printIsInSet(mutableWordSet, "Java")

    // 8. Скопировать неизменяемое множество строк в изменяемый список циклом.
    val fixedWords = setOf("один", "два", "три")
    val wordList = mutableListOf<String>()
    for (word in fixedWords) {
        wordList.add(word)
    }
}
