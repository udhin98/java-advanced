import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//package es17;
//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//        Formatta la data ottenendo 01 marzo 2023
//        Stampa sulla console
public class es17 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        String dataLong = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dataLong);
    }
}
