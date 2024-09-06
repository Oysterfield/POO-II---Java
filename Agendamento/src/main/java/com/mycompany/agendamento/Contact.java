/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamento;

/**
 *
 * @author Win10
 */
public class Contact {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public long getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(long homePhone) {
        this.homePhone = homePhone;
    }

    public long getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOld() {
        return old;
    }

    public void setOld(long old) {
        this.old = old;
    }
    
    
    
    private String email;
    private String fullname;
    private Adress adress;
    private long homePhone;
    private long mobilePhone;
    private String name;
    private long old;
}
