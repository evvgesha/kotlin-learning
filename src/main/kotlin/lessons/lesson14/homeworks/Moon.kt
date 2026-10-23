package lessons.lesson14.homeworks

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Текущая фаза Луны: $phase")
        } else {
            println("Луна сейчас не видна (фаза: $phase)")
        }
    }
}