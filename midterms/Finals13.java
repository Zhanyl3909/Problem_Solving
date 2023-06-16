

class Human {
   static int weight = 0;
   int w;
   Human() {
      w = 0;
   }
   void eat(int x) {
      weight++;
      w = x;
   }
   void print() {
      System.out.println(weight+","+w);
   }
}
class Male extends Human {
   Male() {
      super();
   }
   void eat(int x) {
      super.eat(x);
      w = w - x;
   }
}
class Female extends Human {
   Female() {
      super();
   }
   void eat(int x) {
      super.eat(x);
      w = -1;
   }
}
class Test1 {
   public static void main(String args[])
   {
      int data[] = { 2, 7, 6, 3, 1 };
      Human x = new Human();
      Human y = new Male();
      Human z = new Female();
      x.eat(data[0]);
      y.eat(data[1]);
      z.eat(data[2]);
      y.eat(data[3]);
      z.eat(data[4]);
      x.print();
      y.print();
      z.print();
   }
}
