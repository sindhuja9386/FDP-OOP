

public class Racer extends Thread {
    private String name;
    private int steps;
    private long sleepMillis;

    public Racer(String name, int steps, long sleepMillis) {
        this.name = name;
        this.steps = steps;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {
        for (int i = 1; i <= steps; i++) {
            System.out.printf("%s: Step %d/%d%n", name, i, steps);
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                System.out.printf("%s was interrupted.%n", name);
                return;
            }
        }
        System.out.printf("%s has finished!%n", name);
    }
}