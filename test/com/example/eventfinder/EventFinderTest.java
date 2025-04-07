package com.example.eventfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventFinderTest {


    @Test
    public void addEvent() {
        boolean result = new EventFinder().addEvent("Carnival", "Brazil");
        assertTrue(result);
    }
}