package lessons.lesson17.homeworks

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
}
