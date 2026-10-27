package lessons.lesson16.homeworks

class Logger {
    fun log(message: String) {
        println("[INFO] $message")
    }

    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("\u001B[33m[WARNING] $message\u001B[0m")
            "ERROR" -> println("\u001B[37;41m[ERROR] $message\u001B[0m")
            else -> println("[$level] $message")
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Unknown error")
    }
}