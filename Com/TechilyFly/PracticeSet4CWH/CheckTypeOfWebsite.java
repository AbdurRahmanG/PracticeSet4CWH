package Com.TechilyFly.PracticeSet4CWH;

import java.util.Scanner;

public class CheckTypeOfWebsite {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter website extension: Like .com, .org or .in etc.: ");
        String extension = userInput.nextLine();

        userInput.close();

        if(extension.endsWith(".com")){
            System.out.println("This is a Commercial Website.");
        } else if( extension.endsWith(".org")){
            System.out.println("This is an Organizational Website.");
        } else if(extension.endsWith(".in")){
            System.out.println("This is an Indian Website.");
        } else {
            System.out.println("This is not in List.");
        }
    }
    
}
