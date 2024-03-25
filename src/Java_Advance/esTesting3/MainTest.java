package Java_Advance.esTesting3;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calendarioTest1() {
        String timestamp = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(timestamp);
        String formattedDate = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        assertEquals(formattedDate, "01 marzo 2023");
    }
    @Test
    void calendarioTest2() {
        String timestamp = "2024-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(timestamp);
        String formattedDate = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        assertEquals(formattedDate, "01 marzo 2024");
    }
    @Test
    void calendarioTest3() {
        String timestamp = "2026-01-11T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(timestamp);
        String formattedDate = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        assertEquals(formattedDate, "11 gennaio 2026");
    }
}