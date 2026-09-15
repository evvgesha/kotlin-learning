package lessons.lesson03.homework

// 1. Название мероприятия
val eventName: String = "Hackathon Survival"

// 2. Дата проведения
var eventDate: String = "20 сентября 2026"
    private set

// 3. Место проведения
var venue: String = "Технопарк"
    private set

// 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы
private val detailedBudget: String = "Оборудование, кейтеринг и другие операционные расходы"

// 5. Количество участников
var participantCount: Int = 0
    private set(value) {
        require(value >= 0) { "Количество участников не может быть отрицательным" }
        field = value
    }

// 6. Длительность хакатона
val hackathonDuration: String = "48 часов"

// 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг
private val supplierAgreements: String = "Контакты поставщиков и условия договоров"

// 8. Текущее состояние хакатона (статус)
var hackathonStatus: String = "Подготовка"
    private set

// 9. Список спонсоров
val sponsors: String = "Список спонсоров уточняется"

// 10. Бюджет мероприятия
val eventBudget: Int = 1_000_000

// 11. Текущий уровень доступа к интернету
var internetAccessLevel: String = "Полный"
    private set

// 12. Информация о транспортировке оборудования, распределении ресурсов и координации команд поддержки
private var logisticsInformation: String = "Внутренний план логистики и распределения ресурсов"

// 13. Количество команд
var teamCount: Int = 0
    private set(value) {
        require(value >= 0) { "Количество команд не может быть отрицательным" }
        field = value
    }

// 14. Перечень задач
val taskList: String = "Список задач хакатона"

// 15. План эвакуации
val evacuationPlan: String = "План и схема эвакуации"

// 16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
val allocatedEquipment: String = "Ноутбуки, мониторы, роутеры и наборы электроники"

// 17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
val freeEquipment: String
    get() = "Актуальный список незанятого оборудования"

// 18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var mealSchedule: String
    private set

// 19. План мероприятий на случай сбоев
var failureResponsePlan: String = "Резервное питание, запасное оборудование и локальная сеть"
    private set

// 20. Список экспертов и жюри
lateinit var expertsAndJury: String
    private set

// 21. Политика конфиденциальности
val privacyPolicy: String = "Правила сбора, хранения и обработки данных участников"

// 22. Приватные отзывы участников и зрителей для анализа проблем
private var privateFeedback: String = "Отзывы ещё не собраны"

// 23. Текущая температура в помещении
var roomTemperature: Int = 22
    private set(value) {
        require(value in -50..60) { "Недопустимое значение температуры" }
        field = value
    }

// 24. Данные мониторинга и анализ производительности сети для отладки приложений командами
val networkMonitoringData: String
    get() = "Актуальные показатели задержки, пропускной способности и потерь пакетов"

// 25. Регулятор скорости интернета (коэффициент хранится целым процентом: 50 означает 0.5)
private var internetSpeedPercent: Int = 100
    set(value) {
        require(value in 0..100) { "Коэффициент должен быть от 0 до 100 процентов" }
        field = value
    }

// 26. Уровень освещения
var lightingLevel: Int = 70
    private set(value) {
        require(value in 0..100) { "Уровень освещения должен быть от 0 до 100" }
        field = value
    }

// 27. Лог событий мероприятия
private var eventLog: String = "Лог создан"

// 28. Возможность получения медицинской помощи прямо на мероприятии
val medicalHelpAvailable: Boolean = true

// 29. Планы и процедуры безопасности, включая эвакуацию и протоколы чрезвычайных ситуаций
private val securityProcedures: String = "Внутренние инструкции службы безопасности"

// 30. Регистрационный номер мероприятия
val registrationNumber: String = "HS-2026-001"

// 31. Максимально допустимый уровень шума в помещении хакатона
val maximumNoiseLevel: Int = 85

// 32. Индикатор превышения уровня шума в помещениях
var noiseLimitExceeded: Boolean = false
    private set

// 33. План взаимодействия с прессой
private var pressInteractionPlan: String = "Интервью проводятся через пресс-службу"

// 34. Детальная публичная информация о проектах команд, требующая компиляции и сбора статистики проверок
val teamProjectsInformation: String by lazy {
    "Скомпилированные проекты команд и статистика автоматизированных проверок"
}

// 35. Статус получения всех необходимых разрешений для проведения мероприятия
var permitsReceived: Boolean = false
    private set

// 36. Индикатор доступности специализированного оборудования в данный момент
var specializedEquipmentAvailable: Boolean = false
    private set

// 37. Список партнёров мероприятия
val eventPartners: String = "Список партнёров мероприятия"

// 38. Итоговый отчёт с фотографиями, видео и отзывами, доступный после завершения мероприятия
val finalReport: String by lazy {
    "Итоговый отчёт с фотографиями, видео и отзывами"
}

// 39. Внутренние правила распределения призов
private val prizeDistributionRules: String = "Внутренние правила определения победителей"

// 40. Список разыгрываемых призов
val prizes: String = "Ноутбуки, сертификаты и подписки на сервисы"

// 41. Контакты экстренных служб, медицинского персонала и других важных служб для внутреннего пользования
private val emergencyContacts: String = "Контакты экстренных служб и ответственного персонала"

// 42. Особые условия для участников с ограниченными возможностями
val accessibilityConditions: String = "Безбарьерный вход, лифт и доступное рабочее место"

// 43. Общее настроение участников (определяется опросами)
var participantMood: String = "Опрос ещё не проведён"
    private set

// 44. Подробный план хакатона, инициализируемый непосредственно перед началом мероприятия
lateinit var detailedHackathonPlan: String
    private set

// 45. Имя знаменитого специального гостя, которое объявят за день до мероприятия
lateinit var specialGuestName: String
    private set

// 46. Максимальное количество людей, которое может вместить место проведения
val venueCapacity: Int = 500

// 47. Количество часов, отведённое каждой команде для работы над проектом
val hoursPerTeam: Int = 48
