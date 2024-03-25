package Java_Advance.esTesting4;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testYear() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = String.valueOf(data.getYear());
        assertEquals(year , "2023");
    }
    @Test
    void testMonth() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String month = String.valueOf(data.getMonth());
        assertEquals(month , "MARCH");
    }
    @Test
    void testDay() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String day = String.valueOf(data.getDayOfMonth());
        assertEquals(day , "1");
    }
    @Test
    void testDayOfWeek() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dayOfWeek = String.valueOf(data.getDayOfWeek());
        assertEquals(dayOfWeek , "WEDNESDAY");
    }
}