package es2;

public class Main {
    public static void main(String[] args) {
        try {
            char carattere = 'a';
            isNumber(carattere);
        }
        catch (NumeroNonValido e) {
            System.out.println(e.getMessage());
        }
    }

    public static void isNumber (char carattere) throws NumeroNonValido {

        if (Character.isDigit(carattere)) {
            System.out.println("E' un numero");
        } else {
            throw new NumeroNonValido("Non è un numero");
        }

    }

}