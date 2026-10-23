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
        if (index !in shelves.indices) {
            return emptyList()
        }
        val removedShelf = shelves.removeAt(index)
        return removedShelf.getItems()
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
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
        if (shelves.isEmpty()) {
            println("Стеллаж пуст.")
            return
        }
        println("=== Содержимое стеллажа (полок: ${shelves.size}/$maxShelves) ===")
        shelves.forEachIndexed { index, shelf ->
            val itemsStr = if (shelf.getItems().isEmpty()) "нет предметов" else shelf.getItems().joinToString(", ")
            println("Полка #$index | Вместимость: ${shelf.capacity} | Свободно: ${shelf.getRemainingCapacity()} | Предметы: [$itemsStr]")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val shelfToRemove = shelves[index]
        val itemsToDistribute = shelfToRemove.getItems().sortedByDescending { it.length }
        val otherShelves = shelves.filterIndexed { i, _ -> i != index }
        val unplacedItems = mutableListOf<String>()

        for (item in itemsToDistribute) {
            var placed = false
            for (shelf in otherShelves) {
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