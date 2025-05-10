package stacks;

public class Stack {
	private Node top;
	private int height;

	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}
	
	public void printList () {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getTop() {
		System.out.println(top.value);
	}
		
	public void getHeight() {
		System.out.println(height);
	}
	
	
	public void push(int value){
		Node newNode = new Node(value);
		if (height == 0){
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		height++;
	}
		
	public Node pop(){
		if  (height == 0) return null;
	
		Node temp = top;
		if  (height == 1) {
			top = null;
		} else {
			top = top.next;
			temp.next = null;
		}
		height--;
		
		return temp;
	}

}
