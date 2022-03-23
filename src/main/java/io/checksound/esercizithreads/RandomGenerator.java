package io.checksound.esercizithreads;

import java.util.Random;

public class RandomGenerator extends Thread {

	@Override
	public void run() {
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);

		try {

			while (true) {

				int randValue = random.nextInt(1000);
				System.out.println(randValue);

				Thread.sleep(400);

			}

		} catch (InterruptedException e) {
			System.out.println("Inviato INTERRUPT - USCITO DAL CICLO");
		}

	}

}
