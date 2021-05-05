package com.company.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Vaults{

   // private static final AtomicInteger count = new AtomicInteger(0);
    private static int id = 0;
    private String name;
    private String username;
    private String password;
    private String description;

    private ListVaults<Vaults> listVaults;

    public Vaults(int id, String name, String username, String password, String description) {
        this.id++;
        this.name = name;
        this.username = username;
        this.password = password;
        this.description = description;
        listVaults = new ListVaults<>();
    }

    public void addNewVault(String date){
        String[] tmp = date.split(" ");
        listVaults.add(new Vaults(id, tmp[0], tmp[1], tmp[2], tmp[3]));
        //setName(tmp[0] + " " + getId());
        listVaults.show();
    }

    public boolean checkVaults(){
        boolean result = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Vaults.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("ButtonList.txt"));
            String line;
            String line2;
            while( (line = br.readLine()) != null && (line2 = br.readLine()) != null){
                String[] vals = line.split(" ");
                String[] vals2 = line.split(" ");
                if(vals[0].equals(vals2[0]))
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

    public int getId() {
        return id;
    }

    public String getIdString(){
        return Integer.toString(getId());
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  id + " " + name + ' ' + username + ' ' +
                password + ' ' + description;
    }
}
