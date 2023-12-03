package es21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class es21Test {
    private final es21 testing = new es21();

    @Test
    void isRangeTrue() {
        boolean result = testing.isRange(4);
        assertEquals(true, result, "Numero in range");
    }
    void isRangeFalse() {
        boolean result = testing.isRange(11);
        assertEquals(false, result, "Numero non in range");
    }
}