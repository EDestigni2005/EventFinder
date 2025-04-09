package com.example.eventfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventFinderTest {
    EventFinder finder = new EventFinder();
    @Test
    void testAddEvent() {

        boolean result = finder.addEvent("Carnival", "Brazil", 1);
        assertTrue(result, "This should return true");

        boolean result2 = finder.addEvent("Mardi Gra", "Louisiana", 2);
        assertTrue(result2, "This should also return true");

        boolean result3 = finder.addEvent("", "Canada", 3);
        assertFalse(result3, "Checks name validation should return false");

        boolean result4 = finder.addEvent("Magic Mike", "Student Union", 2);
        assertFalse(result4, "Checks duplication should return false");
    }

    @Test
    void testGetEventCount(){

        finder.addEvent("Event1", "Location1", 10);
        finder.addEvent("Event2", "Location2", 20);
        finder.addEvent("Event3", "Location3", 30);

        int result = finder.getEventCount();
        assertEquals(3, result);
    }
}