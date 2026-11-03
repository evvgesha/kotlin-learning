package lessons.lesson17.homeworks

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // Ответ: В ChildrenClass объявлено собственное публичное свойство `val privateVal: String`,
    // которое перекрывает аргумент конструктора. В main() мы читаем именно свойство ChildrenClass,
    // а не приватное поле BaseClass.
    private val privateVal: String,

    // 2. объясни, почему это поле недоступно в main()
    // Ответ: Модификатор protected разрешает доступ только внутри самого класса
    // и его классов-наследников. Из внешнего кода (main) protected-поля недоступны.
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField =
        "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
        "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    protected var protectedField =
        "5. измени меня из функции main() через сеттер в наследнике"

    private var privateField =
        "6. добавь сеттер чтобы изменить меня из main()"
        // Ответ: private-поле доступно только внутри BaseClass. Так как BaseClass не подлежит доработке,
        // а в наследнике к нему нет доступа, добавить сеттер или изменить его извне невозможно.

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map {
            "${it.key}: ${it.value}"
        }.joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. объясни, почему эта функция не может быть публичной
    // Ответ: Функция возвращает экземпляр ProtectedClass, который имеет доступ protected.
    // Публичный метод не может возвращать тип с меньшей видимостью (protected), иначе это раскроет скрытый тип наружу.
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // Ответ: Метод generate() объявлен как open и переопределен (override) в ChildrenClass.
    // При вызове через экземпляр ChildrenClass срабатывает полиморфизм (динамическая диспетчеризация),
    // и вызывается переопределенный метод дочернего класса.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    // Ответ: Тип PrivateClass имеет модификатор private. Метод не может иметь видимость шире, чем возвращаемый им тип.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}
