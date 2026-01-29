package week_1;

import static input.InputUtils.*;

/**
 * Ask the user how many miles they live from MCTC.

 Once the user has typed in their response,

 •	Display "You live more than 10 miles from MCTC" if they live more than 10 miles away,
 •	Display "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
 •	Display "You live less than 10 miles from MCTC" if they live less than 10 miles away.

 Use if – else if – else statements.

 */
public class Question_1_Miles_From_MCTC {

    public static void main(String[] args) {

        double miles = doubleInput("How many miles do you live from MCTC? ");

        String response = milesFromMCTC(miles);

        System.out.println(response);

    }

    
    public static String milesFromMCTC(double miles){

        // TODO Use if - else if - else statements to return the correct String

        // Return  "You live more than 10 miles from MCTC" if they live more than 10 miles away,
        // Return  "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
        // Return  "You live less than 10 miles from MCTC" if they live less than 10 miles away.
        

        // Using an if, else if, else statement to decide if you are more than, less than, or equal to 10 miles away
        if (miles > 10) {
            return "You live more than 10 miles from MCTC"; // Return a string
        } else if (miles == 10) { // Gets checked if not greater than 10
            return "You live exactly 10 miles from MCTC"; // Returns a string
        } else { // Runs if not more than 10 or equal to it
            return "You live less than 10 miles away from MCTC.";
        }
    }

    
    
}

