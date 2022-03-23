# Esercizi Threads

Il thread contatore [io.checksound.esercizithreads.Counter](./src/main/java/io/checksound/esercizithreads/Counter.java) e l'utilizzo in [io.checksound.esercizithreads.CounterApp](./src/main/java/io/checksound/esercizithreads/CounterApp.java) e [io.checksound.esercizithreads.CounterAppWithJoin](./src/main/java/io/checksound/esercizithreads/CounterAppWithJoin.java).  DA NOTARE LA DIFFERENZA DI COMPORTAMENTO TRA LE DUE APPLICAZIONI *CounterApp*  e *CounterAppWithJoin* riguardo all'utilizzo del metodo **join()**.

Visto esempio con utilizzo di **interrupt()** per inviare messaggio di interrupt, vedi: [io.checksound.esercizithreads.RandomGenerator](./src/main/java/io/checksound/esercizithreads/RandomGenerator.java), [io.checksound.esercizithreads.RandomGeneratorApp](./src/main/java/io/checksound/esercizithreads/RandomGeneratorApp.java): il metodo **interrupt()** viene invocato per stoppare il thread *RandomGenerator*.

Vedi anche [io.checksound.esercizithreads.RandomGeneratorApp2](./src/main/java/io/checksound/esercizithreads/RandomGeneratorApp2.java)