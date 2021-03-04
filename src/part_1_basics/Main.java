package src.part_1_basics;

// Remembering the basics of Java Syntax, again :)
public class Main {
    public static void main(String[] args) {
        // Hello world;
        System.out.println("Hello Java, we meet once again.");
        
        // Basic variables
        String a="hello, ",b="from variables";
        int c=10, d=5;
        c += -10;
        float aa = 3.14f;
        aa -= 2.78f;
        char one = 'a';
        boolean lol = true;


        System.out.println(a+b);
        System.out.println(c+d);
        System.out.println(aa);       
        System.out.println(one); 
        System.out.println(lol); 
        System.out.println("the location of variables is: " + b.indexOf("variables"));
        System.out.println("The size of this string is: " + a.length());
        System.out.println(a.concat(b));
        System.out.println( "hello there \r general kronobi");
        System.out.println("the max in (5,10) is:" + Math.max(5,10));
        System.out.println("the max in (5,10) is:" + Math.min(5,10));
        System.out.println("the sqrd root of 64 is:" + Math.sqrt(64));
        System.out.println("the random number between 1 and 1000 is:" + Math.random() * 1000);

        // if statements
        if (c < d) {
            System.out.println("'if' is working");
        }

        int n1=1, n2=2;
        if (n1>n2) {
            System.out.println("This is wrong.");
        } else {
            System.out.println("'else' is working.");
        }

        int a0=0, b0=0;

        if (a0>b0) {
            System.out.println("This is not working");
        } else if (a0==b0) {
            System.out.println("'else if' is working");
        } else {
            System.out.println("This is not working");
        }

        int z0 = 0, z1 = 1;
        String zResult = (z0 > z1) ? "Not working" : "'Ternary Operand' is working";
        System.out.println(zResult);

        // switches
        int x = 10;
        switch (x) {
            case 1:
                System.out.println("This is not working");
                break;
            case 10:
                System.out.println("'Switch' is working");
        }

        int x1 = 1;
        switch (x1) {
            case 2: 
                System.out.println("This is not working");
                break;
            default:
                System.out.println("'default' in the switch is working");
                break;
        }

        // loops 
        int loop = 0, loops = 0;
        while (loop<5) {
            loops++;
            System.out.println("The amount of time this looped so far: " + loops);
            loop++;
        }
        System.out.println("'Loops' are working");

        int i = 0;
        do {
            System.out.println("'do-while loop' is working, and the loop count is: " + i);
            i++;
        } while (i <5);

        for (int i0=0; i0<3; i0++) {
            System.out.println("'for loop' is working");
        }

        String[] colors = {"black", "white", "blue"};
        for (String color : colors) {
            System.out.println(color);
        }

        // break and continue
        for (int aaa = 0; aaa < 10; aaa++) { //start of loop
            if (aaa == 4) {
                break;
            }
            System.out.println(aaa);
        } // finish of such loop

        for (int bbb=0; bbb < 10; bbb++) {
            if (bbb == 4) {
                continue; // skips 4
            }
            System.out.print(bbb);
        }

        // arrays
        String[] myArray = {"number1", "number2", "number3"};
        System.out.println('\n' + myArray[0]);
        myArray[0] = "number0";
        System.out.println(myArray[0]);
        System.out.println(myArray[0].length());
        
        for (int zzz=0; zzz < myArray.length; zzz++) {
            System.out.println(myArray[zzz]);
        }

        int[][] numbers = { {1,3}, {0,2}};
        System.out.println(numbers[0][0]); // array, element
        System.out.println(numbers[1][0]);
        
    }
}