package com.kodilla.good.patterns.challenges.service;

public class User {

    private String nick;
    private String name;
    private String surname;

    public User(String nick, String name, String surname) {
        this.nick = nick;
        this.name = name;
        this.surname = surname;
    }

    public String getNick() {
        return nick;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
