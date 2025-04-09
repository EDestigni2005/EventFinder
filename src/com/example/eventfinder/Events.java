package com.example.eventfinder;

public class Events {
   private String name;
    private String location;
    private int eventID;


    public Events(String name, String location, int eventID){
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
        if(name == null){
           throw new IllegalArgumentException("Name can't be null");
        }
        if(name.length() > 30 || name.length() < 1){
            throw new IllegalArgumentException("Name must be between 1 and 30 characters");
        }
        this.name = name;
    }
    public void setLocation(String location){
        if(location == null){
            throw new IllegalArgumentException("Location can't be null");
        }
        this.location = location;
    }
    public void setEventID(int eventID){
        if(eventID < 0 && eventID > 100){
            throw new IllegalArgumentException("Event ID must be between 1 and 100");
        }
        this.eventID = eventID;
    }

}
