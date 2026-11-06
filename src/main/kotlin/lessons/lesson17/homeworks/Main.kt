package lessons.lesson17.homeworks

/*
class Equals : Operation("==") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] == operands[1]).toString()
    }
}
*/

fun main() {
    val machine = GameMachine(
        color = "черный",
        model = "Sega",
        hasGamePad = true
    )
    machine.turnOn()
    machine.pay()
    machine.play("Mario")
    println(machine.withdraw("1234"))
    machine.turnOff()

    val children = ChildrenClass(
        "privateVal",
        "protectedVal",
        "publicVal"
    )
    children.publicField = "Антонио Бандерас"
    children.updateProtectedField("Новое значение ProtectedField")
    println(children.getAll())
    children.printText()

    // Задание повышенной сложности (калькулятор) — убрано из запуска, но сохранено:
    /*
    val calculator = Calculator(listOf(Equals()))
    println(calculator.operate("10 + 5"))
    println(calculator.operate("10 - 5"))
    println(calculator.operate("10 * 5"))
    println(calculator.operate("10 / 2"))
    println(calculator.operate("10 == 10"))
    */
}

