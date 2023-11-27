package es12;

import java.util.LinkedList;
import java.util.List;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un LinkedList con elementi e stamparlo in console.
//        Aggiungere un elemento al primo posto della lista e uno all'ultimo
//        Stampare la collezione aggiornata
public class Main {
    public static void main(String[] args) {
        Fruit numero1 = new Fruit("Fragola");
        Fruit numero2 = new Fruit("Limone");
        Fruit numero3 = new Fruit("Mela");
        Fruit numero4 = new Fruit("Banana");
        Fruit numero5 = new Fruit("Arancia");
        List<Fruit> lista = new LinkedList<>();
        lista.add(numero1);
        lista.add(numero2);
        lista.add(numero3);
        lista.add(numero4);
        lista.add(numero5);
        System.out.println("I frutti sono: " + lista);
        lista.addFirst(new Fruit("kiwi"));
        lista.addLast(new Fruit("Melone"));
        System.out.println("I frutti aggiornati sono: " + lista);
    }
}
