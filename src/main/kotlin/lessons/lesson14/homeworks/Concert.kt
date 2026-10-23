package lessons.lesson14.homeworks

class Concert(
    val band: String,
    val location: String,
    val price: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    fun printInfo() {
        println("Концерт группы $band в $location. Цена билета: $price. Вместимость: $capacity. Продано билетов: $soldTickets")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Билет на концерт $band успешно куплен! Всего продано: $soldTickets")
        } else {
            println("Не удалось купить билет: все места на концерт $band распроданы!")
        }
    }
}