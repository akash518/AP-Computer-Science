public class CompSci_Test3 {
    public static void main(String[] args) {
        /*
        20 Multiple Choice:
            - Read Code, primitive vs. Class
        

        2 Free Response:
            - int array, String methods

        Recursion
            - Calling the method inside itself
            - Steps
                - Start method normally
                - When recursion occurs, must finish the recursion first
                - Continue on to the rest of the code

            Void Recursion
                - Print before recursion
                public void tricky (int n) {
                    if (n>=0) {
                        System.out.println(n); 8, 6, 4, 2, 0
                        tricky(n-2); 6, 4, 2, 0
                    }
                }
                Outcome: 8, 6, 4, 2, 0

                - Print after recursion
                public static void tricky(int n) {
                    if (n>=0) {
                        tricky(n-2); 6, 4, 2, 0
                        System.out.println(n); 8, 6, 4, 2, 0
                    }
                }
                Outcome: 0, 2, 4, 6, 8

            Return Recursion
                public static int tricky(int n) {
                    if (n == 1 || n == 2) {
                        return 2*n;
                    }
                    else {
                        return tricky(n-1) - tricky(n-2);
                    }
                }
                Work:
                         tricky(4)      -        tricky(3)
                [tricky(3) - tricky(2)] - [tricky(2) - tricky(1)]
                [tricky(2) - tricky(1)] - [4]  -  [   4      -     2    ]
                [   4      -     2    ] - [4]  -  [   4      -     2    ]
                          [2]           - [4]  -         [2]
                                        = -4
                Outcome: -4
        
        
        Primitive vs. Class
            - Primitive
                - lower case
                - int, double, boolean, etc.
                - holds less memory
            - Class
                - upper case
                - String, Array
                - holds more memory
        
        Primitive vs. Class Methods
            - Primitive
                - copies only the value
                - does not save
                public static [int, double, boolean] num()
            - Class
                - copies the memory address
                - saves the memory address / value
                public static [String, int[]] num()
        
        Errors
            - Compile time
                - Occurs before the code runs (when compiling)
                - Code cannot run
                - Syntax Error
            - Runtime
                - Occurs after a part of the code runs (when running)
                - Parts of code run
                - Arithmetic Error
            
            - Exceptions
                - exceptions == errors
                - Common errors

        Strings
            - Class Data Type
            - String word = " ";
            - Null = Empty
            - If the String = null, then null will be printed
                - String word = null;
            - Using == to compare String will compare the memory address
            - Use .equals() to compare Strings
            - Letters are stored as individual characters
            - The memory address starts at 0 and ends at .length()-1
                - .length() is the total length
                - .length()-1 is the position of the last character
            - Concatination
                - '+' is overloaded
                - the Strings combine
        
        String Methods
            - .equals()
                - Checks if the Strings are the same
                - word.equals("word");
            - .charAt()
                - Finds the character at a certain position
                - word.chatAt(index);
            - .indexOf()
                - Finds the position of the character
                - word.indexOf(character);
            - .substring()
                - Find the set of characters between the parameters
                - word.substring(start, stop); Prints the characters from start to stop
                - word.substring(start); Prints all of the characters after start
            - .toUpperCase()
                - Capitalizes the String
                - word.toUpperCase();
            - .toLowerCase()
                - Lower cases the String
                - word.toLowerCase();
            - .compareTo();
                - Compares the distance between the letters in their set position
                - word1.compareTo(word2);
                - Stops as soon as the letters are different
                - If both Strings are equal, the difference is 0
                - If the first String's letter is greater than the second String's letter, than the difference is > 0
                - If the first String's letter is less than the second String's letter, than the difference is < 0
                - If there are empty positions, they count as -1, or 1
                - Example
                    - word1 = "dagger";
                    - word2 = "daga";
                    - d = d, 0
                    - a = a, 0
                    - g = g, 0
                    - g ≠ a, 6
                    - difference = 6
        
        One-Dimensional Arrays
            - int[] array = new int[length];
            - double[] array = new double[length];
            - String[] array = new String[length];
            - If entering pre-initialized values, use '= {...}';
            - Holds primitve or Class types
            - "new" command creates a new reference, a new memory address
            - Element: the box of the array; the object at the index
            - Index: the address of the elements, starts at 0 and ends at (length-1); position of the elements
            - Initialize: Storing values in the array
        
        For Loop
            - a loop that continues for a pre-determined amount of time
            - for (int i = 0; i < max value; i++) {
            }
            Forward
            - for (int i = 0; i < array.length; i++) {
                
            }
            Backward
            - for (int i = array.length; i > 0; i--) {
                .substring(i-1,i);
            }
            - for (int i = array.length-1; i >= 0; i--) {
                .substring(i,i+1);
            }
            
            Searching
            - Single For Loop to compare one object to the entire array
            - Double For Loop to compare more than one object to the entire array, or compare every element in two arrays
            - Double For Loops
                - Compare more than one thing
                - Search Two Arrays
        
        Array Methods
            - .length;
                - array.length;
        
        Math.random()
            - Math.random()*(range-1)+/-(min);
            - System.out.println(Math.random()*(11)+5);
        
        Modular Division
            - int % int = remainder;
            - int num = 4300;
            - num = num % 5;
            - num = 0;
        
        Math Functions
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
    }
}
