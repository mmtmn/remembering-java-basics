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

    public static void main(String[] args) {
        firstMethod();
      }
}
