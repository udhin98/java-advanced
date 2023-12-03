package es22;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class es22Test {
    private final es22 testing = new es22();
    String data = "2002-03-01T13:00:00Z";
    OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);

    @Test
    void formattaFull() {
        String result = testing.formattaFull(offsetDateTime);
        assertEquals("venerdì 1 marzo 2002", result);
    }

    @Test
    void formattaMedium() {
        String result = testing.formattaMedium(offsetDateTime);
        assertEquals("1 mar 2002", result);
    }

    @Test
    void formattaShort() {
        String result = testing.formattaShort(offsetDateTime);
        assertEquals("01/03/02", result);
    }
}