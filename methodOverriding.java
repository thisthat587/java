class Parent {
    void show() {
        System.out.println("From Parent...");
    }
}

class Child extends Parent {
    void show() {
        // super.show();
        System.out.println("From Child...");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // objects are typically created at runtime.
        Parent p = new Parent();
        p.show();
        Child c = new Child();
        c.show();
        Parent x = new Child(); // it will call the constructor of the Child class so it initialises the method
        x.show(); // and properties of the Child class and assign it into the object variable x, so
                  // after calling the show method it will execute the show method of the Child
                  // class
        // In Java, the method that gets executed is determined by the actual type of
        // the object at runtime rather than the reference type. This means that even
        // though the reference x is of type Parent, since it points to an instance of
        // Child, the overridden show() method in the Child class gets executed.
        ;
        // [ Child y = new Parent();
        // y.show(); ] // this will throw error.....
    }
}