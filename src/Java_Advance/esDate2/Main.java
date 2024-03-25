package Java_Advance.esDate2;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String args[]){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");


        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

    }
}
