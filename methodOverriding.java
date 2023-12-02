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
        parent p = new parent();
        p.show();
        child c = new child();
        c.show();
        parent x = new child(); //it will call the constructor of the child class so it initialises the method
                                //and properties of the child class and assign it into the object variable x,so
                                //after calling the show method it will execute the show method of the child class
        x.show();
        ;
        // child y = new parent();
        // y.show();
    }
}