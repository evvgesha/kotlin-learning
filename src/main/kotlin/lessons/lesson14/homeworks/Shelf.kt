package lessons.lesson14.homeworks

class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    fun canAccommodate(item: String): Boolean {
        return getRemainingCapacity() >= item.length
    }

    fun addItem(item: String): Boolean {
        return if (canAccommodate(item)) {
            items.add(item)
            true
        } else {
            false
        }
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getRemainingCapacity(): Int {
        return capacity - items.sumOf { it.length }
    }
}