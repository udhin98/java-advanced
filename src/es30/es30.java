package es30;
//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//        Il costruttore accetterà un Builder in input
//        Creare una classe Builder che attraverso il costruttore e dei metodi specifici
//        (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//        Creare due oggetti Person e stamparli a video

public class es30 {

    public static void main(String[] args) {
        Person person = new Person(new PersonBuilder("Pritvi", "Udhin"));
        person.setAge(25);
        person.setAddress("Via del vento");
        System.out.println(person);

        Person person2 = new Person(new PersonBuilder("Mario", "Rossi"));
        System.out.println(person2);


    }
}
