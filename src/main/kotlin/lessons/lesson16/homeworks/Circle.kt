package lessons.lesson16.homeworks

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}