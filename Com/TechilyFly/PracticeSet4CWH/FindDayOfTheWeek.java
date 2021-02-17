package Com.TechilyFly.PracticeSet4CWH;

import java.util.Scanner;

/*
Write a Java program to find out the day of the week given the number [1 for monday, 2 tuesday...and so on!]
*/


public class FindDayOfTheWeek {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Number between 1 - 7: ");
        
        byte number = userInput.nextByte();

        userInput.close();

        switch(number) {
            case 1 -> System.out.println("Today is Monday.");
            case 2 -> System.out.println("Today is Tuesday.");
            case 3 -> System.out.println("Today is Wednesday.");
            case 4 -> System.out.println("Today is Thursday.");
            case 5 -> System.out.println("Today is Friday.");
            case 6 -> System.out.println("Today is Saturday.");
            case 7 -> System.out.println("Today is Sunday.");
            default -> System.out.println("Wrong input please type only between 1 - 7 Only!");
        }

    }
    
}
