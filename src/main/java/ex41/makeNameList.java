/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Drew Butler
 *
 */
package ex41;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class makeNameList {

    private ArrayList<String> nameList;

    public makeNameList(){
    }

    public void setNameList(ArrayList <String> a) {
        this.nameList = a;
    }

    public ArrayList <String> getNameList() {
        return nameList;
    }

    public void sortNames() {
        Collections.sort(nameList.subList(0, nameList.size()));
    }

    public void readFile(String path) {
        ArrayList<String> a = new ArrayList<>();
        try (Scanner file = new Scanner(new File(path)).useDelimiter(System.lineSeparator())) {
            while (file.hasNext()) a.add(file.next());
        } catch(IOException e) {

        }
        setNameList(a);
    }

    public String get(int i) {
        return nameList.get(i);
    }

    public int size(){
        return nameList.size();
    }

}
