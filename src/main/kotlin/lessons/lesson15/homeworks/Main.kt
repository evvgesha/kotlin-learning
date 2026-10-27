package lessons.lesson15.homeworks

fun main() {
    // Задания 1 - 3
    val circle = Circle(5.0)
    val triangle = Triangle(3.0, 4.0, 5.0)
    println("${circle.name}: радиус ${circle.radius}")
    println("${triangle.name}: сторон ${triangle.sidesCount}")

    val highSchool = HighSchool("Лицей №1", "Москва", "Физмат")
    println("${highSchool.name} (${highSchool.city}): профиль ${highSchool.specialization}")

    val desk = Desk("Дуб", "Коричневый", 3)
    println("Стол из ${desk.material}, ящиков: ${desk.drawersCount}")

    // Задание 4: InsertFirstMaterial
    println("\n--- InsertFirstMaterial ---")
    val first = InsertFirstMaterial()
    first.addMaterial("Базовый 1")
    first.addMaterial("Базовый 2")
    first.insert("Первый на дне")
    first.printContainer()

    // Задание 5: InsertOneByOneMaterials
    println("\n--- InsertOneByOneMaterials ---")
    val oneByOne = InsertOneByOneMaterials()
    oneByOne.addMaterial("Существующий 1")
    oneByOne.addMaterial("Существующий 2")
    oneByOne.insert(listOf("Новый 1", "Новый 2", "Новый 3"))
    oneByOne.printContainer()

    // Задание 6: InsertSortedMaterials
    println("\n--- InsertSortedMaterials ---")
    val sorted = InsertSortedMaterials()
    sorted.addMaterial("Банан")
    sorted.addMaterial("Яблоко")
    sorted.insert("Апельсин")
    sorted.printContainer()

    // Задание 7: InsertMapMaterials
    println("\n--- InsertMapMaterials ---")
    val mapMat = InsertMapMaterials()
    mapMat.addMaterial("Центр")
    mapMat.insert(linkedMapOf("Ключ1" to "Значение1", "Ключ2" to "Значение2"))
    mapMat.printContainer()
}