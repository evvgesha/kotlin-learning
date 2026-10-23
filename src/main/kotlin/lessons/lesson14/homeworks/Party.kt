package lessons.lesson14.homeworks

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("The party is at $location with $attendees attendees.")
    }
}