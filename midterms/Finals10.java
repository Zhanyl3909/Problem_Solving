class ListNode {
   int value;
   ListNode next;
   ListNode(int v,ListNode p) {
      value = v; next = p;
   }
}
class List {
   ListNode head;
   List() {
      ListNode f = null;
      head = null;
      for (int i = 0; i < 5; i++) {
         ListNode p = new ListNode(0,head);
         if (i == 0) f = p;
         head = p;
      }
      f.next = head;
      f.next.next.next = f;
   }
   void traverse(int data[]) {
      for(int i = 0; i < data.length; i++) {
         head.value = data[i];
         head = head.next;
      }
   }
   void print() {
      ListNode p = head;
      for (int i = 0; i < 5; i++) {
         System.out.println(p.value);
         p = p.next;
      }
   }
}
class Finals10 {
   public static void main(String args[])
   {
      int data[] = { 2,7,6,3,1 };

      List l = new List();
      l.traverse(data);
      l.print();
   }
}
