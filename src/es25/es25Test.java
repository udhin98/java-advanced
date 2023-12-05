package es25;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class es25Test {
private final es25 test = new es25();
    String data = "2023-03-01T13:00:00Z";
    OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);
    @Test
    void cambioData() {
        String risultato = test.cambioData(offsetDateTime);
        assertEquals("08 febbraio 2024", risultato);

    }
}