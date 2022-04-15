package ControlFlowandCollectionsExercise;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPrct {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or Enter to finish):");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID: ");
                Integer newId = input.nextInt();
                students.put(newId, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " name: " + student.getValue());
        }
    }
}
