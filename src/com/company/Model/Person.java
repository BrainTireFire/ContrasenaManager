package com.company.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected String login;
    private ListPerson<Person> listPerson;

    public Person(String name, String surname, String email, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.login = login;
        listPerson = new ListPerson<>();
    }
/*
    public void registerNewPerson(String date){
        String[] tmp = date.split(" ");
        listPerson.add(new Person(this.idPerson, tmp[0], tmp[1], tmp[2], tmp[3], tmp[4]));
    }


 */
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

    @Override
    public String toString() {
        return  name + ' ' +
                surname + ' ' +
                email + ' ' +
                login + ' ' +
                password;
    }
}


/*
 if(password.equals("Headadmin") && login.equals("Headadmin")) {
            result = true;
        }
 */
