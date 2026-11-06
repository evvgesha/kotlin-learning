package lessons.lesson18.homeworks

// Прибор с кнопками: можно выбрать программу и запустить её
abstract class ProgrammableDevice : PoweredDevice(), Programmable {
    // Название выбранной программы
    protected var currentAction = ""

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Ошибка: прибор выключен, программу выбрать нельзя!")
            return
        }
        currentAction = action
        println("Выбрана программа: $action")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("Ошибка: прибор выключен, запуск невозможен!")
            return
        }
        if (currentAction.isEmpty()) {
            println("Ошибка: сначала выберите программу!")
            return
        }
        println("Запуск программы: $currentAction")
    }
}
