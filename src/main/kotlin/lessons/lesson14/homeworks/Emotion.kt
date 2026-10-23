package lessons.lesson14.homeworks

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Feeling $type with intensity level $intensity.")
    }
}