package lessons.lesson18.homeworks

// Прибор с дверцей и регулировкой температуры
abstract class ThermalOpenableDevice(
    override val maxTemperature: Int
) : ProgrammableDevice(), TemperatureRegulatable, Openable {
    protected var currentTemperature = 20
    protected var isOpen = false

    override fun open() {
        isOpen = true
        println("Дверца открыта")
    }

    override fun close() {
        isOpen = false
        println("Дверца закрыта")
    }

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Ошибка: прибор выключен, температуру не изменить!")
            return
        }
        // Если просят больше максимума — ставим безопасный максимум
        if (temp > maxTemperature) {
            currentTemperature = maxTemperature
            println("Слишком горячо! Установлен предел: $maxTemperature°C")
        } else {
            currentTemperature = temp
            println("Температура установлена: $temp°C")
        }
    }
}
