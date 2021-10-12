/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Drew Butler
 */
package ex42;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ParsingData {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        File input = new File(classLoader.getResource("exercise42_input.txt").getFile());
        Scanner in = new Scanner(input);

        PersonList pl = new PersonList();

        while (in.hasNextLine()) {
            pl.addPerson(new Person(in.nextLine()));
        }

        System.out.println(pl);
    }
}
