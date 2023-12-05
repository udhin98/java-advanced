package es26;

import java.math.BigDecimal;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max)
//        definita in un enum, crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//        Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
public class es26 {

    public static void main(String[] args) {
        BigDecimal big1 = BigDecimal.valueOf(5.5);
        BigDecimal big2 = BigDecimal.valueOf(8.8);
        BigDecimal risultato = operationiAritmetiche(big1,big2, Operazioni.MAX);
        System.out.println(risultato);


    }

    public static BigDecimal operationiAritmetiche(BigDecimal big1, BigDecimal big2, Operazioni operazioni) {
        BigDecimal result = new BigDecimal(0);

        switch (operazioni) {
            case ADDITION:
                result = big1.add(big2);
                break;

            case SUBTRACTION:
                result = big1.subtract(big2);
                break;

            case MULTIPLICATION:
                result = big1.multiply(big2);
                break;

            case DIVISION:
                result = big1.divide(big2);
                break;

            case MIN:
                result = big1.min(big2);
                break;
            case MAX:
                result = big1.max(big2);
                break;
        }
        return result;
    }
}
