package es21;

public class es21 {
        public static void main(String[] args) {
            try {
                int numero = 77;
                System.out.println("il numero è in range: " + isRange(numero));
            }
            catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        }

        public static boolean isRange (int numero) {

            if (numero >= 0 && numero <= 10) {
                return true;
            } else {
                return false;
            }

        }
    }


