package com.codegenesis96;

import java.util.Scanner;

public class Java_Math {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double maxVal = Math.max(x,y);
        System.out.println(maxVal);

        double minVal = Math.min(x, y);
        System.out.println(minVal);

        double absVal = Math.abs(y);
        System.out.println(absVal);

        double roundVal = Math.round(x);
        System.out.println(roundVal);

        double sqrtVal = Math.sqrt(x);
        System.out.println(sqrtVal);

        double ceilVal = Math.ceil(x);
        System.out.println(ceilVal);

        double floorVal = Math.floor(x);
        System.out.println(floorVal);

        double a;
        double b;
        double c;

        System.out.println("--- Finding hypotenuse(c) of a triangle with sides a, b, c ---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter value for side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The value for hypotenuse(c): " + c);
        // above 2 steps can be combined as System.out.println("The value for hypotenuse(c): " + Math.sqrt((a*a) + (b*b)));

        scanner.close();

    }
}
