package es5;

public class Main {
    public static void main(String[] args) {
        try {
            Integer numeratore = 1;
            Integer denominatore = null;
            cheakNull(numeratore, denominatore);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            Integer numeratore = 10;
            Integer denominatore = 2;
            cheakNull(numeratore, denominatore);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore" + e.getMessage());
        }
        }


    public static void cheakNull (Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new IllegalArgumentException("null non concesso");
        } else {
            System.out.println(numeratore/denominatore);
        }
    }
}
