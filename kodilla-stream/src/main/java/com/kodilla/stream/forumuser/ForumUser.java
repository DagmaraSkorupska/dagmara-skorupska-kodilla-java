package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int idUser;
    private final String login;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPost;

    public ForumUser(final int idUser, final String login, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPost) {
        this.idUser = idUser;
        this.login = login;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPost = numberOfPost;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getLogin() {
        return login;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IdUser=" + idUser +
                ", login='" + login + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}
