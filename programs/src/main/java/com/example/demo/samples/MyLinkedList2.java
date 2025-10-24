package com.example.demo.samples;

public class MyLinkedList2<T> {
	Node head, tail; 
	class Node {
		T value;
		Node nextNode;
	}
	
	public void add(Node n) {
		tail.nextNode = n;
		tail = n;		
	}
	
	public void remove() {
		
		Node n = head;
		
		while (n.nextNode.nextNode != null) {
			n = n.nextNode;
		}
		
		tail = n;
		
	}
	
	
}




