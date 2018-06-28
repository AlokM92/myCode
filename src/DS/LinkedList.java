package DS;

class Node{
	Node next;
	int data;
	Node(int d){
		data=d;
		next=null;
	}
	
}
public class LinkedList {
	Node head;
	public  void printList(){
		Node n=head;
		if(n==null){
			System.out.println("Linked list is empty");
		}
		while(n.next!=null){
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	void reverse(Node head){
		Node current = head;
		Node prev=null;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		head=prev;
		System.out.println("reversing");
	printList();
	}
public static void main(String args[]){
	LinkedList l=new LinkedList();
	l.head=new Node(1);
	Node n2=new Node(2);
	Node n3=new Node(3);
	Node n4=new Node(4);
	Node n5=new Node(5);
	l.head.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	l.printList();
	System.out.println("reversing1");
l.reverse(l.head);
l.printList();
}
}

