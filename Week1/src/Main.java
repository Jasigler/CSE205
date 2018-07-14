
//***************************************************************************************
//CLASS: Main
//
//DESCRIPTION: Not sure
//
//COURSE AND PROJECT INFO:
//CSE205 Oject Oriented Programming and Data Structures, Summer 2018
//Project Number: 1
//
//AUTHOR:
//Jason Sigler
//jsigler2@asu.edu
//
//***************************************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

class Main{

    //Constructor method
    public Main(){

    };

    private void Run () throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listRunsUpCount = new ArrayList<>();
        ArrayList<Integer> listRunsDownCount = new ArrayList<>();

        try{
          Scanner read = new Scanner(new File("p01-in.txt"));

        }
        catch (FileNotFoundException pExcept){
            System.out.println("Could not find your file. Exiting.");
            System.exit(-1);
        }

        FindRuns(listRunsUpCount, );

    }//End run method

    private ArrayList<Integer> FindRuns (ArrayList<Integer> pList, int pDir){
        ArrayList<Integer>
        int i = 0;
        int k = 0;
        int runsUp = 0;
        int runsDown =0;

        do {
            if ()

        } while (i < pList.size() -1 );

        return null;
    }


    private ArrayList<Integer> Merge (Integer pListRunsUpCount, Integer pListRunsDnCount){
        return null;
    }





    public static void main(String[] pArgs) {

    }//End of main method
}//End of class