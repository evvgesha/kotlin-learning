package lessons.lesson18.homeworks

// Стиральная машина: вода, слив, таймер и нагрев до 95°C
class WashingMachine : ThermalOpenableDevice(maxTemperature = 95), WaterConnection, Drainable, Timable {
    override fun connectToWaterSupply() {
        println("Шланг подключен к водопроводу")
    }

    override fun getWater(amount: Int) {
        println("Набрано $amount л воды для стирки")
    }

    override fun connectToDrain() {
        println("Сливной шланг подключен к канализации")
    }

    override fun drain() {
        println("Вода слита из бака")
    }

    override fun setTimer(time: Int) {
        println("Таймер стирки установлен на $time мин")
    }
}
