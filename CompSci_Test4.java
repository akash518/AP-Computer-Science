public class CompSci_Test4 {
    public static void main(String[] args) {
        /*
        25 mc 3pt each

        - Getters and Setters
            - Getters
                - Accessor Methods
                - Return a value
            - Setters
                - Mutator Methods
                - Void methods

        - Abstract vs Interface
            - Abstract Classes
                - public abstract class Name
                - Has an abstract method in the class
                - Child classes extend abstract classes
                    - public clas Name extends (Abstract class)
                    - Child classes do not have to de abstract if the method is defined
                    - Child classes are abstract if the method is not defined
                    - ALL METHODS MUST BE DEFINED IN THE CHAIN
            - Interface
                - public interface Name
                - Given that the methods are abstract
                - Child classes implement interfaces
                    - public class Name implements (Interface)
        
        - Inheritance
            - Child class has public methods from Parent class

        - superclass and subclass
            - superclass = parent 
            - subclass = child
        
        - super
            - SUPER MUST HAVE THE PROPER PARAMETERS
            - Constructor() {
                - super();
            }
            - Constructor(int a, String b) {
                - super(a, b);
            }
            - Constructor(int a, String b) {
                - super(a);
                - bore = b;
            }
            - Call methods in child class using super.METHOD_NAME()
        
        - Overriding / Overloading / Polymorphism
            - Overriding
                - Same named method in parent and child class

            - Overloading
                - Same named method in same class with different parameters
            
            - Polymorphism
                - When the computer decides which method to call from a parent or child class
        
        - Wrapper Classes
            - A way to use primitive data types as class data types
            - Example:
                - ArrayList<Integer> array = new ArrayList<Integer>();
                - Integer num = new Integer(value);
                    - Integer num = (value);
                - int num2 = (value);
                - int num3 = num.intValue();
                array.add(num);
                array.add(new Integer(num2))
                array.add(num3);
        */
    }
}
