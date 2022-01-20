public class Midterm {
    public static void main(String[] args) {
        /*
        Unit 1
            - Input and Output
                - Scanner scan = new Scanner(System.in);
                - data type = scan.next(Line,Int,Double);
                - System.out.println();
            - Escape Characters
                - anything that starts with \
                - \n = new line
                - \t = tab
                - \\ = backslash
                - \' or \" = quotes
            - Data Types
                - primitive
                    - lower case
                    - int, double, boolean, etc.
                    - holds less memory
                - Class
                    - upper case
                    - String, Array
                    - holds more memory
            - Modular Division
                - int % int = remainder;
                - int num = 4300;
                - num = num % 5;
                - num = 0;
            - Int Division
                - returns an int
                - int num = 7;
                - num = num / 2;
                - num = 3;
            - Double Division
                - returns a double
                - double num = 7;
                - num = num / 2;
                - num = 3.5;
            - Roundoff Error
                - AVOID
                - use Math.round()
                - double num = 3.9999999999998;
                - System.out.println(Math.round(num*100)/100.0);
            - Math Functions
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
            - Casting
                - (int)
                - (double)
                - (String)
        */

        /*
        Unit 2
            - Booleans
                - true or false
                - boolean bool;
            - Nested if-statements
                - if-statements inside one another
                - if () {
                    if () {
                    }
                }
            - && and ||
                - && = and
                - || = or
            - Else If
                - after initial if statement
                - checks for other possibilities
            - DeMorgan's Law
                - distributes the !
                - !(x && y) = !x || !y
                - !(!(x || y)) = x || y
                - !(x < z && y > z) = !x >= !z || !y <= !z
            - Short-circuit Eval
                - ends the inside of the if statement right away
                    - if first is true then ends
            - While Loops
                - while ()
                    - does not end until condition is met
                    - x > y
                        - x <= y to end
            - Random Numbers
                - math.random()*(range+1)+/-(min);
                    - range = max - min;
            - Binary <--> Base 10
                - Binary to Base 10
                    - left to right
                        - right-most position is 2^0
                    - ∑2^(position of 1) or convert positions to numbers and add
                    - Examples
                        - 110010
                            - 2^5 * 2^4 + 2^1 = 50
                            - 32 + 16 + 2 = 50
                - Base 10 to Binary
                    - left to right
                    - subtract by biggest number in base 10
                        - keep substracting until end
                    - Examples
                        - 69
                            - 69 - 64 = 5 - 4 = 1 - 1 = 0
                            - 1000101
        */

        /*
        Unit 3
            - Strings
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
            - String Methods
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
            - For Loops
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
            - Arrays
                - int[] array = new int[length];
                - double[] array = new double[length];
                - String[] array = new String[length];
                - If entering pre-initialized values, use '= {...}';
                - Holds primitve or Class types
                - "new" command creates a new reference, a new memory address
                - Element: the box of the array; the object at the index
                - Index: the address of the elements, starts at 0 and ends at (length-1); position of the elements
                - Initialize: Storing values in the array
                
                - Array Methods
                    - .length;
                        - array.length;
        */

        /*
        Unit 4
            - Primitives are garbage collected, Class are preserved
                - primitive method
                        - copies only the value
                        - does not save
                        public static [int, double, boolean] num()
                - Class method
                    - copies the memory address
                    - saves the memory address / value
                    - public static [String, int[]] num()
            - Recursion
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
            - Void Method
                - does not return anything
                - used as setters
                -   CANNOT HAVE A RETURN STATEMENT
            - Data Type Method (int, double, String, ...)
                - returns the parameter
                - used as getters
                - NEEDS A RETURN STATEMENT
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
        */

        /*
        Unit 5
            - Instance Variables
                - mostly private
                - NOT ACCESSIBLE IN ANYTHING OTHER THAN THE MAIN FILE
                - holds the original value
                
                - Static Instance Variables
                    - static = one instance / one-of-a-kind
                    - belongs to the class
                    - used as total counters
                - Final Instance Variables
                    - fully uppercased
                    - never changes
                    - final value
            - Private
                - only accessible in the main file
                - not accessible in other files
                - meant for the coder
            - Public
                - accessible to other files
                - meant for users
            - Constructors
                    - public (name of class)() {
                    }
                    - used to initalize objects of the class and locate proper memory to objects
                    - can have parameters
                    - users call constructors in the runner file
            - Overload Methods
                - different methods that have the same name with difference signatures
            - Override Methods
                - same name, paramters, or signature, and same return
                - child class extends parent class
            - Getters
                - accessor method
                - returns the parameter
                - Example
                    public int getRun() {
                        return run;
                    }
            - Setters
                - mutator method
                - void method
                - Example
                    public void setRun(int r) {
                        run = r;
                    }
                    public void SetRun(int r) {
                        this.run = r;
                    }
        */

        /*
        Unit 6
            - ArrayLists
                - does not need an initial length
                - ArrayList <(data type)> array = new ArrayList<(data type)>();
            - ArrayList Methods
                - .add or .add(index, element) = add element
                - .set(index, element) = replaces element
                - .remove(element) or .remove(element) = removes element
                - .clear() = clears the array
                - .get(index) = gets the element in the position
                - .size() = length of the array
            - For Each Loop
                - cannot alter the arraylist
                - only get or check an element
                - for ((data type) temp : array) {
                }
        */
    }
}
