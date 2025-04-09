package com.example.eventfinder;

import java.util.ArrayList;
import java.util.List;

public class EventFinder {
    private List<Events> eventList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public boolean addEvent(String name, String location, int eventID){
    try {

        for (Events existingEvent : eventList) {
            if (existingEvent.getEventID() == eventID) {
                return false;
            }
        }

        Events newEvent = new Events(name, location, eventID);

        eventList.add(newEvent);
        return true;

        } catch (IllegalArgumentException e) {
        System.out.println("Validation failed " + e.getMessage());
        return false;
        }
    }

}
