package com.company.Model;

public class Person {

    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected String login;
    protected int idPerson;

    public Person(String name, String surname, String email, String password, String login, int idPerson) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.login = login;
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Login='" + login + '\'' +
                ", idPerson='" + idPerson + '\'' +
                '}';
    }
}
