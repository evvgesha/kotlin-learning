package lessons.lesson13.homeworks

fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
    task7()
    task8()
    task9()
    task10()
    task11()
    task12()
    task13()
    task14()
    task15()
    task16()
    task17()
    task18()
    task19()
    task20()
    task21()
    task22()
    task23()
    task24()
    task25()
    task26()
    task27()
    task28()
}

// 1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
fun task1() {
    val testTimes = mapOf("testLogin" to 2.5, "testCheckout" to 4.0, "testSearch" to 1.5)
    val averageTime = testTimes.values.average()
    println("Среднее время: $averageTime сек")
}

// 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
fun task2() {
    val testMetadata = mapOf("testAuth" to "priority: high", "testProfile" to "priority: low")
    val methods = testMetadata.keys.toList()
    println(methods)
}

// 3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
fun task3() {
    val testResults = mutableMapOf("test1" to "passed")
    testResults["test2"] = "failed"
    println(testResults)
}

// 4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
fun task4() {
    val testResults = mapOf("t1" to "passed", "t2" to "failed", "t3" to "passed", "t4" to "skipped")
    val passedCount = testResults.count { it.value == "passed" }
    println("Успешных тестов: $passedCount")
}

// 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
fun task5() {
    val bugTracker = mutableMapOf("BUG-101" to "Open", "BUG-102" to "Fixed", "BUG-103" to "In Progress")
    bugTracker.remove("BUG-102")
    println(bugTracker)
}

// 6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
fun task6() {
    val pageStatuses = mapOf("https://example.com/home" to 200, "https://example.com/login" to 404)
    pageStatuses.forEach { (url, status) ->
        println("Страница: $url, статус проверки: $status")
    }
}

// 7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
fun task7() {
    val serviceResponseTimes = mapOf("auth-service" to 120, "payment-service" to 450, "notification-service" to 210)
    val threshold = 200
    val slowServices = serviceResponseTimes.filterValues { it > threshold }
    println(slowServices)
}

// 8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
fun task8() {
    val apiResults = mapOf("/api/v1/users" to "OK", "/api/v1/orders" to "Internal Server Error")
    val status = apiResults.getOrDefault("/api/v1/products", "не был протестирован")
    println(status)
}

// 9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
fun task9() {
    val envConfig = mapOf("browserType" to "Chrome", "timeout" to "30s")
    val browserType: String = envConfig.getValue("browserType")
    println(browserType)
}

// 10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
fun task10() {
    val versions = mapOf("app" to "1.0.0", "db" to "2.1.0")
    val updatedVersions = versions + ("gateway" to "1.2.0")
    println(updatedVersions)
}

// 11. Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
fun task11() {
    val mobileSettings = mapOf(
        "iPhone 14" to "orientation=portrait;resolution=1170x2532",
        "Pixel 7" to "orientation=landscape;resolution=1080x2400"
    )
    val settings = mobileSettings.getOrElse("Galaxy S23") { "orientation=portrait;resolution=default" }
    println(settings)
}

// 12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
fun task12() {
    val errorCodes = mapOf(400 to "Bad Request", 404 to "Not Found", 500 to "Server Error")
    val hasCode = errorCodes.containsKey(404)
    println(hasCode)
}

// 13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
fun task13() {
    val testScenarios = mapOf("TC01_v1.0" to "Passed", "TC02_v2.0" to "Failed", "TC03_v1.0" to "Skipped")
    val targetVersion = "v1.0"
    val filteredScenarios = testScenarios.filterKeys { it.contains(targetVersion) }
    println(filteredScenarios)
}

// 14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
fun task14() {
    val moduleResults = mapOf("Auth" to "Passed", "Payment" to "Failed", "Profile" to "Passed")
    val hasFailed = moduleResults.values.any { it == "Failed" }
    println(hasFailed)
}

// 15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
fun task15() {
    val mainEnv = mutableMapOf("os" to "Linux", "env" to "Stage")
    val additionalEnv = mapOf("browser" to "Firefox", "retries" to "3")
    mainEnv.putAll(additionalEnv)
    println(mainEnv)
}

// 16. Объедините два неизменяемых словаря с данными о багах.
fun task16() {
    val bugsQ1 = mapOf("BUG-1" to "Crash on start", "BUG-2" to "UI glitch")
    val bugsQ2 = mapOf("BUG-3" to "Slow loading", "BUG-4" to "Missing icon")
    val allBugs = bugsQ1 + bugsQ2
    println(allBugs)
}

// 17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
fun task17() {
    val tempRunData = mutableMapOf("lastRunId" to 12345, "duration" to 420)
    tempRunData.clear()
    println(tempRunData)
}

// 18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
fun task18() {
    val testReport = mapOf("testSearch" to "passed", "testLogin" to "skipped", "testCart" to "failed")
    val reportWithoutSkipped = testReport.filterNot { it.value == "skipped" }
    println(reportWithoutSkipped)
}

// 19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
fun task19() {
    val testConfigs = mapOf("threads" to 4, "headless" to true, "debug" to false, "timeout" to 30)
    val reducedConfigs = testConfigs - listOf("debug", "timeout")
    println(reducedConfigs)
}

// 20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
fun task20() {
    val testResults = mapOf("TC101" to "Passed", "TC102" to "Failed")
    val reportList = testResults.map { (id, result) -> "$id: $result" }
    println(reportList)
}

// 21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
fun task21() {
    val latestRunResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    val archivedResults = latestRunResults.toMap()
    println(archivedResults)
}

// 22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
fun task22() {
    val numericTestTimes = mapOf(101 to 1.25, 102 to 3.40, 103 to 0.85)
    val stringIdTestTimes = numericTestTimes.mapKeys { it.key.toString() }
    println(stringIdTestTimes)
}

// 23. Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
fun task23() {
    val performanceScores = mapOf("v1.0" to 150.0, "v1.1" to 120.0, "v2.0" to 95.0)
    val adjustedScores = performanceScores.mapValues { it.value * 1.1 }
    println(adjustedScores)
}

// 24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
fun task24() {
    val compilationErrors = emptyMap<String, String>()
    val isErrorsEmpty = compilationErrors.isEmpty()
    println(isErrorsEmpty)
}

// 25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
fun task25() {
    val loadTestResults = mapOf("load_test_1" to "1000 rps reached")
    val isLoadTestNotEmpty = loadTestResults.isNotEmpty()
    println(isLoadTestNotEmpty)
}

// 26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
fun task26() {
    val allTestResults = mapOf("testA" to "Passed", "testB" to "Passed", "testC" to "Passed")
    val allPassed = allTestResults.values.all { it == "Passed" }
    println(allPassed)
}

// 27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
fun task27() {
    val suiteResults = mapOf("testAuth" to "Success", "testPayment" to "Error", "testCatalog" to "Success")
    val hasError = suiteResults.containsValue("Error")
    println(hasError)
}

// 28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
fun task28() {
    val serviceTests = mapOf(
        "auth_test" to "Passed",
        "payment_optional_test" to "Failed",
        "logging_optional_test" to "Failed",
        "cart_optional_test" to "Passed"
    )
    val filtered = serviceTests.filter { (name, result) ->
        name.contains("optional", ignoreCase = true) && result != "Passed"
    }
    println(filtered)
}