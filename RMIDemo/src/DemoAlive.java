
public class DemoAlive extends Thread {

    public DemoAlive(String name) {

        super(name);

        start(); // automatically start the thread upon creation

    }



    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println(getName() + " : " + i);

                Thread.sleep(500); // sleep for 0.5 seconds to visualize

            }

        } catch (InterruptedException e) {

            System.out.println(getName() + " interrupted.");

        }

        System.out.println(getName() + " exiting.");

    }

}
