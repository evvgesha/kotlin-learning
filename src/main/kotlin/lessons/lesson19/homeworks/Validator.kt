package lessons.lesson19.homeworks

// 6. Интерфейс Validator с дженериком с функцией валидации
interface Validator<T> {
    fun validate(element: T): Boolean
}
