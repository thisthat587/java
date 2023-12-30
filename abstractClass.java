class upperClass {
    public int sum1() {
        return 10;
    };

    class InnerClass {
        public int sum2() {
            int x = 11;
            return x;
        }
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        upperClass u=new upperClass() ;
        System.out.println(u.sum1());
        upperClass.InnerClass c = u.new InnerClass();
        System.out.println(c.sum2());
    }
}
