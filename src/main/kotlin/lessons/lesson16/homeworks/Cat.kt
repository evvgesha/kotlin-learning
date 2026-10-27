package lessons.lesson16.homeworks

class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[35mMeow\u001B[0m")
    }
}