
public class RaceSimulation {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== TC1: Two threads start together ===");
        Racer r1 = new Racer("Runner-A", 5, 500);
        Racer r2 = new Racer("Runner-B", 5, 500);
        r1.start();
        r2.start();
        r1.join(); r2.join();

        System.out.println("\n=== TC2: Different sleep times (B faster) ===");
        r1 = new Racer("Runner-A", 5, 700);
        r2 = new Racer("Runner-B", 5, 300);
        r1.start();
        r2.start();
        r1.join(); r2.join();

        System.out.println("\n=== TC3: Output non-deterministic order ===");
        r1 = new Racer("Runner-A", 5, 400);
        r2 = new Racer("Runner-B", 5, 450);
        r1.start();
        r2.start();
        r1.join(); r2.join();

        System.out.println("\n=== TC4: Three-thread race ===");
        Racer r3 = new Racer("Runner-C", 5, 500);
        r1 = new Racer("Runner-A", 5, 500);
        r2 = new Racer("Runner-B", 5, 500);
        r1.start();
        r2.start();
        r3.start();
        r1.join(); r2.join(); r3.join();

        System.out.println("\n=== TC5: Same sleep times, interleaved output ===");
        r1 = new Racer("Runner-A", 5, 500);
        r2 = new Racer("Runner-B", 5, 500);
        r1.start();
        r2.start();
        r1.join(); r2.join();
    }
}