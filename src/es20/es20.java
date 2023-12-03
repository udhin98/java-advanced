package es20;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//        verificare che la prima data è precedente alla seconda
//        verificare che la seconda data è successiva alla prima
//        verificare che le due date sono uguali ad ora
//        Stampa il risultato
public class es20 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        String data2 = "2024-03-01T13:00:00Z";

        OffsetDateTime adesso = OffsetDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.parse(data2);

        if (offsetDateTime.isBefore(offsetDateTime1)) {
            System.out.println("La prima data è precedente alla seconda");
        }

        if (offsetDateTime1.isAfter(offsetDateTime)) {
            System.out.println("La seconda data è successiva alla prima");
        }

        if (offsetDateTime1.isEqual(adesso) && offsetDateTime1.isEqual(adesso)) {
            System.out.println("Le date sono uguali a quella attuale");
        } else {
            System.out.println("Le date non sono uguali");
        }
    }
}
