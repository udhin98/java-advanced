package es13;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class es13 {
    public static void main(String[] args) {
        Map<String, String> mappa = new HashMap<>();
        mappa.put("BA", "Bari");
        mappa.put("NA", "Napoli");
        mappa.put("TO", "Torino");
        System.out.println(mappa);

        Map<String, String> mappa2 = Map.of("BA", "Bari", "NA", "Napoli", "TO", "Torino");
        System.out.println(mappa2);

        Map<String, String> mappa3 = new HashMap<>(Map.ofEntries(new AbstractMap.SimpleEntry<>("BA", "Bari"),
        new AbstractMap.SimpleEntry<>("NA", "Napoli"), new AbstractMap.SimpleEntry<>("TO", "Torino")));
        System.out.println(mappa3);
    }
}
