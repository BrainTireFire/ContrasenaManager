package com.company.Model;

import java.util.ArrayList;
import java.util.List;

public class PersonList implements ListSimpleAction<Person>{

    private List<Person> personList;

    public PersonList() {
        personList = new ArrayList<>();
    }

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void delete() {

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < personList.size(); ++i) {
            stringBuilder.append(i + ": " + personList.get(i) + "\n");
        }
        return stringBuilder.toString();
    }


}
