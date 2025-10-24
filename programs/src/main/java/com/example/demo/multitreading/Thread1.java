package com.example.demo.multitreading;

public class Thread1 extends Thread{
	Resource r;
	public Thread1(Resource r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println(this.getClass().getName()+" started");
		try {
			System.out.println(this.getClass().getName()+" working on "+r.iteration);
			sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(this.getClass().getName()+" ended");
		r.workDone();
	}
	
}
