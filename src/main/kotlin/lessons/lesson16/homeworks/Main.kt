package lessons.lesson16.homeworks

fun main() {
    println("=== 1. Животные и их звуки ===")
    val animals: List<Animal> = listOf(Animal(), Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }

    println("\n=== 2. Геометрические фигуры и площади ===")
    val shapes: List<Shape> = listOf(
        Circle(radius = 3.0),
        Square(side = 4.0),
        Triangle(a = 3.0, b = 4.0, angleDeg = 90.0)
    )
    for (shape in shapes) {
        println("Площадь: ${shape.area()}")
    }

    println("\n=== 3. Принтеры ===")
    val text = "Kotlin supports object oriented programming and polymorphism perfectly"
    println("Лазерный принтер:")
    val laser = LaserPrinter()
    laser.print(text)

    println("\nСтруйный принтер:")
    val inkjet = InkjetPrinter()
    inkjet.print(text)

    println("\n=== 4. Корзина товаров ===")
    val cart = ShoppingCart()
    cart.addToCart("apple_fresh")
    cart.addToCart("banana_sweet", 3)
    cart.addToCart(mapOf("orange_juice" to 2, "milk_organic" to 1))
    cart.addToCart(listOf("apple_fresh", "cookie_choco"))
    println(cart)

    println("\n=== 5. Логгер ===")
    val logger = Logger()
    logger.log("Приложение успешно запущено")
    logger.log("WARNING", "Использование памяти превышает 80%")
    logger.log("ERROR", "Сетевое соединение потеряно")
    logger.log(listOf("Синхронизация данных...", "Данные обновлены"))
    logger.log(IllegalStateException("Некорректное состояние транзакции"))
}