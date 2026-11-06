package lessons.lesson17.homeworks

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. потому как в наследуемом классе есть одноимённое публичное поле и доступно именно оно а не этот аргумент
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 11. Функция getAll() доступна благодаря наследованию
    // 12. приватные функции и поля не переопределяются так как их область видимости только внутри класса,
    // таким образом в текущем классе это просто одноимённая функция
    private fun privatePrint() {
        println("Печать privatePrint из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    // 4. Для доработки нужно изменить поведение функции проверки фразы
    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    // 5. Для решения добавляем новый метод который может изменять protected переменную изнутри класса наследника
    fun updateProtectedField(value: String) {
        protectedField = value
    }
}
