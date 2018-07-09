//*******************************************
//Hw1_1.java
//CSE205
//Jason Sigler
//******************************************
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;


public class Hw1_1 {


    private static void main(String[] args) throws FileNotFoundException {

        //Declare method variables
        String sourceFile;
        String destinationFile;
        boolean writeSuccess = false; // Keeps track of the status


        //prompt the user for the input file
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the source file");
        sourceFile = scan.next();

        while (!writeSuccess){
            try {
                File inputFile = new File(sourceFile);
                destinationFile = sourceFile + ".txt";//Adds .txt extension to output file


            }
        }


    }//End of main method






}//End of class
