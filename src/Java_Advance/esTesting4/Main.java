package Java_Advance.esTesting4;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String args[]){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = String.valueOf(data.getYear());
        System.out.println(year);
        String month = String.valueOf(data.getMonth());
        System.out.println(month);
        String day = String.valueOf(data.getDayOfMonth());
        System.out.println(day);
        String dayOfWeek = String.valueOf(data.getDayOfWeek());
        System.out.println(dayOfWeek);;
    }
}
