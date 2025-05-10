package CustomLinkList;

public class MyLinkedList<T> {
	Node head;
	
	class Node{
		T value;
		Node next;
	}
	
	public void insert(T value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		}else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}
	
	public void printList() {
		Node node = head;
		System.out.print(node.value);
		while(node.next != null) {
			node = node.next;
			System.out.print(" "+node.value);
		}
		System.out.println("");
	}
	
	public void swapMembers() {
		if(head == null || head.next == null)
			return;
		
		Node node = head;
		T temp = null;
		while(node.next != null) {
			
			temp = node.value; 
			node.value = node.next.value;
			node.next.value = temp;
			
			node = node.next;
			if(node.next!=null)
				node = node.next;
			else
				break;
		}
		
	}
	
	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.insert(1);
		list.insert(4);
		list.insert(2);
		list.insert(7);
		list.insert(1);
		list.insert(3);
		list.insert(5);
		
		list.printList();
		list.swapMembers();
		list.printList();
		
	}
	
}