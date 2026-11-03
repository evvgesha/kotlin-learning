package lessons.lesson17.homeworks

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Lesson17Test {

    @Test
    fun testGameMachine() {
        val machine = GameMachine(
            color = "Blue",
            model = "Retro-90",
            hasGamePad = true
        )
        assertTrue(machine.showGames().contains("Mario"))
        machine.turnOn()
        machine.pay()
        machine.play("Mario")
        assertEquals(0.0, machine.withdraw("wrong"))
        assertEquals(5.0, machine.withdraw("1234"))
        machine.turnOff()
    }

    @Test
    fun testChildrenClass() {
        val children = ChildrenClass(
            privateVal = "customPrivate",
            protectedVal = "customProtected",
            publicVal = "customPublic"
        )
        assertEquals("customPrivate", children.privateVal)
        assertEquals("customPublic", children.publicVal)

        // Verify publicField modification to "Антонио Бандерас"
        children.publicField = "Антонио Бандерас"
        assertTrue(children.getAll().contains("publicField: Антонио Бандерас"))

        // Verify protectedField update
        children.updateProtectedField("Updated Protected")
        assertTrue(children.getAll().contains("protectedField: Updated Protected"))

        // Verify generate() returns child class generation
        assertTrue(children.getAll().contains("generate: Это генерация из дочернего класса"))
    }

    @Test
    fun testCalculator() {
        val calc = Calculator()
        assertEquals("8.0", calc.operate("3 + 5"))
        assertEquals("-2.0", calc.operate("3 - 5"))
        assertEquals("15.0", calc.operate("3 * 5"))
        assertEquals("2.5", calc.operate("5 / 2"))
        assertEquals("Division by zero", calc.operate("5 / 0"))
        assertTrue(calc.operate("5 ^ 2").startsWith("Unsupported operator"))
    }

    @Test
    fun testMainExecution() {
        main()
    }
}
