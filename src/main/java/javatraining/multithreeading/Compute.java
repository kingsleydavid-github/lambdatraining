package javatraining.multithreeading;

public class Compute implements Runnable {

	private Thread t; 
	private String tName;
	private Integer priority;
	
	
	public Compute(String tName) {
		this.tName = tName;
	}

	public Compute(String tName, Integer priority) {
		this.tName = tName;
		this.priority = priority;
	}

	@Override
	public void run() {
		System.out.println(t.getName() +" Thread Started.");
		try {
			for(int i = 0;i < 5; i++) {
				System.out.println(t.getName() +" Thread Processing...");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName() +" Thread Exited.");
	}

	public void start() {
		if ( t == null) {
			t =  new Thread(this, tName);
			if(priority != null) {
				t.setPriority(priority);
			}
		}
		t.start();
	}

	public void join() {
		if ( t != null) {
			try {
				t.join();
			}
			catch (InterruptedException ie) {
				System.err.println("Thread interrupted");
			}
			
		}
	}
}
