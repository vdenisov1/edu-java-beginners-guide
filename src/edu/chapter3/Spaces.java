package edu.chapter3;

import java.util.Scanner;

public class Spaces {

    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int spaces = 0;

        do{
            ch = (char) System.in.read();
            if(ch == ' ') spaces++;
        }while(ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}
