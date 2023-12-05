package es25;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        aggiungi un anno
//        sottrai un mese
//        aggiungi 7 giorni
//        Stampa il risultato localizzata per l'Italia
//        Crea dei test per questo esercizio
public class es25 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);

        String newData = cambioData(offsetDateTime);
        System.out.println(newData);


    }
    public static String cambioData (OffsetDateTime offsetDateTime) {
        OffsetDateTime date = offsetDateTime.plusYears(1)
                .minusMonths(1)
                .plusDays(7);

        String dataItaly = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        return dataItaly;
    }
}
