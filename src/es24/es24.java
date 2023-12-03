package es24;

import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        ottieni l'anno
//        ottieni il mese
//        ottieni il giorno
//        ottieni il giorno della settimana
//        Stampa i risultati sulla console -Crea dei test per questo esercizio
public class es24 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);

        int anno = anno(offsetDateTime);
        String mese = mese(offsetDateTime);
        int giorno = giorno(offsetDateTime);
        String giornoSettimana = giornoSettimana(offsetDateTime);

        System.out.println(offsetDateTime);
        System.out.println(anno);
        System.out.println(mese);
        System.out.println(giorno);
        System.out.println(giornoSettimana);


    }
    public static int anno (OffsetDateTime offsetDateTime) {
        int anno = offsetDateTime.getYear();
        return anno;
    }
    public static String mese (OffsetDateTime offsetDateTime) {
        String mese = String.valueOf(offsetDateTime.getMonth());
        return mese;
    }
    public static int giorno (OffsetDateTime offsetDateTime) {
        int giorno = offsetDateTime.getDayOfMonth();
        return giorno;
    }
    public static String giornoSettimana (OffsetDateTime offsetDateTime) {
        String giornoSettimana = String.valueOf(offsetDateTime.getDayOfWeek());
        return giornoSettimana;
    }
}
