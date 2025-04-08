package com.example.eventfinder;

public class AddEvent {
    String name;
    String location;
    int eventID;


    private AddEvent(String name, String location, int eventID){
        setName(name);
        setLocation(location);
        setEventID(eventID);
    }

    public String getName(){
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getEventID(){
        return eventID;
    }

    public void setName(String name){
        if(name != null){
            if(name.length() <= 30){
                this.name = name;
            }
        }
    }
    public void setLocation(String location){
        if(location != null){
            this.location = location;
        }
    }
    public void setEventID(int eventID){
        if(eventID > 0 && eventID < 100){
            this.eventID = eventID;
        }
    }
}
