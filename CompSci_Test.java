import java.util.Scanner;
import java.util.Math;

public class CompSci_Test {
    public static void main(String[] args) {

        // 20 Multiple Choice

        /*
        Data Types
            - int;
            - double;
            - String;
            - boolean;
        /*
        Primitive vs. Class
            - Primitive
                - lower case
                - int, double, boolean, etc.
                - holds less memory
            - Class
                - upper case
                - String
                - holds more memory
        */

        /*
        Integer Division
             - int num1 = 5;
             - int num2 = 10;
             - System.out.println(num2 / num1); = 2

             - int num1 = 15;
             - int num2 = 7;
             - System.out.println(num1 / num2); = 2
             
             - int division rounds down to the nearest integer
        */

        /*
        Cast Data Types
            - (int)
            - (double)
            - (String)
        */

        /*
        Math. Functions
            - Math.round()
                - Math.round((num1 +/-/* num2) * 10/100/1000)/10.0/100.0/1000.0);
                - below .4 rounds down
                - above .5 rounds up
                - double hi = 0.465;
                - System.out.println(Math.round((hi)*1000)/1000.0);
                - *10 & /10.0 = tenths
                - *100 & /100.0 = hundreths
                - *1000 & /1000.0 = thousandths
            - Math.random()
                - Math.random()*(range+1)+/-(min);
                - System.out.println(Math.random()*(11)+5);
            - Math.sqrt()
                - Math.sqrt(value);
                - System.out.println(Math.sqrt(45));
            - Math.pow()
                - Math.pow(value,exponent);
                - System.out.println(Math.pow(2,2));
            - Math.abs()
                - Math.abs(value);
                - System.out.println(Math.abs(10-15));
        */

        /*
        Round off Error
            - AVOID
            - use Math.round()
            - double num = 3.9999999999998;
            - System.out.println(Math.round(num*100)/100.0);
        */

        /*
        Scanner Class
        - Scanner scan = new Scanner(System.in);
        - System.out.println();
        - int = scan.nextInt();
        - String = scan.nextLine();
        - double = scan.nextDouble();
        */

        // 4 Open Ended

        /*
        Math.random()
            - Math.random()*(range+1)+/-(min);
        */

        /*
        Input and Output with Calculations
            - Scanner scan = new Scanner(System.in);
            - data type = scan.next(Line,Int,Double);
            - use calculations (+/-/*)
        */

        /*
        Change Machine
            - Scanner scan = new Scanner(System.in);
            - double paid;
            - double cost;
            - double change;
            - int quarters;
            - int dimes;
            - int nickels;
            - int pennies;

            - System.out.println("Enter the cost of the item");
            - cost = scan.nextDouble();

            - System.out.println("Enter how much you paid for the item: ");
            - paid = scan.nextDouble();

            - change = (paid-cost);
            - change = Math.round(change*100)/100.0;
            - System.out.println("Change Owed: " + change);

            - quarters = (int)(change/0.25);
            - change %= 0.25; == change = change % 0.25;
            - dimes = (int)(change/0.10);
            - change %= 0.10;
            - nickels = (int)(change/0.05);
            - change %= 0.05;
            - pennies = (int)(Math.round(change/0.01));

            - System.out.println("Quarters: " + quarters);
            - System.out.println("Dimes: " + dimes);
            - System.out.println("Nickels: " + nickels);
            - System.out.println("Pennies: " + pennies);
        */

        /*
        Geometry
            - Find perimeter;
            - Find area;
            - Find circumference;
        */
    }
}