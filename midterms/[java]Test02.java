
class Test2 {
    static class Stack {
        int x;
        int y[] = new int[10];
        Stack() {
            x = 0;
            for (int i = 0; i < 10; i++)
                y[i] = 0;
        }
        void push(int a) {
            y[0] = a;
            x++;
            y[x] = x;
        }
        void pop() {
            if (x > 0) x--;
        }
        void print() {
            for (int i = 0; i < 10; i++)
                System.out.print(y[i] + " ");
        }
    }

    public static void main(String args[])
    {
        int i;
        Stack x = new Stack();
        int y[] = new int[5];


        y[0] = 8;
        y[1] = 7;
        y[2] = 1;
        y[3] = 3;
        y[4] = 6;

        for (i = 0; i < 5; i++) {
            x.push(y[i]);
        }
        for (i = 0; i < 5; i++) {
            x.pop();
        }
        x.print();
    }
}		
