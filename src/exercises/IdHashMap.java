package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> studentIds = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID's
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID number: ");
                Integer newId = input.nextInt();
                studentIds.put(newId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while (!newStudent.equals(""));

        // Print class roster
        System.out.println("\nID roster:");

        for (Map.Entry<Integer, String> student : studentIds.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }

}
