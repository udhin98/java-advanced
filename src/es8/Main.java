package es8;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    HashSet<String> hashSet = createHashSet();

    HashSet<String> nuovoHashSet = new HashSet<>(hashSet);
    nuovoHashSet.add("4");
    String nuovoValore = "7";

    if(nuovoHashSet.contains(nuovoValore)) {
        System.out.println("Seguente valore fa parte: " + nuovoValore);
    } else {
        System.out.println("Seguente valore non fa parte: " + nuovoValore);
    }
    System.out.println(nuovoHashSet);
    }

    public static HashSet<String> createHashSet () {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");

       return hashSet;
    }
}
