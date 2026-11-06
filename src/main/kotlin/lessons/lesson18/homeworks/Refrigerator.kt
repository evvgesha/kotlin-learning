package lessons.lesson18.homeworks

// Холодильник: держит холод (до 10°C) и его можно мыть
class Refrigerator : ThermalOpenableDevice(maxTemperature = 10), Cleanable {
    override fun clean() {
        println("Холодильник вымыт и разморожен")
    }
}
