package lessons.lesson19.homeworks

// 9. Валидатор списка чисел: ни один элемент не null и не равен 0.0 при приведении к Double
class ListValidator<W : Number> : Validator<List<W?>> {

    override fun validate(element: List<W?>): Boolean {
        return element.all { it != null && it.toDouble() != 0.0 }
    }
}
