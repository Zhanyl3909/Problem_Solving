
class Finals09 {

static class Node {
	int num;
	Node next;
	Node(int x) {
		num = x;
		next = this;
	}
}

public static void main(String args[])
{
	int key[] = { 2,7,6,3,1 };
	Node h,p,q;
	int i;

	h = new Node(key[0]);
	p = h;
	for(i = 1; i < 5; i++) {
		q = new Node(key[i]);
		q.next = p.next;
		p = q;
	}
	p = h;
	for(i = 0; i < 5; i++) {
		System.out.print(p.num+" ");
		p = p.next;
	}
}
}
