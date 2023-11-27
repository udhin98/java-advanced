//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con n elementi e stamparlo in console.
//        Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
package es9;

public class Student {
    private String name;
    private int age;
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

