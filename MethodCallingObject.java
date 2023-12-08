// Java program to create a method returning an object
class sample{

    void sayHello(){
        System.out.println("Hello.....");
    }

    sample retObj(){
        return this;
    }
}

public class MethodCallingObject {
    public static void main(String[] args) {
        sample s1=new sample();
        sample s2=s1.retObj();
        s2.sayHello();
    }
}
