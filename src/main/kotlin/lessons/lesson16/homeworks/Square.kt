package lessons.lesson16.homeworks

class Square(val side: Double) : Shape() {
    override fun area(): Double = side * side
}