package Java_Advance.esDate4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String args[]){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        data = data.plusYears(1);
        data = data.minusMonths(1);
        data = data.plusDays(7);
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));

    }
}
