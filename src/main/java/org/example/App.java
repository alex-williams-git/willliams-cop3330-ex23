/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String response1 = scan.nextLine();

        if(response1.equals("Y") || response1.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String response = scan.nextLine();

            if(response.equals("Y") || response.equals("y"))
            {
                System.out.println("Clean the terminals and try starting again.");
                System.exit(0);
            }else
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            String response = scan.nextLine();

            if(response.equals("Y") || response.equals("y"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                String response2 = scan.nextLine();

                if(response2.equals("Y") || response2.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    String response3 = scan.nextLine();

                    if(response3.equals("Y") || response3.equals("y"))
                    {
                        System.out.print("Does your car have fuel injection?");
                        String response4 = scan.nextLine();

                        if(response4.equals("Y") || response4.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }else{
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }

    }
}
