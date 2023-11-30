package es18;

import java.time.Month;
import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        ottieni l'anno
//        ottieni il mese
//        ottieni il giorno
//        ottieni il giorno della settimana
//        Stampa i risultati sulla console
public class es18 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        int anno = offsetDateTime.getYear();
        int mese = offsetDateTime.getMonthValue();
        int giorno = offsetDateTime.getDayOfMonth();
        String giornoSettimana = String.valueOf(offsetDateTime.getDayOfWeek());
        System.out.println(anno);
        System.out.println(mese);
        System.out.println(giorno);
        System.out.println(giornoSettimana);

    }
}
