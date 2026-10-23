package lessons.lesson14.homeworks

class Rack(val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves || shelves.contains(shelf)) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()
        return shelves.removeAt(index).getItems()
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) return true
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) return true
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        shelves.forEachIndexed { i, shelf ->
            val accessiblePlace = shelf.getRemainingCapacity()
            println("$i вместимость: ${shelf.capacity} доступно: $accessiblePlace")
            println("Предметы: ${shelf.getItems()}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()
        val shelfToRemove = shelves[index]
        val sortedItems = shelfToRemove.getItems().sortedByDescending { it.length }
        val remainingShelves = shelves.filterIndexed { i, _ -> i != index }
        val unplacedItems = mutableListOf<String>()

        for (item in sortedItems) {
            var placed = false
            for (shelf in remainingShelves) {
                if (shelf.addItem(item)) {
                    placed = true
                    break
                }
            }
            if (!placed) {
                unplacedItems.add(item)
            }
        }

        shelves.removeAt(index)
        return unplacedItems.toList()
    }
}