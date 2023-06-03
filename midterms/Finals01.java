class Test1 {
    static class Who {
       int result1 = 0;
       static int result2 = 0;
       public Who() {
       }
       void calculate(int data[]) {
          for(int i = 0; i < data.length; i++) {
             int x = data[i];
             if (x/2*2 == x) { // even number
                result1 = result1 + x;
             } else { // odd number
                result2 = result2 - x;
             }
          }
       }
       void print() {
          result2 = result1+result2;
          System.out.println(result2);
       }
 }
    public static void main(String args[])
    {
       int data[] = { 2,7,6,3,1 };
       Who p = new Who();
       p.calculate(data);
       p.print();
       p = new Who();
       p.calculate(data);
       p.print();
    }
 }
