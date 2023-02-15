package esercizithread.join;

public class CounterAppWithJoin {

	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter(0);
		Counter c2 = new Counter(100);
		
		c1.start();
		c2.start();
		
		c1.join();
		c2.join();
		
		System.out.println("SONO A FINE MAIN");
	}

}
