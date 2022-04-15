package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double radius;

//        if (!input.hasNextInt()) {
//            System.err.println("Please type in number only.");
//        } else {
//            radius = input.nextInt();
//            int area = (int) Math.round(Circle.getArea(radius));
//            System.out.println("The area of the circle is " + area);
//        }

        while (!input.hasNextDouble()) {
            System.err.println("Please type in number only.");
            input.next();
        }

        radius = input.nextDouble();
        int area = (int) Math.round(Circle.getArea(radius));
        System.out.println("The area of the circle is " + area);
    }
}
