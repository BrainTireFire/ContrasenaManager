package com.company.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    private static final AtomicInteger count = new AtomicInteger(0);
    //private static int count = 1;
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected String login;
    protected int idPerson;
    private ListPerson<Person> listPerson;

    public Person(String name, String surname, String email, String login, String password, int idPerson) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.login = login;
        this.idPerson = count.incrementAndGet();
        listPerson = new ListPerson<>();
    }

    public void registerNewPerson(String date){
        String[] tmp = date.split(" ");
        listPerson.add(new Person(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], this.idPerson));
    }

    public boolean checkUserAccount(String date){
            boolean result = false;
            String[] tmp = date.split(" ");
            try {
                BufferedReader br = new BufferedReader(new FileReader("Logins.txt"));
                String line;
                while( (line = br.readLine()) != null){
                    String[] vals = line.split(" ");
                    if(tmp[1].equals(vals[3]) && tmp[0].equals(vals[4]))
                        result = true;
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
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
        return name + ' ' +
                surname + ' ' +
                email + ' ' +
                password + ' ' +
                login + ' ' +
                idPerson;
    }
}


/*
 if(password.equals("Headadmin") && login.equals("Headadmin")) {
            result = true;
        }
 */
