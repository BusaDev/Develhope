package Java_Advance.esTesting2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void TestDataFULL() {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dataFormatted = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        assertEquals(dataFormatted , "venerdì 1 marzo 2002 13:00:00 Z");
    }
    @Test
    void TestDataMEDIUM() {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dataFormatted = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        assertEquals(dataFormatted , "1 mar 2002, 13:00:00");
    }
    @Test
    void TestDataSHORT() {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dataFormatted = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        assertEquals(dataFormatted , "01/03/02, 13:00");
    }
}