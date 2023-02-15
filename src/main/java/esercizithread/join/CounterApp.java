package esercizithread.join;

public class CounterApp {

	public static void main(String[] args) {
		Counter c1 = new Counter(0);
		Counter c2 = new Counter(100);
		
		c1.start();
		c2.start();
		
		System.out.println("SONO IN MAIN");
	}

}
