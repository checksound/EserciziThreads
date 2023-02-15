# Esercizi Threads

Il thread contatore [esercizithread.join.Counter](./src/main/java/io/checksound/esercizithreads/Counter.java) e l'utilizzo in [esercizithread.join.CounterApp](./src/main/java/io/checksound/esercizithreads/CounterApp.java) e [esercizithread.join.CounterAppWithJoin](./src/main/java/io/checksound/esercizithreads/CounterAppWithJoin.java).  DA NOTARE LA DIFFERENZA DI COMPORTAMENTO TRA LE DUE APPLICAZIONI *CounterApp*  e *CounterAppWithJoin* riguardo all'utilizzo del metodo **join()**.

Visto esempio con utilizzo di **interrupt()** per inviare messaggio di interrupt, vedi: [esercizithread.interrupt.RandomNumberGenerator](./src/main/java/io/checksound/esercizithreads/RandomNumberGenerator.java), [esercizithread.interrupt.RandomGeneratorApp](./src/main/java/io/checksound/esercizithreads/RandomGeneratorApp.java): il metodo **interrupt()** viene invocato per stoppare il thread *RandomGenerator* dopo 10 secondi.

Vedi anche [esercizithread.interrupt.RandomGeneratorApp2](./src/main/java/io/checksound/esercizithreads/RandomGeneratorApp2.java) che da 
*standard input* prende i comandi di start e di stop del thread.

## Generatore di sentenze

[esercizithread.interrupt.RandomSentencesGeneratorApp](./src/main/java/io/checksound/esercizithreads/RandomSentencesGeneratorApp.java) che da 
standard input prende i comandi di start e di stop del thread [esercizithread.interrupt.RandomSentencesGenerator](./src/main/java/io/checksound/esercizithreads/RandomSentencesGenerator.java).

Utilizza la libreria [https://github.com/resourcepool/little-bob](https://github.com/resourcepool/little-bob)
