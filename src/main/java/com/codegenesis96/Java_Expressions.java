package com.codegenesis96;

public class Java_Expressions {

    public static void main(String[] args) {

        // expressions = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        double friends = 10;
        friends = friends + 1; // also can be written as friends++
        friends = friends - 1; // also can be written as friends--
        friends = friends * 20; // stores 200 in the friends variable after multiplication
        friends = friends / 2; // stores 5 in the friends variable after division
        friends = friends % 3; // stores 1 in the friends variable after modulus

        friends = (int)friends/0.25; // friends variable now only stores the integer value since it's cast to int

        System.out.println(friends);


    }


}
