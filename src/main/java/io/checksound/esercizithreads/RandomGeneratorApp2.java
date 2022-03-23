package io.checksound.esercizithreads;

import java.util.Scanner;
import static java.lang.System.out;

public class RandomGeneratorApp2 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in); 
		out.println("DIGITA UN TASTO 'S' PER FAR PARTIRE IL NUMBER GENARATOR e 'Q' per STOPPARLO");
		
		String input = in.next();
		
		while(!input.contentEquals("S")) {
			out.println("DIGITA UN TASTO 'S' PER FAR PARTIRE IL NUMBER GENARATOR e 'Q' per STOPPARLO");
			input = in.next();
		}
		
		RandomGenerator rgT = new RandomGenerator();
		rgT.start();
	
		// lo interrompo dopo 10 secondi
		
		input = in.next();
		
		while(!input.contentEquals("Q")) {
			out.println("DIGITA UN TASTO 'Q' per STOPPARLO");
			input = in.next();
		}
		
		System.out.println("MANDO SEGNALE INTERRUZIONE AL THREAD!!!");
		rgT.interrupt();
		
		// aspetto che il thread termini
		rgT.join();
		System.out.println("APPLICAZIONE TERMINATA!!!");
		
	}

}
