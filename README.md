# Esercizi Threads

Il thread contatore [io.checksound.esercizithreads.Counter](./src/main/java/io/checksound/esercizithreads/Counter.java) e l'utilizzo in [io.checksound.esercizithreads.CounterApp](./src/main/java/io/checksound/esercizithreads/CounterApp.java) e [io.checksound.esercizithreads.CounterAppWithJoin](./src/main/java/io/checksound/esercizithreads/CounterAppWithJoin.java).  DA NOTARE LA DIFFERENZA DI COMPORTAMENTO TRA LE DUE APPLICAZIONI *CounterApp*  e *CounterAppWithJoin* riguardo all'utilizzo del metodo **join()**.

Visto esempio con utilizzo di **interrupt()** per inviare messaggio di interrupt, vedi: [io.checksound.esercizithreads.RandomNumberGenerator](./src/main/java/io/checksound/esercizithreads/RandomNumberGenerator.java), [io.checksound.esercizithreads.RandomGeneratorApp](./src/main/java/io/checksound/esercizithreads/RandomGeneratorApp.java): il metodo **interrupt()** viene invocato per stoppare il thread *RandomGenerator* dopo 10 secondi.

Vedi anche [io.checksound.esercizithreads.RandomGeneratorApp2](./src/main/java/io/checksound/esercizithreads/RandomGeneratorApp2.java) che da 
*standard input* prende i comandi di start e di stop del thread.

## Generatore di sentenze

[io.checksound.esercizithreads.RandomSentencesGeneratorApp](./src/main/java/io/checksound/esercizithreads/RandomSentencesGeneratorApp.java) che da 
standard input prende i comandi di start e di stop del thread [io.checksound.esercizithreads.RandomSentencesGenerator](./src/main/java/io/checksound/esercizithreads/RandomSentencesGenerator.java).

Utilizza la libreria [https://github.com/resourcepool/little-bob](https://github.com/resourcepool/little-bob)
