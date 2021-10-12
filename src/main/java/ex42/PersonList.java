/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Drew Butler
 */
package ex42;

import java.util.ArrayList;

public class PersonList {
    ArrayList<Person> list;

    public PersonList() {
        list = new ArrayList<>();
    }

    public void addPerson(Person p) {
        list.add(p);
    }

    @Override
    public String toString() {
        String output = String.format("%-10s%-10s%s\n", "Last", "First", "Salary");
        output += "--------------------------";
        for (Person p: list)
            output += "\n" + p.toString();
        return output;
    }
}
