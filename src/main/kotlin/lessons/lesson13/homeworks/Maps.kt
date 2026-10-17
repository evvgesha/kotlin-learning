package lessons.lesson13.homeworks

fun main() {

}

// 1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
val testTimes = mapOf("testLogin" to 2.5, "testCheckout" to 4.0, "testSearch" to 1.5)
val averageTime = testTimes.values.average()

// 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
val testMetadata = mapOf("testAuth" to "priority: high", "testProfile" to "priority: low")
val testMethods = testMetadata.keys.toList()

// 3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
val testResults = mutableMapOf("test1" to "passed")
fun addNewTestResult() {
    testResults["test2"] = "failed"
}

// 4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
val testStatuses = mapOf("t1" to "passed", "t2" to "failed", "t3" to "passed", "t4" to "skipped")
val passedCount = testStatuses.count { it.value == "passed" }

// 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
val bugTracker = mutableMapOf("BUG-101" to "Open", "BUG-102" to "Fixed", "BUG-103" to "In Progress")
fun removeFixedBug() {
    bugTracker.remove("BUG-102")
}

// 6. Распечатайте для каждого веб-ресурса из словаря сообщение о странице и статусе её проверки.
val pageStatuses = mapOf("https://example.com/home" to 200, "https://example.com/login" to 404)
fun printPageStatuses() {
    pageStatuses.forEach { (url, status) -> println("Страница: $url, статус: $status") }
}

// 7. Найдите все сервисы с временем ответа выше определенного порога в словаре с результатами мониторинга производительности микросервисов.
val serviceTimes = mapOf("auth-service" to 120, "payment-service" to 450, "notification-service" to 210)
val slowServices = serviceTimes.filterValues { it > 200 }

// 8. Получите статус ответа для определенного API endpoint из словаря с результатами тестирования или верните "не был протестирован".
val apiResults = mapOf("/api/v1/users" to "OK", "/api/v1/orders" to "Internal Server Error")
val endpointStatus = apiResults.getOrDefault("/api/v1/products", "не был протестирован")

// 9. В словаре хранятся настройки конфигурации тестового окружения (браузер, таймаут, разрешение экрана и т.д.). Получите значение для browserType не допуская null.
val envConfig = mapOf("browserType" to "Chrome", "timeout" to "30s")
val browserType: String = envConfig.getValue("browserType")

// 10. Создайте копию неизменяемого словаря с версиями зависимостей и добавьте туда новую библиотеку.
val versions = mapOf("app" to "1.0.0", "db" to "2.1.0")
val updatedVersions = versions + ("gateway" to "1.2.0")

// 11. Имеется словарь с настройками тестового стенда для разных мобильных устройств. Получите настройки для определенного устройства или верните дефолтную конфигурацию (строку), не допуская появления null.
val mobileSettings = mapOf(
    "iPhone 14" to "orientation=portrait;resolution=1170x2532",
    "Pixel 7" to "orientation=landscape;resolution=1080x2400"
)
val deviceConfig = mobileSettings.getOrElse("Galaxy S23") { "orientation=portrait;resolution=default" }

// 12. Проверьте, содержит ли словарь с кодами ответов и их описанием определенный код ошибки.
val errorCodes = mapOf(400 to "Bad Request", 404 to "Not Found", 500 to "Server Error")
val hasError404 = errorCodes.containsKey(404)

// 13. Отфильтруйте словарь с результатами тестирования, оставив только те тесты, которые содержат в ключе название определенной версии продукта.
val testScenarios = mapOf("TC01_v1.0" to "Passed", "TC02_v2.0" to "Failed", "TC03_v1.0" to "Skipped")
val filteredScenarios = testScenarios.filterKeys { it.contains("v1.0") }

// 14. Убедитесь, что в словаре с результатами стресс-тестирования нет ни одного сервиса, завершившего тест с ошибкой.
val moduleResults = mapOf("Auth" to "Passed", "Payment" to "Passed", "Profile" to "Passed")
val hasNoErrors = moduleResults.values.none { it == "Failed" }

// 15. Объедините неизменяемый словарь настроек тестовой среды с настройками по умолчанию из другого словаря.
val defaultSettings = mapOf("browser" to "Chrome", "timeout" to "30s")
val customSettings = mapOf("browser" to "Firefox", "env" to "Stage")
val combinedSettings = defaultSettings + customSettings

// 16. В словаре хранятся данные о багах, найденных в разных спринтах. Создайте новый словарь, объединив данные двух спринтов.
val bugsQ1 = mapOf("BUG-1" to "Crash on start", "BUG-2" to "UI glitch")
val bugsQ2 = mapOf("BUG-3" to "Slow loading", "BUG-4" to "Missing icon")
val allBugs = bugsQ1 + bugsQ2

// 17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
val tempRunData = mutableMapOf("lastRunId" to 12345, "duration" to 420)
fun clearTempData() {
    tempRunData.clear()
}

// 18. Исключите из словаря результатов тестирования тесты с определенным статусом (например, skipped).
val testReport = mapOf("testSearch" to "passed", "testLogin" to "skipped", "testCart" to "failed")
val withoutSkipped = testReport.filterNot { it.value == "skipped" }

// 19. Удалите из словаря с конфигурацией тестов несколько конфигураций по их именам (ключам).
val testConfigs = mapOf("threads" to 4, "headless" to true, "debug" to false, "timeout" to 30)
val filteredConfigs = testConfigs - listOf("debug", "timeout")

// 20. Преобразуйте словарь с результатами выполнения тестов (ключ - ID теста, значение - статус) в отчет в формате строки: "Test ID: результат".
val runResults = mapOf("TC101" to "Passed", "TC102" to "Failed")
val reportList = runResults.map { (id, res) -> "$id: $res" }

// 21. Преобразуйте изменяемый словарь с результатами регрессионного тестирования в неизменяемый для архивации.
val mutableResults = mutableMapOf("test1" to "passed", "test2" to "failed")
val immutableArchive = mutableResults.toMap()

// 22. В словаре хранятся средние времена ответа для разных типов запросов, но ключи заданы в виде числовых кодов. Преобразуйте ключи в строковые идентификаторы.
val numericTimes = mapOf(101 to 1.25, 102 to 3.40, 103 to 0.85)
val stringKeyTimes = numericTimes.mapKeys { it.key.toString() }

// 23. В словаре хранится время выполнения тестов в миллисекундах. Увеличьте каждое значение на 10% для моделирования сетевых задержек.
val perfScores = mapOf("v1.0" to 150.0, "v1.1" to 120.0, "v2.0" to 95.0)
val delayedScores = perfScores.mapValues { it.value * 1.1 }

// 24. Проверьте, пуст ли словарь с ошибками компиляции после успешного билда.
val compilationErrors = emptyMap<String, String>()
val isErrorsEmpty = compilationErrors.isEmpty()

// 25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст перед отправкой отчета.
val loadTestResults = mapOf("load_test_1" to "1000 rps reached")
val isLoadTestNotEmpty = loadTestResults.isNotEmpty()

// 26. Проверьте, все ли тесты в словаре завершились успешно.
val allTests = mapOf("testA" to "Passed", "testB" to "Passed", "testC" to "Passed")
val areAllPassed = allTests.values.all { it == "Passed" }

// 27. Проверьте, содержит ли словарь с результатами прогона хотя бы один тест с ошибкой.
val suiteResults = mapOf("testAuth" to "Success", "testPayment" to "Error", "testCatalog" to "Success")
val hasErrors = suiteResults.containsValue("Error")

// 28. Найдите в словаре с результатами тестов все тесты, которые не прошли успешно и при этом содержат в названии слово "optional".
val serviceTests = mapOf(
    "auth_test" to "Passed",
    "payment_optional_test" to "Failed",
    "logging_optional_test" to "Failed",
    "cart_optional_test" to "Passed"
)
val failedOptionalTests = serviceTests.filter { (name, res) -> name.contains("optional", ignoreCase = true) && res != "Passed" }
