package es19;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        aggiungi un anno
//        sottrai un mese
//        aggiungi 7 giorni
//        Stampa il risultato localizzata per l'Italia
public class es19 {
    public static void main(String[] args) {
        //String data = "2023-03-01T13:00:00Z";
       OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
       System.out.println(data);
       OffsetDateTime newData = data
               .plusYears(1)
               .minusMonths(1)
               .plusDays(7);
        System.out.println(newData);




    }
}
