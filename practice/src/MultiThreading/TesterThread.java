package MultiThreading;

public class TesterThread extends Thread{
	Resource r;
	public TesterThread(Resource r) {
		this.r = r;
	}
	@Override
	public void run() {
		super.run();
		System.out.println(this.getClass().getName()+" started");
		r.hasAllFinished(this.getClass().getName());
		try {
			System.out.println(this.getClass().getName()+" working on "+r.iteration);
			sleep(20000);
		} catch (InterruptedException e) {
		}
		System.out.println(this.getClass().getName()+" ended");
		r.counter=0;
	}
	
}
