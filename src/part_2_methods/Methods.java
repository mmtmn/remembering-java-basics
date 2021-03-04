/*
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, 
and they are also known as functions.
*/

package src.part_2_methods;

public class Methods { // this is the class
    // methods goes here, inside the class
    static void firstMethod() {
        /*
        -> static means that the method belongs to the Main class
        and not an object of the Main class. You will learn more 
        about objects and how to access methods through objects 
        later in this tutorial.

        -> void means that this method does not have a return value.
        */
        System.out.println("hello, from a method.");
    }

    static void secoundMethod(String firstName) {
        System.out.println(firstName + ", the 'parameter' is working");
    }

    static void thirdMethod(String hostname, int ip) {
        /*
        Note that when you are working with multiple parameters,
        the method call must have the same number of arguments as
        there are parameters, and the arguments must be passed in
        the same order.
        */
        System.out.println("hostname: " + hostname + ", ip: " + ip);
    }

    static int forthMethod(int x) {
        /*
        Return Values
        The void keyword, used in the examples above, indicates that 
        the method should not return a value. If you want the method
        to return a value, you can use a primitive data type (such 
        as int, char, etc.) instead of void, and use the return 
        keyword inside the method:
        */
        return x + 10;
    }

    static int fifthMethod(int y, int z) {
        return(y + z);
    }
    public static void main(String[] args) {
        firstMethod(); // calling the method in the main method
        secoundMethod("dear sir"); // parameter is passed to method
        secoundMethod("dear ma'am"); 
        thirdMethod("admin", 123); // multiple parameters
        System.out.println(forthMethod(10));
        System.out.println(fifthMethod(10,5));
      }
}
