package lessons.lesson17.homeworks

class GameMachine(
    val color: String,
    val model: String,
    val hasGamePad: Boolean,
) {
    private var isOn: Boolean = false
    private var osIsLoaded: Boolean = false
    private var owner: String = ""
    private var balance: Double = 0.0
    private var gameSessionIsCharged: Boolean = false
    private var sessionCost: Double = 5.0
    private var pin: String = "1234"

    var supportPhone: String = ""
        private set

    private val games: MutableList<String> = mutableListOf(
        "Mario",
        "Bomber",
        "Tetris",
        "Death stranding"
    )

    fun turnOn() {
        isOn = true
        loadOs()
    }

    fun turnOff() {
        shutDownOs()
        isOn = false
    }

    private fun loadOs() {
        osIsLoaded = true
        println("ОС загружена")
    }

    private fun shutDownOs() {
        osIsLoaded = false
        println("Работа ОС завершена")
    }

    fun showGames(): List<String> = games.toList()

    fun play(gameName: String) {
        if (!isOn) {
            println("Автомат выключен")
            return
        }
        if (!gameSessionIsCharged) {
            println("Оплати игру прежде чем начать")
            return
        }
        if (gameName !in games) {
            println("Игра '$gameName' не найдена")
        } else {
            println("Игра '$gameName' запущена")
        }
        gameSessionIsCharged = false
    }

    fun pay() {
        balance += sessionCost
        gameSessionIsCharged = true
    }

    fun withdraw(pin: String): Double {
        if (pin != this.pin) {
            return 0.0
        }
        return openSafe()
    }

    private fun openSafe(): Double {
        val withdraw = balance
        balance = 0.0
        return withdraw
    }
}
