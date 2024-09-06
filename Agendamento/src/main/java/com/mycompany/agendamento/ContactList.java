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
public class ContactList {

    public ContactList(Collection contacts) {
        this.contacts = contacts;
    }

    
    
    public Collection getContacts() {
        return contacts;
    }

    public boolean addContacts(Contact contact) {
        contacts.add(contact);
        return true;
    }
    
    public boolean removeContact(long old) {
        contacts.remove(old);
        return true;
    }
    
    private final Collection contacts;
    
}
