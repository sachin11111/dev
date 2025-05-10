package stacks;

public class Main {

	public static void main(String[] args) {
		
		Stack myStack = new Stack(0);
		myStack.push(1);
		myStack.push(1);
		myStack.push(1);
		myStack.printList();
		myStack.pop();			
		myStack.printList();
		
	}
	
}
