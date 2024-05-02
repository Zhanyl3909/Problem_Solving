class main {

    static int foo(int x) {
        if (x/10 == 0) return x;

        int y = x % 10;
        int z = x / 10;

        if (y % 2 == 0) {
            return foo(z)*10;
        } else {
            return foo(z)*10 + y;
        }
    }

    public static void main(String args[]) {
        int n;

        n = 87136;
        System.out.println("answer = " + foo(n));
    }
}
