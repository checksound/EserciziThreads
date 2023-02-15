package esercizithread.interrupt;

public class RandomGeneratorApp {

	public static void main(String[] args) throws InterruptedException {
		
		RandomNumberGenerator rgT = new RandomNumberGenerator();
		rgT.start();
	
		// lo interrompo dopo 10 secondi
		
		Thread.sleep(10 * 1000);
		System.out.println("MANDO SEGNALE INTERRUZIONE AL THREAD!!!");
		rgT.interrupt();
		
		// aspetto che il thread termini
		rgT.join();
		System.out.println("APPLICAZIONE TERMINATA!!!");
	}

}
