package lessons.lesson14.homeworks

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        val description = when {
            intensity >= 8 -> "очень сильная"
            intensity in 4..7 -> "умеренная"
            else -> "слабая"
        }
        println("Эмоция $type выражается с интенсивностью $intensity ($description)")
    }
}