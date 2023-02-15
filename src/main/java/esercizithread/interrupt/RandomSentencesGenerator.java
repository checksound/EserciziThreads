package esercizithread.interrupt;

import java.util.List;
import java.util.Random;

import io.resourcepool.generator.FortuneGenerator;
import io.resourcepool.generator.Query;
import io.resourcepool.generator.impl.SimpleFortuneGenerator;
import io.resourcepool.model.Fortune;
import io.resourcepool.model.Language;

public class RandomSentencesGenerator extends Thread {

	@Override
	public void run() {
		
		int counter = 0;
		
		FortuneGenerator generator = new SimpleFortuneGenerator();
		
		// long seed = System.currentTimeMillis();
		// Random random = new Random(seed);
		
		List<Fortune> fortunes = generator.nextFortunes(
			      Query.builder()
			           .count(100)
			           .languages(Language.ENGLISH, Language.FRENCH)
			           .build()
			    );

		try {

			while (true) {
				
				if(fortunes.isEmpty()) {
					fortunes = generator.nextFortunes(
						      Query.builder()
						           .count(100)
						           .languages(Language.ENGLISH, Language.FRENCH)
						           .build()
						    );
				}
				
				Fortune f = fortunes.remove(0);
				//Fortune f = generator.nextFortune();
				
				// int randValue = random.nextInt(1000);
				System.out.println("***************************");
				System.out.println((++counter) + " >>> " + f.text);
				System.out.println("***************************");
				System.out.println("");
				Thread.sleep(800);

			}

		} catch (InterruptedException e) {
			System.out.println("Inviato INTERRUPT - USCITO DAL CICLO");
		}

	}

}
