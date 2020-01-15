package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertEquals(2, Main.calculateFuel(12));
        assertEquals(2, Main.calculateFuel(14));
        assertEquals(654, Main.calculateFuel(1969));
        assertEquals(33583, Main.calculateFuel(100756));
    }

}