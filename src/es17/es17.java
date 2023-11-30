package es17;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class es17 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        String dataLong = offsetDateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(dataLong);
    }
}
