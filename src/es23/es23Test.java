package es23;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class es23Test {
private final es23 testing = new es23();

    @Test
    void dataFormat() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.dataFormat(offsetDateTime);
        assertEquals("01 marzo 2023",result);
    }
    void dataFormat2() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("1998-01-28T13:00:00Z");
        String result = testing.dataFormat(offsetDateTime);
        assertEquals("28 gennaio 1998",result);
    }
}