package es24;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class es24Test {
    private final es24 test = new es24();


    @Test
    void anno() {
        String data = "2025-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        int result = test.anno(offsetDateTime);
        assertEquals(2025, result);
    }

    @Test
    void mese() {
        String data = "2023-11-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        String result = test.mese(offsetDateTime);
        assertEquals("NOVEMBER", result);
    }

    @Test
    void giorno() {
        String data = "2023-03-11T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        int result = test.giorno(offsetDateTime);
        assertEquals(11, result);
    }

    @Test
    void giornoSettimana() {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
        String result = test.giornoSettimana(offsetDateTime);
        assertEquals("WEDNESDAY", result);
    }
}