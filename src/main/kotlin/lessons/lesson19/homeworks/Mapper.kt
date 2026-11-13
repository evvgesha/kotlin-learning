package lessons.lesson19.homeworks

// 3. Интерфейс Mapper с двумя дженериками для преобразования элементов и списков
interface Mapper<T, R> {
    fun map(element: T): R
    fun map(elements: List<T>): List<R>
}
