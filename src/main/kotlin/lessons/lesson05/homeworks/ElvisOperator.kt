package lessons.lesson05.homeworks

fun main() {
    val initialSoundIntensity = 80.0
    val attenuationCoefficient: Double? = null
    val soundIntensityAfterAttenuation =
        initialSoundIntensity * (attenuationCoefficient ?: 0.5)
    println(soundIntensityAfterAttenuation)

    val deliveryCost = 20.0
    val cargoCost: Double? = null
    val actualCargoCost = cargoCost ?: 50.0
    val insuranceCost = actualCargoCost * 0.005
    val fullDeliveryCost = deliveryCost + insuranceCost
    println(fullDeliveryCost)

    val atmosphericPressure: Double? = null
    val pressureMessage = atmosphericPressure?.toString()
        ?: "Ошибка: отсутствуют показания атмосферного давления"
    println(pressureMessage)
}
