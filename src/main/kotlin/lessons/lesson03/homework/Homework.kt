package lessons.lesson03.homework

// 1. Название мероприятия
val eventName: String = "Hackathon Survival"

// 2. Дата проведения
var eventDate: String = "8 сентября"

// 3. Место проведения
var eventPlace: String = "IT школа"

// 4. Подробный бюджет мероприятия
private val detailedBudget: String = "Еда, техника, аренда"

// 5. Количество участников
var participantsCount: Int = 100
    private set

// 6. Длительность хакатона
val duration: String = "2 дня"

// 7. Контакты и условия соглашений с поставщиками
private var suppliersInfo: String = "Контакты поставщиков"

// 8. Текущее состояние хакатона
var status: String = "Подготовка"

// 9. Список спонсоров
val sponsors: String = "Список спонсоров"

// 10. Бюджет мероприятия
private val budget: Int = 500000

// 11. Текущий уровень доступа к интернету
var internetAccess: String = "Хороший"

// 12. Информация о перевозке оборудования и распределении ресурсов
private var equipmentDeliveryInfo: String = "План перевозки техники"

// 13. Количество команд
var teamsCount: Int = 10
    set(value) {
        if (value >= 0) field = value
    }

// 14. Перечень задач
val tasks: String = "Список задач"

// 15. План эвакуации
val evacuationPlan: String = "План эвакуации находится у выхода"

// 16. Список доступного оборудования
val allEquipment: String = "Ноутбуки, мониторы, удлинители"

// 17. Список свободного оборудования
var freeEquipment: String = "Свободные ноутбуки и мониторы"
    private set

// 18. График питания участников, который станет известен за неделю до начала
lateinit var foodSchedule: String

// 19. План действий на случай сбоев
var failurePlan: String = "Использовать запасную технику"

// 20. Список экспертов и жюри
lateinit var juryList: String

// 21. Политика конфиденциальности
val privacyPolicy: String = "Политика конфиденциальности"

// 22. Приватные отзывы участников и зрителей
private var feedback: String = "Отзывов пока нет"

// 23. Текущая температура в помещении
private var roomTemperature: Int = 22
    set(value) {
        if (value in -20..50) field = value
    }

// 24. Данные мониторинга работы сети для команд
val networkInfo: String
    get() = "Текущие данные сети"

// 25. Регулятор скорости интернета в процентах, где 50 процентов равно коэффициенту 0.5
private var internetSpeed: Int = 50
    set(value) {
        if (value in 0..100) field = value
    }

// 26. Уровень освещения
private var lightLevel: Int = 70

// 27. Лог событий мероприятия
private var eventLog: String = "Начало лога"

// 28. Можно ли получить медицинскую помощь на мероприятии
val medicalHelp: Boolean = true

// 29. Планы и процедуры безопасности мероприятия
private val safetyPlan: String = "План безопасности"

// 30. Регистрационный номер мероприятия
val registrationNumber: String = "HACK-08-09"

// 31. Максимально допустимый уровень шума
val maxNoiseLevel: Int = 80

// 32. Превышен ли уровень шума сейчас
var noiseIsTooHigh: Boolean = false
    private set

// 33. План взаимодействия с прессой
private var pressPlan: String = "Общение через организатора"

// 34. Информация о проектах команд, для которой нужны компиляция и проверки
val projectsInfo: String by lazy {
    "Информация о проектах и результатах тестов"
}

// 35. Получены ли все разрешения на проведение мероприятия
var allPermissionsReceived: Boolean = false
    private set

// 36. Доступно ли специальное оборудование сейчас
var specialEquipmentAvailable: Boolean = true
    private set

// 37. Список партнеров мероприятия
val partners: String = "Список партнеров"

// 38. Отчет с фото, видео и отзывами после окончания мероприятия
val finalReport: String by lazy {
    "Отчет после хакатона"
}

// 39. Внутренние правила распределения призов
private val prizeRules: String = "Правила для организаторов"

// 40. Список разыгрываемых призов
val prizes: String = "Ноутбук, наушники, сертификаты"

// 41. Контакты экстренных служб и медицинского персонала
private val emergencyContacts: String = "Телефоны важных служб"

// 42. Особые условия для участников с ограниченными возможностями
val specialConditions: String = "Пандус и удобные рабочие места"

// 43. Общее настроение участников по результатам опросов
var participantsMood: String = "Хорошее"
    private set

// 44. Подробный план хакатона, который будет известен перед началом
lateinit var hackathonPlan: String

// 45. Имя специального гостя, которое объявят за день до мероприятия
lateinit var specialGuestName: String

// 46. Максимальное количество людей в месте проведения
val maximumPeople: Int = 200

// 47. Количество часов на работу над проектом для каждой команды
val workHours: Int = 48
