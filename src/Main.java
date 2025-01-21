// Made by Benjamin Rubio
// For Mr. Gross Software and Programming Dev 2 Class
// Contact at benjamin.rubio@malad.us

import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    // creates an easy-to-use method to write to the files created in the program
    public static void fileWrite(FileWriter writer, String content) {
        // uses a try catch statement just in case there's an exception
        try {
            writer.write(content + "\n"); // writes the char 'a' to the output file
        } catch (IOException exception) {
            System.out.println(exception.getMessage()); // tells the user what went wrong
        }
    }

    // creates an easy method to tell the user what to enter and gets their input
    public static String userInput(Scanner inputScanner, String enterString) {
        System.out.println(enterString); // tells the user what to enter
        return inputScanner.nextLine(); // returns what the user entered
    }

    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in); // creates the scanner that we're going to use to get the user's name and grade

        File outputFile = new File("student.txt"); /* initializes the file we're going to create and be outputting the user's name and grade to
         * it'll be created in the same directory as the program's .jar file */
        FileWriter outputFileWriter = new FileWriter(outputFile); // creates the file writer for the output file

        String firstName = userInput(inputScanner, "Enter your first name: "); // gets the user's input as a string and stores it as 'firstName'

        fileWrite(outputFileWriter, "Student first name: " + firstName); // writes the user's first name to the output file

        String lastName = userInput(inputScanner, "Enter your last name: "); // gets the user's input as a string and stores it as 'lastName'

        fileWrite(outputFileWriter, "Student last name: " + lastName); // writes the user's last name to the output file

        String grade = userInput(inputScanner, "Enter your grade: "); // gets the user's input as a string and stores it as 'grade'

        fileWrite(outputFileWriter, "Student grade: " + grade); // writes the user's grade to the output file

        // uses a try catch statement just in case there's an exception
        try {
            outputFileWriter.close(); // closes the writing stream
        } catch (IOException exception) {
            System.out.println(exception.getMessage()); // tells the user what went wrong
        }
    }
}