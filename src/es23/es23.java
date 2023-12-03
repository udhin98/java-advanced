package es23;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//        Formatta la data ottenendo 01 marzo 2023
//        Stampa sulla console
//        Crea dei test per questo esercizio
public class es23 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        String newData = dataFormat(offsetDateTime);
        System.out.println(newData);

    }

    public static String dataFormat (OffsetDateTime offsetDateTime){
        String data = offsetDateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        return data;
    }
}
