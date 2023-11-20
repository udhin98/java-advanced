package es8;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    HashSet<Oggetto> hashSet = createHashSet();
    }

    public static HashSet<Oggetto> createHashSet () {

        HashSet<Oggetto> hashSet = new HashSet<String>();

        Oggetto newOggetto = new Oggetto(1, "Mario");

        hashSet.add(newOggetto);

       return hashSet;
    }
}
