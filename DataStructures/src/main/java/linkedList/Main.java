package linkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList linkList = new LinkedList(7);
		
		linkList.printList();
		linkList.getHead();
		linkList.getTail();
		
		linkList.get(5);
		
		linkList.append(5);
		linkList.prepend(3);
		
		linkList.printList();
		linkList.getHead();
		linkList.getTail();
	}
	
}
