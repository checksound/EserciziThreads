package io.checksound.esercizithreads;

public class RandomGeneratorApp {

	public static void main(String[] args) throws InterruptedException {
		
		RandomGenerator rgT = new RandomGenerator();
		rgT.start();
	
		// lo interrompo dopo 10 secondi
		
		Thread.sleep(10 * 1000);
		System.out.println("MANDO SEGNALE INTERRUZIONE AL THREAD!!!");
		rgT.interrupt();
		
	}

}
