package es16;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//        Formatta la data ottenuta in FULL, MEDIUM e SHORT
//        Stampa le varie versioni
public class es16 {
    public static void main(String[] args) {
        String data = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);

        String dataFull = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataFull);

        String dataMedium = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dataMedium);

        String dataShort = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dataShort);


    }
}
