package Com.TechilyFly.PracticeSet4CWH;

import java.util.Scanner;

/*
Write a program to find out whether a student is pass or fail; 
if it requires total 40% and at least 33% in each subject to pass.
Assume 3 subjects and take marks as an input from the user.
*/

public class StudentPassOrFail {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Physics Marks: ");
        float physicsMarks = userInput.nextFloat();

        System.out.println("Enter Chemistry Marks: ");
        float chemistryMarks = userInput.nextFloat();

        System.out.println("Enter Maths Marks: ");
        float mathsMarks = userInput.nextFloat();

        float totalMarksInPercentage = (physicsMarks + chemistryMarks + mathsMarks) / 300 * 100;

        userInput.close();


        if(totalMarksInPercentage >= 40 && physicsMarks >= 33 && chemistryMarks >= 33 && mathsMarks >= 33){

            System.out.println("You are Passed and Your Total Marks in Percentage is " + totalMarksInPercentage +
            "%");

        } else {

            System.out.println("You are Failed and Your Total Marks in Percentage is " +
            totalMarksInPercentage + "% and You Did not get at least 33.00% in every subject.");

        }

    }
    
}
