package lessons.lesson16.homeworks

class ShoppingCart {
    private val items = mutableMapOf<String, Int>()

    fun addToCart(itemId: String) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        if (amount > 0) {
            items[itemId] = (items[itemId] ?: 0) + amount
        }
    }

    fun addToCart(newItems: Map<String, Int>) {
        for ((id, amount) in newItems) {
            if (amount > 0) {
                items[id] = (items[id] ?: 0) + amount
            }
        }
    }

    fun addToCart(itemIds: List<String>) {
        for (id in itemIds) {
            addToCart(id)
        }
    }

    override fun toString(): String {
        val totalArticles = items.size
        val totalQuantity = items.values.sum()

        val sb = StringBuilder()
        sb.appendLine("┌───────────────────────┬──────────┐")
        sb.appendLine("│ Артикул товара        │ Кол-во   │")
        sb.appendLine("├───────────────────────┼──────────┤")
        for ((id, count) in items) {
            sb.appendLine("│ %-21s │ %-8d │".format(id, count))
        }
        sb.appendLine("├───────────────────────┼──────────┤")
        sb.appendLine("│ Всего артикулов: %-4d │          │".format(totalArticles))
        sb.appendLine("│ Общее кол-во:    %-4d │          │".format(totalQuantity))
        sb.append("└───────────────────────┴──────────┘")
        return sb.toString()
    }
}