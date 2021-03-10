package src.part_3_classes;

class ClassesExemple {

    static void staticMethod() {
        System.out.println("Static: This does not need and object to be called");
    }

    public void publicMethod() {
        System.out.println("Public: This does need an object to be called");
    }

    public static void main(String[] args) {
        Classes meuObjeto = new Classes();
        System.out.println(meuObjeto.x);
        meuObjeto.x = 2;
        System.out.println(meuObjeto.x);
        Classes meuObjeto2 = new Classes();
        System.out.println(meuObjeto2.x);

        staticMethod(); // calls the staticMethod

        ClassesExemple publicMethodObj = new ClassesExemple();
        publicMethodObj.publicMethod(); // calls the publicMethod
    }
}

/**

 class ClassesExemple {
    public static void main(String[] args) {
        Classes meuObjeto = new Classes();
        System.out.println(meuObjeto.x);
    }
 }
  This file creates objects using the class in the file Classes.java,
 uses it's attributes (in this case the value of x) an prints out
 the object

 outputs:
 5

 **/