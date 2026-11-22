package lessons.lesson22.homeworks

// Задание 11. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст.
class MyAssertionError(
    message: String
) : AssertionError(message)
