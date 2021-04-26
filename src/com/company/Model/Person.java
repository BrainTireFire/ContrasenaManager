package com.company.Model;

public class Person {
    private static int count = 0;
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected String login;
    protected int idPerson;

    public Person(String name, String surname, String email, String login, String password, int idPerson) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.login = login;
        this.idPerson = ++count;
    }

    public void registerNewPerson(String date){
        String[] tmp = date.split(" ");
        new Person(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], ++count);
    }

    public boolean checkUserAccount(String date){
        boolean result = false;
        String[] tmp = date.split(" ");
        if (this.name.equals(tmp[0]) && this.password.equals(tmp[1])){
            return true;
        }

        return result;
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
