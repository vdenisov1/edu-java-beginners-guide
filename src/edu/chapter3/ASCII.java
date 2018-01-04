package edu.chapter3;

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(Character c: in.nextLine().toCharArray()){
            if(c >= 'a'){
                System.out.print((char) (c - 32));
            }else{
                System.out.print(c);
            }
        }
    }
}
