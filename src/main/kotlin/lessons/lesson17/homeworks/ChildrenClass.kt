package lessons.lesson17.homeworks

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // Ответ: Аргумент конструктора publicVal передаётся в конструктор суперкласса BaseClass,
    // где объявлено публичное поле `val publicVal: String`. Доступ из main() происходит именно
    // к этому унаследованному публичному полю BaseClass, а не к параметру конструктора.
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // Ответ: Функция getAll() объявлена как public в родительском классе BaseClass
    // и открыто наследуется дочерним классом ChildrenClass.

    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // Ответ: При вызове printText() печатается "Печать из класса BaseClass".
    // Метод privatePrint() в BaseClass приватный, поэтому он не виден в наследнике
    // и не может быть виртуальным/переопределяемым. Метод privatePrint() в ChildrenClass
    // является отдельным независимым приватным методом этого класса.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    // 4. Доработай ChildrenClass таким образом, чтобы получилось изменить publicField на "Антонио Бандераса"
    // В BaseClass сеттер проверяет verifyPublicField(value). Переопределяем метод в наследнике:
    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    // 5. измени меня из функции main() через сеттер в наследнике
    // Добавляем метод-сеттер, изменяющий защищённую переменную protectedField изнутри наследника:
    fun updateProtectedField(value: String) {
        protectedField = value
    }
}
