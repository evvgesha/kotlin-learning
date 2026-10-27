package lessons.lesson16.homeworks

import kotlin.math.sin

class Triangle(val a: Double, val b: Double, val angleDeg: Double) : Shape() {
    override fun area(): Double = 0.5 * a * b * sin(Math.toRadians(angleDeg))
}