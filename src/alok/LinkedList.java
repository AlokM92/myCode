package alok;

import java.util.Scanner;

import javax.xml.soap.Node;

class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		 next=null;
			
		}
	}
	public void printList(){
		Node n=head;
		int counter=0;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
			counter++;
		}
		System.out.println("length of list"+counter);
	}
	public void reverse(){
		
	}
	
	public static void main(String arg[]){
		
		LinkedList llist=new LinkedList();
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		llist.head.next=second;
		second.next=third;
		llist.printList();
	}
	
}