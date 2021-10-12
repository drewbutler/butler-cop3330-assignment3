/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Drew Butler
 */
package ex42;


public class Person {
    private String firstName;
    private String lastName;
    private String salary;

    public Person(String personString) {
        String[] data = personString.split(",");
        firstName = data[0];
        lastName = data[1];
        salary = data[2];
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%s", firstName, lastName, salary);
    }
}
