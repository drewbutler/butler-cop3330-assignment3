/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Drew Butler
 */
package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class makeFiles {
    private String siteName;
    private String author;
    private String js;
    private String css;
    private String root;

    public makeFiles(String siteName, String author, String js, String css, String root) {
        this.siteName = siteName;
        this.author = author;
        this.js = js;
        this.css = css;
        this.root = root;
    }

    public void build(){
        new File(root).mkdirs();
        if(js.equalsIgnoreCase("y")) {
            new File(root + "js/").mkdir();
        }
        if(css.equalsIgnoreCase("y")) {
            new File(root + "css/").mkdir();
        }
        File html = new File(root + "index.html");
        try (FileWriter w = new FileWriter(html.getPath())) {
            String htmlText = String.format("<html><head><title>%s</title><meta name=\"Author: \" content=\"%s\" /></head><body></body></html>", siteName, author);
            w.write(htmlText);
        } catch (IOException e) {
        }
    }

}
