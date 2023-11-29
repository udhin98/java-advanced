package es14;

import java.util.*;

//Creare un hashmap prendere tutti i valori, ordinarli e stamparli
public class es14 {
    public static void main(String[] args) {
        Map<String, String> mappa = new HashMap<>();
        mappa.put("BA", "Bari");
        mappa.put("NA", "Napoli");
        mappa.put("TO", "Torino");

            List<String> lista = new ArrayList<>(mappa.keySet());
            Collections.sort(lista);
            for (String chiave : lista) {
                System.out.println(chiave + " " + mappa.get(chiave));
            }

    }
}
