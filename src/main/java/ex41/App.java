/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Drew Butler
 */
package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {
     static String path = "input/exercise41_input.txt";
     static String outpath = "output/exercise41_output.txt";

     public static void main(String[] args) {
         makeNameList names = new makeNameList();
         names.readFile(path);
         names.sortNames();
         createFile();
         writeFile(names.getNameList());
     }

     public static void writeFile(ArrayList<String> names) {
         try (FileWriter w = new FileWriter(outpath)) {
             String header = String.format("Total of %d names\n-----------------\n", names.size());
             w.write(header);
             for (String name : names) {
                 w.append(name).append("\n");
             }
         } catch (IOException e) {
         }
     }

     public static void createFile() {
         File output = new File(outpath);
         try {
             boolean fileCreated = output.createNewFile();
             if (!fileCreated) {
                  output.delete();
                  output.createNewFile();
             }
         } catch (IOException e) {
         }
     }
}
