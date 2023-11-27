package es11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con 12 elementi e stamparlo in console.
//        mettere in ordine la collezione e stampare il risultato
public class es11 {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<>();
        lista.add(new Student("Pritvi", 25));
        lista.add(new Student("Mario", 20));
        lista.add(new Student("Luigi", 19));
        lista.add(new Student("Leonardo", 10));
        lista.add(new Student("Raffaello", 9));
        lista.add(new Student("Michelangelo", 8));
        lista.add(new Student("Donatello", 7));
        lista.add(new Student("Goku", 30));
        lista.add(new Student("Vegeta", 35));
        lista.add(new Student("Gohan", 18));
        lista.add(new Student("Trunks", 6));
        lista.add(new Student("Goten", 5));

        System.out.println("Gli studenti sono: " + lista);

        lista.sort(Comparator.comparing(Student::getAge));

        System.out.println("Gli studenti in ordine di età sono: " + lista);

        lista.sort(Comparator.comparing(Student::getName));
        System.out.println("Gli studenti in ordine alfabetico sono: " + lista);
    }
}
