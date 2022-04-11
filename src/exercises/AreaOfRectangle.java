package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = input.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int height = input.nextInt();
        int dimensions = length * width * height;
        System.out.println("The area is " + dimensions + " square centimeters");
    }
}
