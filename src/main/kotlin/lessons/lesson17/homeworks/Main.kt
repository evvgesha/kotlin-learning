package lessons.lesson17.homeworks

class RemainderOperation : Operation("%") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] % operands[1]).toString()
    }
}

fun main() {
    println("=== 1. Игровой автомат ===")
    val machine = GameMachine(
        color = "Красный",
        model = "ArcadePro-2026",
        hasGamePad = true
    )
    println("Игры: ${machine.showGames()}")
    machine.turnOn()
    machine.play("Mario") // без оплаты
    machine.pay()
    machine.play("Mario") // с оплатой
    println("Снятие с неверным пином: ${machine.withdraw("0000")}")
    println("Снятие с верным пином: ${machine.withdraw("1234")}")
    machine.turnOff()

    println("\n=== 2. Почемучка ===")
    val children = ChildrenClass(
        privateVal = "privateVal_custom",
        protectedVal = "protectedVal_custom",
        publicVal = "publicVal_custom"
    )

    // 1. Поле privateVal доступно для чтения из children
    println("children.privateVal: ${children.privateVal}")

    // 3. Изменяем publicField на "Антонио Бандераса"
    children.publicField = "Антонио Бандерас"

    // 5. Изменяем protectedField через сеттер в наследнике
    children.updateProtectedField("Новое значение ProtectedField")

    // 8. Печатаем getAll()
    println("\nСостояние всех полей через getAll():")
    println(children.getAll())

    // 12. Проверяем вызов printText()
    println("\nВызов printText():")
    children.printText()

    println("\n=== 3. Калькулятор ===")
    val calculator = Calculator(listOf(RemainderOperation()))
    println("3 + 5 = ${calculator.operate("3 + 5")}")
    println("10 - 4 = ${calculator.operate("10 - 4")}")
    println("6 * 7 = ${calculator.operate("6 * 7")}")
    println("20 / 4 = ${calculator.operate("20 / 4")}")
    println("20 / 0 = ${calculator.operate("20 / 0")}")
    println("10 % 3 = ${calculator.operate("10 % 3")}")
    println("2 ^ 3 = ${calculator.operate("2 ^ 3")}")
}
