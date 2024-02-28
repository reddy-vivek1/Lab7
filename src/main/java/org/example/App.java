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
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1; i<=num; i++){
        String s = fizzBuzz(i);
        System.out.print(s + " ");
        }

    }
    public static String fizzBuzz(int i){
        if(i%3 == 0){
            return "Fizz";
        }
        else if (i%5 == 0) {
            return "Buzz";
        }
        else return String.valueOf(i);
    }
}
