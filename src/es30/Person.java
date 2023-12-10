package es30;
//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//        Il costruttore accetterà un Builder in input
//        Creare una classe Builder che attraverso il costruttore e dei metodi specifici
//        (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//        Creare due oggetti Person e stamparli a video
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
