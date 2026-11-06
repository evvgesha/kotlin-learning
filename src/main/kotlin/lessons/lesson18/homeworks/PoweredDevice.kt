package lessons.lesson18.homeworks

// Базовый прибор: умеет включаться в розетку и выключаться
abstract class PoweredDevice : Powerable {
    // Включен ли прибор сейчас
    protected var isPoweredOn = false

    override fun powerOn() {
        isPoweredOn = true
        println("Прибор включен в розетку")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("Прибор выключен")
    }
}
