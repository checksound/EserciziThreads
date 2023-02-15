package esercizithread.join;

public class Counter extends Thread {
	
	private static final int STEPS = 100;
	private final int startCounter;
	
	public Counter(int startCounter) {
		this.startCounter = startCounter;
	}
	
	@Override
	public void run() {
		for (int i = startCounter; i < startCounter + STEPS; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
