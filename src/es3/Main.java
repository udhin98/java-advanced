package es3;

public class Main {
    public static void main(String[] args) {
        try {
            int numero = 10;
            divZero(numero);
        } catch (ArithmeticException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }

    }
    public static void divZero(int numero) {
        try {
            int risultato = numero / 0;
            System.out.println("Il risultato è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }

    }
}
