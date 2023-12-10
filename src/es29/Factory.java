package es29;

public class Factory {
    public static Shape nuovoTipo (Tipi tipi) {

        switch (tipi) {

            case CERCHIO:
                return new Cerchio();

            case RETTANGOLO:
                return new Rettangolo();

            default:
                throw new IllegalArgumentException("Tipo non valido");
            }
        }
    }
