package es6;
//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 char lo stampi
//        Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 Character lo stampi
//        Scrivere un un valore primitivo per int, double e char e fare autoboxing
//        Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//        Usare le funzioni scritte con i valori creati
public class Main {
    public static void main(String[] args) {
        int primitivoInt = 5;
        double primitivoDouble = 2.2;
        char primitivoChar = 'P';

        Integer intObj = primitivoInt;
        Double doubleobj = primitivoDouble;
        Character charObj = primitivoChar;

        int integerUnbox = intObj;
        double doubleUnbox = doubleobj;
        char charUnbox = charObj;

        somma(primitivoInt, primitivoInt);
        carattere(primitivoChar);
        sommaInt(intObj, intObj);
        carattereObj(charObj);
    }


    public static void somma (int numero1, int numero2) {
        int risultato = numero1+numero2;
     System.out.println("La somma è: " + risultato);
    }
    public static void carattere (char carattere) {
        System.out.println("Il carattere è: " + carattere);
    }
    public static void sommaInt (Integer numero1, Integer numero2) {
        Integer risultato = numero1+numero2;
        System.out.println("La somma è: " + risultato);
    }
    public static void carattereObj (Character carattere) {
        System.out.println("Il carattere è: " + carattere);
    }
}
