package Com.TechilyFly.PracticeSet4CWH;

import java.util.Scanner;

/*
Write a Java program to find whether a year entered by the user is a Leap year or not.
*/

public class FindLeapYearOrNot {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Year: ");
        long year = userInput.nextLong();

        userInput.close();

        if(year % 4 == 0  && year % 100 != 0){
            System.out.println("This year is a leap year: " + year);
        } else {
            System.out.println("This year is not a leap year: " + year);
        }
    }
    
}
