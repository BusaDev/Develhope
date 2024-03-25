package Java_Advance.edDate1;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String args[]){
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        System.out.println(data);
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
    }
}
