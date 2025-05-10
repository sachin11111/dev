package MultiThreading;

public class Thread2 extends Thread{
	Resource r;
	public Thread2(Resource r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println(this.getClass().getName()+" started");
		try {
			System.out.println(this.getClass().getName()+" working on "+r.iteration);
			sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(this.getClass().getName()+" ended");
		r.workDone();
	}
	
}
