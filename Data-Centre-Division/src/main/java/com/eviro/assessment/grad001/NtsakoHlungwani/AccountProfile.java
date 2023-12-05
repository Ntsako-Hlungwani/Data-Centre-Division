package com.eviro.assessment.grad001.NtsakoHlungwani;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AccountProfile {
    @GeneratedValue
    private String name;
    private String surname;
    private String httpImageLink;

    // Constructors, getters, and setters

    public AccountProfile(String name, String surname, String httpImageLink) {
        this.name = name;
        this.surname = surname;
        this.httpImageLink = httpImageLink;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getHttpImageLink() {
        return httpImageLink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHttpImageLink(String httpImageLink) {
        this.httpImageLink = httpImageLink;
    }

    @Override
    public String toString() {
        return "AccountProfile{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", httpImageLink='" + httpImageLink + '\'' +
                '}';
    }
}