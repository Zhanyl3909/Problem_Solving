
class X
{
    int val;
    X(int val) {
        val = val;
    }
    void foo() {
        System.out.println(val);
    }
}
class Y   extends X
{
    Y(int val) {
        super(val);
    }
    void foo() {
        System.out.println(val-1);
    }
}
class Z   extends X
{
    Z(int val) {
        super(val);
    }
    void foo() {
        System.out.println(val+1);
    }
}
class Main {
    public static void main(String args[])
    {
        int data[] = { 2,7,6,3,1 };
        X x[] = new X[5];

        for(int i = 0; i < 5; i++) {
            if (data[i]/2*2 == data[i]) {
                x[i] = new Y(data[i]);
            }   else {
                x[i] = new Z(data[i]);
            }
            x[i].foo();
        }
    }
}
