package com.raven.model;

import java.util.Date;

public class VolEvent {
    private String eventName;
    private String location;
    private int hoursLogged;
    private String date;
    private String status;
    
    public VolEvent(String eventName, String location, int hoursLogged, String date, String status) {
        this.eventName = eventName;
        this.location = location;
        this.hoursLogged = hoursLogged;
        this.date = date;
        this.status = status;
    }
    
    public String getEventName() {
        return eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public int getHoursLogged() {
        return hoursLogged;
    }
    
    public void setHoursLogged(int hoursLogged) {
        this.hoursLogged = hoursLogged;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
