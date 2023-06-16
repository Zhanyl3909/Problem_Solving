
abstract class Person {
   int val;
   Person(int v) {
      val = v;
   }
   abstract void doingX(Person a,Person b,Person c);
   void print() {
      System.out.println(val);
   }
}
class Man extends Person {
   Man(int v) {
      super(v);
   }
   void doingX(Person a,Person b,Person c) {
      val++; a.val = a.val + 1; b.val = b.val + 1;
      if (c != null) {
         c.doingX(this,b,null);
      }
   }
}
class Woman extends Person {
   Woman(int v){
      super(v);
   }
   void doingX(Person a,Person b,Person c) {
      val--; a.val = a.val - 1; b.val = b.val - 1;
      if (c != null) {
         c.doingX(this,b,null);
      }
   }
}
class Test1 {
   public static void main(String args[])
   {
      int data[] = { 2,7,6,3,1 };
      Man p0 = new Man(data[0]); 
      Woman p1 = new Woman(data[1]); 
      Man p2 = new Man(data[2]); 
      Woman p3 = new Woman(data[3]); 
      Man p4 = new Man(data[4]);
      p0.doingX(p0,p1,null);
      p0.doingX(p2,p3,p4);
      p0.print();
      p1.print();
      p2.print();
      p3.print();
      p4.print();
   }
}
