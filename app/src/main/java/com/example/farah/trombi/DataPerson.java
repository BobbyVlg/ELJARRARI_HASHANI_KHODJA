package com.example.farah.trombi;

import java.util.ArrayList;

/**
 * Created by Farah on 11/02/2019.
 */

public class DataPerson {
    private static ArrayList<Person> listPersons;

    public DataPerson(){

    }

    public static ArrayList<Person> getPersons() {
        return listPersons;
    }

    public static void addPerson(Person personToAdd) {
        listPersons.add(personToAdd);
    }
}
