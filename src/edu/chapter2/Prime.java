package edu.chapter2;

public class Prime {
    public static void main(String args[]){
        for(int i=2; i < 100; i++){
            boolean isPrime = true;

            for(int j = 2; j < i/j; j++)
                if((i%j) == 0)
                    isPrime = false;

            if(isPrime)
                System.out.println(i + " is prime.");
        }
    }
}
