package com.solvd.laba.block1.task1;

public class Main {
    public static void main(String[] args) {
        String firstName;
        String lastName;

        if(args.length == 2) {
            firstName = args[0];
            lastName = args[1];
            System.out.println("Hello nice to see You: " + args[0] + " " + args[1] + ".");
        } else
            System.out.println("Enter your data");
    }
}



