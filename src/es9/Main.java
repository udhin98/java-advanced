package es9;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
     HashSet<String> modello = createHashSet();

     HashSet<String> hashSet = new HashSet<>(modello);
     hashSet.add("1");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("1")) {
                iterator.remove();
            }
        }
        hashSet.clear();

        if (hashSet.isEmpty()) {
            System.out.println("E' vuoto");
        } else {
            System.out.println("Non è vuoto");
        }
        }

    public static HashSet<String> createHashSet () {

        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");

        return hashSet;
    }
    }



