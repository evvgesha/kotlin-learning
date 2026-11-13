package lessons.lesson19.homeworks

// 2. Класс ListHolder для хранения списка элементов типа T
class ListHolder<T> {
    private val list = mutableListOf<T>()

    fun add(element: T) {
        list.add(element)
    }

    fun get(): List<T> {
        return list.toList()
    }
}
