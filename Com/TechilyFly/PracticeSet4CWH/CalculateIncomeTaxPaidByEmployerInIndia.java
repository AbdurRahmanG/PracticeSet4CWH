package Com.TechilyFly.PracticeSet4CWH;

import java.util.Scanner;

/*
Calculate income tax paid by an employee to the Government as per the slots mentioned below:
Income Lac      Tax
2.5L - 5.0L     5%
5.0L - 10.0L    20%
Above 10.0L     30%

Note: that there is no tax below 2.5L. Take input amount as an input from the user.

*/

public class CalculateIncomeTaxPaidByEmployerInIndia {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Income in Lac: ");
        double income = userInput.nextDouble();

        userInput.close();

        if(income < 250000){
            System.out.println("You are not eligible to pay income tax. Enjoy your life!");
        } else if(income > 250000 && income < 500000){
            System.out.println("Your income tax will be: " + (income * 5 / 100));
        } else if(income > 500000 && income < 1000000){
            System.out.println("You income tax will be: " + (income * 20 /100));
        } else {
            System.out.println("Your income tax will be: " + (income * 30 /100));
        }


    }
    
}
