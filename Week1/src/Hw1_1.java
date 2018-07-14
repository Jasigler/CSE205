//*******************************************
//Hw1_1.java
//CSE205
//Jason Sigler
//******************************************

import java.io.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


class Hw1_1 {

    public static void main(String[] args) throws FileNotFoundException {

        //Declare variables
        String sourceFile;
        String destinationFile;
        boolean writeSuccess = false;
        int lineCount = 0;
        String workLine = "";
        //prompt for input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a source file");
        sourceFile = scan.next();
        destinationFile = sourceFile + ".txt";
        scan.close();



        while (!writeSuccess) {
            try {
                //Open the file and instantiate  a scanner and writer
                File in = new File(sourceFile);
                File out = new File(destinationFile);
                Scanner readIn = new Scanner(in);
                PrintWriter writeOut = new PrintWriter(out);

                //Read lines and write to output file
                while (readIn.hasNextLine()) {
                    String workingLine = readIn.nextLine();
                    writeOut.println("[" +String.format("%03d", lineCount++) + "]" + workingLine);
                }//End of while
                //Close objects
                readIn.close();
                writeOut.close();

            }//End of try statement

            catch (FileNotFoundException e) {
                System.out.println("Error. " + sourceFile + " does not exist");
                }//End of catch

            finally {
               writeSuccess = true;
               System.out.println("Program ended.");
               }


        }//End of while loop

    }//End of main method
}//End of class