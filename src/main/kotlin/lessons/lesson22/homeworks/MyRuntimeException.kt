package lessons.lesson22.homeworks

// Задание 12. Создай свой тип исключения в отдельном файле, наследуемый от RuntimeException и принимающий IndexOutOfBoundsException тип в качестве аргумента.
class MyRuntimeException(
    cause: IndexOutOfBoundsException
) : RuntimeException(cause)
