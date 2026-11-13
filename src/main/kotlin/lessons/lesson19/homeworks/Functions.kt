package lessons.lesson19.homeworks

// 1. Функция с дженериком, возвращающая средний элемент списка или null
fun <M> getMiddleElement(list: List<M>): M? {
    if (list.size % 2 == 0) {
        return null
    }
    return list[list.size / 2]
}

// 5. Функция с двумя дженериками, меняющая местами ключ и значение словаря
fun <I, D> transposition(map: Map<I, D>): Map<D, I> {
    return map.entries.associate { it.value to it.key }
}
