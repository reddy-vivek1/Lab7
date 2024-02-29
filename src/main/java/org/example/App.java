package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for(int i=1; i<=100; i++){
            String s = fizzBuzz(i);
            System.out.print(s + " ");
        }

    }
    public static String fizzBuzz(int i){
        if(i%3 == 0 && i%5 == 0){
            return "FizzBuzz";
        }
        else if (i%5 == 0) {
            return "Buzz";
        }
        else if(i%3 == 0){
            return "Fizz";
        }
        else return String.valueOf(i);
    }
}
