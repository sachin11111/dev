package queue;

public class Main {

	public static void main(String[] args) {
		
		Queue myQ = new Queue(0);
		myQ.enqueue(1);
		myQ.enqueue(1);
		myQ.enqueue(1);
		myQ.printList();
		myQ.dequeue();		
		myQ.printList();
		
	}
	
}
