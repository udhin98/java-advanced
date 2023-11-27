import es9.Student;

import java.util.ArrayList;
import java.util.List;

//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con n elementi e stamparlo in console.
//        Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
public class es10 {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<>();
        lista.add(new Student("Pritvi", 25));
        lista.add(new Student("Mario", 20));
        lista.add(new Student("Luigi", 19));
        System.out.println("Collezione iniziale: " + lista);
        lista.add(new Student("Leonardo", 10));
        lista.add(new Student("Raffaello", 9));
        lista.add(new Student("Michelangelo", 8));
        lista.add(new Student("Donatello", 7));
        System.out.println("Collezione aggiornata: " + lista);
    }
}
