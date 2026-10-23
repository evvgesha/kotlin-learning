package lessons.lesson14.homeworks

fun main() {
    // 1. Party
    val party = Party("Beach House", 20)
    party.details()

    // 2. Emotion
    val emotion = Emotion("happiness", 8)
    emotion.express()

    // 3. Moon
    Moon.showPhase()

    // 4. Product
    val apple = Product("Apple", 0.5, 10)
    println(apple)

    // 5. Concert
    val concert = Concert("The Beatles", "Madison Square Garden", 5000, 1000)
    concert.printDetails()
    concert.buyTicket()
    concert.printDetails()

    // 6. Rack & Shelf
    val rack = Rack(3)
    val shelf1 = Shelf(15)
    val shelf2 = Shelf(20)
    rack.addShelf(shelf1)
    rack.addShelf(shelf2)
    rack.addItem("Книга")
    rack.addItem("Ноутбук")
    rack.printContents()
}