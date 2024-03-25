package Java_Advance.esDate5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String args[]){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data1 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println(data.isBefore(data1));
        System.out.println(data1.isAfter(data));
        System.out.println(data.toLocalTime().equals(data1.toLocalTime()));

    }
}
