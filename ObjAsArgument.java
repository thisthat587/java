class sample {
    int n;

    sample(int x) {
        n = x;
    }

    int getObj(sample obj) {
        int add=0;
        add=n+obj.n;
        return add;
    }
}

public class ObjAsArgument {
    public static void main(String[] args) {
        sample s1 = new sample(2);
        sample s2 = new sample(5);
        int result=s1.getObj(s2);
        System.out.println(result);
    }
}
