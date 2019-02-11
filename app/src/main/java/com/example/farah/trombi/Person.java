package com.example.farah.trombi;

/**
 * Created by Farah on 11/02/2019.
 */

class Person {
    private static String name;
    private static String lastName;
    private static int color;

    Person(String name, String lastName) {
        Person.name = name;
        Person.lastName = lastName;
    }

    public static void setName(String newName) {
        name = newName;
    }

    public static void setlastName(String newLastName) {
        lastName = newLastName;
    }

    public static void setColor(int newColor) {
        color = newColor;
    }

    static String getName(){
        return name;
    }

    static String getLastName(){
        return lastName;
    }

    public static int getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

}
