import java.util.*;

class Finals02 {
    public static void main(String[] args) {
        int data[] = {2,7,6,3,1};
        Stack<Object> x = new Stack<Object>();
        Stack<Object> y = new Stack<Object>();
        Stack<Object> z = new Stack<Object>();

        x.push(data[0]);
        for(int i=0; i<data[1]; i++) {
            y.push(data[1]);
        }
        x.push(data[2]);
        z.push(data[3]);
        z.push(data[4]);
        x.push(z);
        x.push(y);
        z.pop();
        x.pop();

        System.out.println(x);
    }
    
}
