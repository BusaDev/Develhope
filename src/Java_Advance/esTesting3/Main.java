package Java_Advance.esTesting3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String args[]){
        String data = "2023-03-01T13:00:00Z";
        calendario(data);
    }
    static void calendario(String timestamp){
        OffsetDateTime data = OffsetDateTime.parse(timestamp);
        String formattedDate = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(formattedDate);
    }
}
