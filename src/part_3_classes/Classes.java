package src.part_3_classes;

/**
 *
 public class Main {
 int x = 5;
 }

 This is a class, remember that it must start with an uppercase latter
 also, it's name must match the file's name



 to create an object, you must make a method, than use
 the class name, followed by the name of you object,
 and than use 'new' to call on o class, or the blueprint
 of your object. Calling an attribute of the class from the object
 is based on dot notation.

public class Main{
    int x = 5;
    public static void main(String[] args) {
        Main MeuObjeto = new Main();
        System.out.println(MeuObjeto.x);
    }
}
 // outputs: 5


You can also create multiple objects as such:

public class Classes {
    int x = 5;
    public static void main(String[] args) {
        Classes MeuObjeto = new Classes();
        Classes MeuObjeto2 = new Classes();
        System.out.println(MeuObjeto.x);
        System.out.println(MeuObjeto2.x);

    }
}
 outputs:
 5
 5

 **/


public class Classes {
    int x = 5;
}