package lessons.lesson05.homeworks

fun main() {
    // 1. Рассчитать интенсивность звука после затухания; если коэффициент неизвестен, взять 0.5.
    val initialSoundIntensity = 80.0
    val attenuationCoefficient: Double? = null
    val soundIntensityAfterAttenuation =
        initialSoundIntensity * (attenuationCoefficient ?: 0.5)
    println(soundIntensityAfterAttenuation)

    // 2. Добавить к доставке страховку 0,5% от стоимости груза; если стоимость неизвестна, взять 50.
    val deliveryCost = 20.0
    val cargoCost: Double? = null
    val actualCargoCost = cargoCost ?: 50.0
    val insuranceCost = actualCargoCost * 0.005
    val fullDeliveryCost = deliveryCost + insuranceCost
    println(fullDeliveryCost)

    // 3. Сообщить об ошибке, если показания атмосферного давления отсутствуют.
    val atmosphericPressure: Double? = null
    val pressureMessage = atmosphericPressure?.toString()
        ?: "Ошибка: отсутствуют показания атмосферного давления"
    println(pressureMessage)
}
