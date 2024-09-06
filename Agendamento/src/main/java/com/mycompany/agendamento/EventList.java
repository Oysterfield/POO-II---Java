/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamento;

import java.util.Collection;

/**
 *
 * @author Win10
 */
public class EventList {

    public EventList(Collection events) {
        this.events = events;
    }

    public boolean addEvent(Event event) {
        events.add(event);
        return true;
    }
    
    public Collection getEvents() {
        return events;
    }
    
    public boolean removeEvent(long old) {
        events.remove(old);
        return true;
    }
    
    private final Collection events;
}
