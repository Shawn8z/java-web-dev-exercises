package exercises;

import java.util.Scanner;

public class MilePerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven??");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas did you use?");
        int gasAmount = input.nextInt();
        int milePerGallon = miles/gasAmount;
        System.out.println("Your mile-per-gallon is " + milePerGallon + " mile per gallon");
    }
}
