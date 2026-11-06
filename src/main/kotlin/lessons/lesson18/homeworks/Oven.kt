package lessons.lesson18.homeworks

// Духовка: нагрев до 250°C, таймер и внутренняя подсветка
class Oven : ThermalOpenableDevice(maxTemperature = 250), Timable, LightEmitting {
    override fun setTimer(time: Int) {
        println("Таймер духовки установлен на $time мин")
    }

    override fun emitLight() {
        println("Подсветка духовки включена")
    }

    override fun completeLiteEmission() {
        println("Подсветка духовки выключена")
    }
}
