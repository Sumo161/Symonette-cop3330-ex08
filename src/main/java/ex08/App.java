package ex08;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        int people, pizzas,slices, total,quotient,remainder;
        Scanner sc=new Scanner(System.in);
        


        //concat; formula for pizza
        System.out.print("How many people?");
        people=sc.nextInt();

        System.out.print("How many pizza do you have?");
        pizzas=sc.nextInt();

        System.out.print("How many slices do you have?");
        slices=sc.nextInt();
        total=pizzas*slices;

        System.out.println(" "+people+" people with "+pizzas+" pizzas( "+total+"slices)");
        quotient=total/people;


        // results
        System.out.println(" Each person gets "+quotient+ " pieces of pizza");
        remainder=total%people;
        System.out.println("There are "+remainder+ "leftover pieces" );

    }
}
