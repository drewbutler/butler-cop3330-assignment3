/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Drew Butler
 */
package ex45;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        String inputFile = "input/exercise45_input.txt";

        Scanner myObj = new Scanner(System.in);
        System.out.print("Name the output file with, end file name with .txt");
        String fileName = myObj.nextLine();

        modifyText input = new modifyText(inputFile);
        input.readFileInput();

        String replaceVictim = "utilize";
        String replaceVictor = "use";
        input.replaceWord(replaceVictim, replaceVictor);

        input.buildOutput();
        writeFile(fileName, input);
        System.out.println(input.getOutput());
    }

    public static void writeFile(String fileName, modifyText text) {
        try (FileWriter w = new FileWriter("./output/ex45/" + fileName)) {
            w.write(text.getOutput());
        } catch (IOException e) {
        }
    }
}
