package lessons.lesson13.homeworks

fun main() {
    // 1. Среднее время выполнения теста
    val testTimes = mapOf("testLogin" to 2.5, "testCheckout" to 4.0, "testSearch" to 1.5)
    println("Среднее время: ${testTimes.values.average()} сек")

    // 2. Список всех тестовых методов
    val testMetadata = mapOf("testAuth" to "priority: high", "testProfile" to "priority: low")
    println(testMetadata.keys.toList())

    // 3. Добавить новый тест и результат в изменяемый словарь
    val testResults = mutableMapOf("test1" to "passed")
    testResults["test2"] = "failed"
    println(testResults)

    // 4. Количество успешных тестов
    val testStatuses = mapOf("t1" to "passed", "t2" to "failed", "t3" to "passed", "t4" to "skipped")
    println("Успешных тестов: ${testStatuses.count { it.value == "passed" }}")

    // 5. Удалить исправленный баг
    val bugTracker = mutableMapOf("BUG-101" to "Open", "BUG-102" to "Fixed", "BUG-103" to "In Progress")
    bugTracker.remove("BUG-102")
    println(bugTracker)

    // 6. Сообщение о странице и статусе проверки
    val pageStatuses = mapOf("https://example.com/home" to 200, "https://example.com/login" to 404)
    pageStatuses.forEach { (url, status) -> println("Страница: $url, статус: $status") }

    // 7. Сервисы с временем ответа выше порога
    val serviceTimes = mapOf("auth-service" to 120, "payment-service" to 450, "notification-service" to 210)
    println(serviceTimes.filterValues { it > 200 })

    // 8. Статус ответа API endpoint
    val apiResults = mapOf("/api/v1/users" to "OK", "/api/v1/orders" to "Internal Server Error")
    println(apiResults.getOrDefault("/api/v1/products", "не был протестирован"))

    // 9. Получить значение для browserType (not null)
    val envConfig = mapOf("browserType" to "Chrome", "timeout" to "30s")
    val browserType: String = envConfig.getValue("browserType")
    println(browserType)

    // 10. Копия словаря с добавлением новой версии
    val versions = mapOf("app" to "1.0.0", "db" to "2.1.0")
    println(versions + ("gateway" to "1.2.0"))

    // 11. Настройки для мобильного устройства или дефолт
    val mobileSettings = mapOf(
        "iPhone 14" to "orientation=portrait;resolution=1170x2532",
        "Pixel 7" to "orientation=landscape;resolution=1080x2400"
    )
    println(mobileSettings.getOrElse("Galaxy S23") { "orientation=portrait;resolution=default" })

    // 12. Проверить код ошибки
    val errorCodes = mapOf(400 to "Bad Request", 404 to "Not Found", 500 to "Server Error")
    println(errorCodes.containsKey(404))

    // 13. Фильтр сценариев по версии в ключе
    val testScenarios = mapOf("TC01_v1.0" to "Passed", "TC02_v2.0" to "Failed", "TC03_v1.0" to "Skipped")
    println(testScenarios.filterKeys { it.contains("v1.0") })

    // 14. Проверка на наличие модулей с ошибкой
    val moduleResults = mapOf("Auth" to "Passed", "Payment" to "Passed", "Profile" to "Passed")
    println(moduleResults.values.none { it == "Failed" })

    // 15. Объединить словарь настроек со словарем по умолчанию
    val defaultSettings = mapOf("browser" to "Chrome", "timeout" to "30s")
    val customSettings = mapOf("browser" to "Firefox", "env" to "Stage")
    println(defaultSettings + customSettings)

    // 16. Объединить два словаря с данными о багах
    val bugsQ1 = mapOf("BUG-1" to "Crash on start", "BUG-2" to "UI glitch")
    val bugsQ2 = mapOf("BUG-3" to "Slow loading", "BUG-4" to "Missing icon")
    println(bugsQ1 + bugsQ2)

    // 17. Очистить словарь с временными данными
    val tempRunData = mutableMapOf("lastRunId" to 12345, "duration" to 420)
    tempRunData.clear()
    println(tempRunData)

    // 18. Исключить тесты со статусом skipped
    val testReport = mapOf("testSearch" to "passed", "testLogin" to "skipped", "testCart" to "failed")
    println(testReport.filterNot { it.value == "skipped" })

    // 19. Удалить конфигурации из словаря
    val testConfigs = mapOf("threads" to 4, "headless" to true, "debug" to false, "timeout" to 30)
    println(testConfigs - listOf("debug", "timeout"))

    // 20. Преобразовать словарь в отчет формата Test ID: результат
    val runResults = mapOf("TC101" to "Passed", "TC102" to "Failed")
    println(runResults.map { (id, res) -> "$id: $res" })

    // 21. Преобразовать изменяемый словарь в неизменяемый
    val mutableResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    println(mutableResults.toMap())

    // 22. Заменить числовые ID тестов на строковые
    val numericTimes = mapOf(101 to 1.25, 102 to 3.40, 103 to 0.85)
    println(numericTimes.mapKeys { it.key.toString() })

    // 23. Увеличить оценки времени ответа на 10%
    val perfScores = mapOf("v1.0" to 150.0, "v1.1" to 120.0, "v2.0" to 95.0)
    println(perfScores.mapValues { it.value * 1.1 })

    // 24. Проверить, пуст ли словарь с ошибками
    val compilationErrors = emptyMap<String, String>()
    println(compilationErrors.isEmpty())

    // 25. Убедиться, что словарь нагрузочного тестирования не пуст
    val loadTestResults = mapOf("load_test_1" to "1000 rps reached")
    println(loadTestResults.isNotEmpty())

    // 26. Проверить, что все тесты прошли успешно
    val allTests = mapOf("testA" to "Passed", "testB" to "Passed", "testC" to "Passed")
    println(allTests.values.all { it == "Passed" })

    // 27. Содержит ли словарь хотя бы один тест с ошибкой
    val suiteResults = mapOf("testAuth" to "Success", "testPayment" to "Error", "testCatalog" to "Success")
    println(suiteResults.containsValue("Error"))

    // 28. Тесты не прошли успешно и содержат в названии optional
    val serviceTests = mapOf(
        "auth_test" to "Passed",
        "payment_optional_test" to "Failed",
        "logging_optional_test" to "Failed",
        "cart_optional_test" to "Passed"
    )
    println(serviceTests.filter { (name, res) -> name.contains("optional", ignoreCase = true) && res != "Passed" })
}
