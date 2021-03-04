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

    static void CheckId(int id) {
        if (id != 1) {
            System.out.println("Not autorized");
        }
        else {
            System.out.println("'Else...if' on a method is working");
        }
    }

    static int SumOverloading(int num1, int num2) {
        return num1 + num2;
    }

    static double SumOverloading(double num1, double num2) {
        return num1 + num2;
    }


    /*
    static int ScopeMethod(int x) {
        {
            y = 1;
        }
        return x + y; // y -> cannot be used as a varible do to scope
    }*/

    // recursive
    public static int RecursiveMethod(int x) {
        if (x > 0) {
            return x + RecursiveMethod(x-1);
        }
        else {
            return 0;
        }
        
    }

    public static int HaltRecursiveness(int start, int end) {
        if (end > start) {
            return end = end + HaltRecursiveness(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        firstMethod(); // calling the method in the main method
        secoundMethod("dear sir"); // parameter is passed to method
        secoundMethod("dear ma'am"); 
        thirdMethod("admin", 123); // multiple parameters
        System.out.println(forthMethod(10)); // outputs' 10
        System.out.println(fifthMethod(10,5)); // outputs' 15
        int z1 = fifthMethod(100, 5); // outputs' 105
        System.out.println(z1);
        CheckId(1); // outputs' 'Else...if' on a method  is working
        System.out.println(SumOverloading(10, 25)); // overloading is reusing the method
        System.out.println(SumOverloading(10.2, 25.7)); // to use the same logic in diferent types of vars
        // System.out.println(ScopeMethod(1)); // scope gives error, showing how scopes work
        int recursion_result = RecursiveMethod(10);
        System.out.println(recursion_result); // outputs' 55, method incepetion == recursive method
        int halt_result = HaltRecursiveness(5, 15);
        System.out.println(halt_result); // outputs 110
      

    }
}

/*

Outputs:

hello, from a method.
dear sir, the 'parameter' is working
dear ma'am, the 'parameter' is working
hostname: admin, ip: 123
20
15
105
'Else...if' on a method is working
35
35.9
55
110
*/
