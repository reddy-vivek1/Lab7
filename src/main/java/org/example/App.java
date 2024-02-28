package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num;
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        int i;
        for(i=0; i<num; i++){
        fizzBuzz(i);
        }
        //System.out.println( "Hello World!" );
    }
    public static void fizzBuzz(int i){
        if(i==3){
            System.out.print("Fizz" + " ");
        }
        if(i==5){
            System.out.print("Buzz"+ " ");
        }
        else System.out.print(i + " ");
    }
}
