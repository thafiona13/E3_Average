/*
 * Fiona Xie
 * 5/20/2020
 * Reads a file, finds average mark and outputs whatever mark is above, below or equal to average.
 */
package e3_average;

import java.util.Scanner;
import java.io.*;

public class E3_Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); //scan for inputting file name
        String fileName, amount;
        int sum=0; // sum of all marks
        
        Scanner file;
        
        //Gets the name of the file and checks if theres any error
        System.out.print("Name of the file: ");
        fileName = x.nextLine();
        
        //determines if file can be found
        try{
            file = new Scanner(new File(fileName));
        }
        catch (IOException e){
            System.out.println(fileName + " : File Not Found");
            return;
        }
        //finds how many mark there are
        amount = file.nextLine();
        
        //changes string to int
        int count = Integer.parseInt(amount);
        
        //creates array with number of marks
        int average [] = new int [count];
        
        
         for (int i = 0; i < count; i++) { // for loop reads every line from file
            amount = file.nextLine(); // reads the line
            int number = Integer.parseInt(amount);//changes string to int
            
            //stores mark in array
            average[i]=number;
            //adds mark to total sum
            sum = number + sum;
         }
         
         //finds average
         int mean = sum/count;
         
         //prints average mark
         System.out.println("The average mark is " + mean);
    
         //Determines if mark is above or below average and prints out results
         for (int i = 0; i<count;i++){
             if (average[i]>mean){
                 System.out.println(average[i]+" is above the average.");
             }
             else if (average[i]==mean){
                 System.out.println(average[i]+ " is equal to average.");
             }
             else{
                 System.out.println(average[i]+ " is below the average.");
             }
         }
        }
    }
