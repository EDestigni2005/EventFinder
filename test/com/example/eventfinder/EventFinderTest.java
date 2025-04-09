package com.example.eventfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventFinderTest {

    @Test
    void testAddEvent() {
        EventFinder finder = new EventFinder();

        boolean result = finder.addEvent("Carnival", "Brazil", 1);
        assertTrue(result, "This should return true");

        boolean result2 = finder.addEvent("Mardi Gra", "Louisiana", 2);
        assertTrue(result2, "This should also return true");

        boolean result3 = finder.addEvent("", "Canada", 3);
        assertFalse(result3, "Checks name validation should return false");

        boolean result4 = finder.addEvent("Magic Mike", "Student Union", 2);
        assertFalse(result4, "Checks duplication should return false");
    }
}