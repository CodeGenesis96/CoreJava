package com.codegenesis96;

import java.util.Scanner;

public class Java_User_Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // initializing scanner variable with a Scanner Object reference

        System.out.println("What is your name"); // user prompt
        String name = scanner.nextLine(); // assigning user input to name variable

        System.out.println("What is your age"); // user prompt
        int age = scanner.nextInt(); // assigning user input to age variable

        scanner.nextLine(); // clears the scanner variable to avoid the /n problem caused by going from nextLine() to nextInt()

        System.out.println("What is favourite food"); // user prompt
        String food = scanner.nextLine(); // assigning user input to food variable

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You love " + food);

        scanner.close(); // closing the scanner, good practice
    }

}
