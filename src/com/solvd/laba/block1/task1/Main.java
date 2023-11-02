package com.solvd.laba.block1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String firstName = scan.nextLine();
        //String lastName = scan.nextLine();
        //System.out.println("Hello" + " " + firstName + lastName);

        String firstName;
        String lastName;

        if(args.length == 0)
        {
            System.out.println("Empty arguments");
        }

        if(args.length == 2)
        {
            firstName  = args[0];
            lastName  = args[1];
            System.out.println("Hello nice to see You: " + args[0] + " " + args[1] +".");
        }

        }
        }


