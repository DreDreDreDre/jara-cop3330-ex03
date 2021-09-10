package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */
public class App 
{
    public static void main( String[] args )
    {
        String quote;
        String quoter;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        quote = input.nextLine();

        System.out.print("Who said it? ");
        quoter = input.nextLine();

        System.out.println(quoter + " says, " + "\'"+ quote +"\'");

        input.close();
    }
}
