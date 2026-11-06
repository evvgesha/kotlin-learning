package lessons.lesson17.homeworks

private class Addition : Operation("+") {
    override fun operate(expression: String): String {
        return split(expression).sum().toString()
    }
}

private class Subtraction : Operation("-") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] - operands[1]).toString()
    }
}

private class Multiplication : Operation("*") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] * operands[1]).toString()
    }
}

private class Division : Operation("/") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return if (operands[1] == 0.0) {
            "Division by zero"
        } else {
            (operands[0] / operands[1]).toString()
        }
    }
}

class Calculator(private val customOperations: List<Operation> = emptyList()) {
    private val operations = listOf(
        Addition(),
        Subtraction(),
        Multiplication(),
        Division()
    ) + customOperations

    fun operate(expression: String): String {
        val operation = operations.firstOrNull { it.check(expression) }
        if (operation == null) {
            return "Unsupported operator in the expression '$expression'"
        }
        return operation.operate(expression)
    }
}
