package es4;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            prova(array);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            System.out.println("Codice eseguito");
        }
    }
    public static void prova (int[] array) {
        for (int i = 0; i <= array.length; i++) {
            try {
                int risultato = array[i] / 0;
                System.out.println("Risultato: " + risultato);
            } catch (ArithmeticException e) {
                System.out.println("Errore di divisione per zero: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore di indice: " + e.getMessage());
            }
        }
    }
}
