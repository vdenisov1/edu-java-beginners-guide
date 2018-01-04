package edu.chapter3;

public class MyForLoop {

    public static void main(String[] args){
        for(int i = 1; i <= 256; i = i << 1)
            System.out.println(i);
    }
}
