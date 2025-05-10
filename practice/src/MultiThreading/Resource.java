package MultiThreading;

public class Resource {
	public int counter = 0;
	public int iteration = 1;
	
	public void workDone() {
		synchronized (this) {
			counter = counter+1;
			if(counter == 4) {
				notify();
			}
		}
	}
	public void hasAllFinished(String className) {
		try {
			synchronized (this) {
				if(counter < 4) {
					System.out.println(className + " Moved in waiting state");
					wait();
				}
			}
		} catch (InterruptedException e) {
		}
	}
}
