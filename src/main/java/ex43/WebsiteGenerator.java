/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Drew Butler
 */
package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebsiteGenerator {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Site name: ");
        String siteName = in.nextLine();
        System.out.print("Author: ");
        String author = in.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        String js = in.nextLine();
        System.out.print("Do you want a folder for css? ");
        String css = in.nextLine();
        String root = String.format("./website/%s/", siteName);

        makeFiles cFiles = new makeFiles(siteName, author, js, css, root);
        cFiles.build();

        makeDirectory dir = new makeDirectory(root);
        dir.buildDir();

        System.out.println(dir.getDir().toString());
    }
}
