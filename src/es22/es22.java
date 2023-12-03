package es22;
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//        Formatta la data ottenuta in FULL, MEDIUM e SHORT
//        Stampa le varie versioni -Crea dei test per questo esercizio
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class es22 {
    public static void main(String[] args) {
        String data = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);

        String dataFull = formattaFull(offsetDateTime);
        String dataMedium = formattaMedium(offsetDateTime);
        String dataShort = formattaShort(offsetDateTime);

        System.out.println("FULL = " + dataFull);
        System.out.println("MEDIUM = " + dataMedium);
        System.out.println("SHORT = " + dataShort);


    }
    public static String formattaFull (OffsetDateTime offsetDateTime) {
        String data = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return data;
    }
    public static String formattaMedium (OffsetDateTime offsetDateTime) {
        String data = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return data;
    }
    public static String formattaShort (OffsetDateTime offsetDateTime) {
        String data = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        return data;
    }
}
