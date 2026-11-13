package lessons.lesson19.homeworks

// 7. Валидатор строк: проверяет, что строка не null, не пустая и не состоит из пробелов
class StringValidator : Validator<String?> {

    override fun validate(element: String?): Boolean {
        return element?.isNotBlank() ?: false
    }
}
