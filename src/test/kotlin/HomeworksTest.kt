import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals
import lessons.lesson06.homeworks.*
import lessons.lesson05.homeworks.main as elvisMain

class HomeworksTest {
    private fun output(action: () -> Unit): String {
        val original = System.out
        val buffer = ByteArrayOutputStream()
        try {
            System.setOut(PrintStream(buffer, true, Charsets.UTF_8))
            action()
        } finally {
            System.setOut(original)
        }
        return buffer.toString(Charsets.UTF_8).trim()
    }

    @Test fun seasons() {
        assertEquals("Зима", output { printSeason(12) })
        assertEquals("Весна", output { printSeason(3) })
        assertEquals("Лето", output { printSeason(8) })
        assertEquals("Осень", output { printSeason(11) })
        assertEquals("Некорректный номер месяца", output { printSeason(13) })
    }

    @Test fun dogYears() {
        assertEquals("21.0", output { printDogAgeInHumanYears(2.0) })
        assertEquals("25.0", output { printDogAgeInHumanYears(3.0) })
        assertEquals("Возраст собаки не может быть отрицательным", output { printDogAgeInHumanYears(-1.0) })
    }

    @Test fun transportAndBonus() {
        assertEquals("пешком", output { printTransport(1.0) })
        assertEquals("велосипед", output { printTransport(5.0) })
        assertEquals("автотранспорт", output { printTransport(5.1) })
        assertEquals("20", output { printBonusPoints(1000.0) })
        assertEquals("30", output { printBonusPoints(1001.0) })
        assertEquals("0", output { printBonusPoints(99.0) })
    }

    @Test fun documentAndTemperature() {
        assertEquals("Текстовый документ", output { printDocumentType(".DOCX") })
        assertEquals("Изображение", output { printDocumentType("png") })
        assertEquals("Таблица", output { printDocumentType("csv") })
        assertEquals("Неизвестный тип", output { printDocumentType("exe") })
        assertEquals("32.0F", output { convertTemperature(0.0, "C") })
        assertEquals("0.0C", output { convertTemperature(32.0, "F") })
    }

    @Test fun clothingAndMovies() {
        assertEquals("не выходить из дома", output { printClothingRecommendation(-31) })
        assertEquals("куртка и шапка", output { printClothingRecommendation(9) })
        assertEquals("ветровка", output { printClothingRecommendation(10) })
        assertEquals("ветровка", output { printClothingRecommendation(18) })
        assertEquals("футболка и шорты", output { printClothingRecommendation(19) })
        assertEquals("не выходить из дома", output { printClothingRecommendation(36) })
        assertEquals("детские", output { printMovieCategory(9) })
        assertEquals("подростковые", output { printMovieCategory(18) })
        assertEquals("18+", output { printMovieCategory(19) })
    }

    @Test fun elvisOperator() {
        assertEquals(
            "40.0\n20.25\nОшибка: отсутствуют показания атмосферного давления",
            output { elvisMain() }
        )
    }
}
