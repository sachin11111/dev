package MultiThreading;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
	
	//Task - Implement Agile development model. Once all 4 developers finish their job, tester will start its job. 
	public static void main(String[] args) {
		Resource resource = new Resource();
		//usingJoin(resource);
		//or
		//usingVolatile(resource);
		//or
		usingWaitNotify(resource);
		//or
		//usignCyclicBarrier(resource);
	}
	
	public static void usignCyclicBarrier(Resource resource) {
		CyclicBarrier barrier = new CyclicBarrier(4);
	}
	
	public static void usingJoin(Resource resource) {
		try {
			Thread1 developer1 = null;
			Thread2 developer2 = null;
			Thread3 developer3 = null;
			Thread4 developer4 = null;
			
			while(true) {
				developer1 = new Thread1(resource);
				developer2 = new Thread2(resource);
				developer3 = new Thread3(resource);
				developer4 = new Thread4(resource);
				developer1.start();
				developer2.start();
				developer3.start();
				developer4.start();
				developer1.join();
				developer2.join();
				developer3.join();
				developer4.join();
			
				TesterThread testerThread = new TesterThread(resource);
				testerThread.start();
				testerThread.join();
			}		
		} catch (InterruptedException e) {
		}
	}
	
	public static void usingVolatile(Resource resource) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		Thread1 developer1 = null;
		Thread2 developer2 = null;
		Thread3 developer3 = null;
		Thread4 developer4 = null;
		
		while(true) {
			developer1 = new Thread1(resource);
			developer2 = new Thread2(resource);
			developer3 = new Thread3(resource);
			developer4 = new Thread4(resource);
			
			service.execute(developer1);
			service.execute(developer2);
			service.execute(developer3);
			service.execute(developer4);
			while (resource.counter < 4) {}
			
			TesterThread testerThread = new TesterThread(resource);
			service.execute(testerThread);
			while (resource.counter < 5) {}
			resource.counter = 0;
		}
	}
	
	public static void usingWaitNotify(Resource resource) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		while(true) {
			Thread1 developer1 = new Thread1(resource);
			Thread2 developer2 = new Thread2(resource);
			Thread3 developer3 = new Thread3(resource);
			Thread4 developer4 = new Thread4(resource);
			
			TesterThread testerThread = new TesterThread(resource);
			testerThread.start();
			
			service.execute(developer1);
			service.execute(developer2);
			service.execute(developer3);
			service.execute(developer4);
			
			try {
				testerThread.join();
			} catch (InterruptedException e) {}
			
			resource.iteration = resource.iteration + 1;
		}
	}
	
}
