class parent {
    void show() {
        System.out.println("From parent...");
    }
}

class child extends parent {
    void show() {
        // super.show();
        System.out.println("From child...");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        // objects are typically created at runtime.
        parent p = new parent();
        p.show();
        child c = new child();
        c.show();
        parent x = new child(); // it will call the constructor of the child class so it initialises the method
        x.show(); // and properties of the child class and assign it into the object variable x, so
                  // after calling the show method it will execute the show method of the child
                  // class
        // In Java, the method that gets executed is determined by the actual type of
        // the object at runtime rather than the reference type. This means that even
        // though the reference x is of type parent, since it points to an instance of
        // child, the overridden show() method in the child class gets executed.
        ;
        // [ child y = new parent();
        // y.show(); ] // this will throw error.....
    }
}