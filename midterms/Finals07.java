
class Node {
   int val;
   Node left;
   Node right;
   Node(int x) {
      val = x;
      left = null;
      right = null;
   }
   void traverse() {
      System.out.println(val);
      if (left != null) left.traverse();
      if (right != null) right.traverse();
   }
}
class Test4 {
   public static void main(String args[])
   {
      int data[] = { 2,7,6,3,1 };
      Node t1 = new Node(data[0]);
      Node t2 = new Node(data[1]);
      Node t3 = new Node(data[2]);
      Node t4 = new Node(data[3]);
      Node t5 = new Node(data[4]);
      t5.right = t2;
      t2.left = t3;
      t2.right = t4;
      t5.left = t1;
      t5.traverse();
   }
}
