package lessons.lesson14.homeworks

fun main() {
    println("--- Проверка задания 1: Party ---")
    val party = Party("Центральный парк", 25)
    party.details()

    println("\n--- Проверка задания 2: Emotion ---")
    val joy = Emotion("Радость", 9)
    joy.express()
    val calm = Emotion("Спокойствие", 3)
    calm.express()

    println("\n--- Проверка задания 3: Moon ---")
    Moon.showPhase()
    Moon.phase = "Waxing Crescent"
    Moon.showPhase()

    println("\n--- Проверка задания 4: Product ---")
    val apple = Product("Яблоки", 120.5, 10)
    println(apple)

    println("\n--- Проверка задания 5: Concert ---")
    val concert = Concert("Кино", "Олимпийский", 3500.0, 2)
    concert.printInfo()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()
    concert.printInfo()

    println("\n--- Проверка задания 6: Rack & Shelf ---")
    val rack = Rack(maxShelves = 3)
    val shelf1 = Shelf(capacity = 15)
    val shelf2 = Shelf(capacity = 20)
    rack.addShelf(shelf1)
    rack.addShelf(shelf2)

    rack.addItem("Книга")
    rack.addItem("Ноутбук")
    rack.addItem("Кружка")
    rack.printContents()

    println("Удаление полки 0 с перераспределением:")
    val failed = rack.advancedRemoveShelf(0)
    println("Не поместилось: $failed")
    rack.printContents()
}