package es7;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet <String> vuoto = new HashSet<String>();

        createHashSet(vuoto);

        System.out.println("La grandezza è di: " + vuoto.size());

        for (String element : vuoto) {
            System.out.println("Gli elementi sono: " + element);
        }

    }



    public static HashSet<String> createHashSet (HashSet<String> vuoto) {
        vuoto.add("1");
        vuoto.add("2");
        vuoto.add("3");
        return vuoto;
    }
}
