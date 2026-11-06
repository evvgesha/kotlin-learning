package lessons.lesson18.homeworks

// Чайник: греет воду до 100°C и сам отключается при закипании
class Kettle : ThermalOpenableDevice(maxTemperature = 100), WaterContainer, AutomaticShutdown {
    override val capacity = 1700
    override val sensorType = "Датчик пара"
    override val maxSensoredValue = 100
    private var waterAmount = 0

    override fun fillWater(amount: Int) {
        waterAmount = (waterAmount + amount).coerceAtMost(capacity)
        println("Налили воду: $waterAmount мл из $capacity мл")
    }

    override fun getWater(amount: Int) {
        waterAmount = (waterAmount - amount).coerceAtLeast(0)
        println("Вылили $amount мл воды. В чайнике осталось: $waterAmount мл")
    }

    override fun startMonitoring() {
        println("Датчик закипания включен (порог: $maxSensoredValue°C)")
    }
}
