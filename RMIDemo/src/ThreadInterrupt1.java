
public class ThreadInterrupt1 {
  public static void main(String args[]) throws Exception {
    Thread th1 = new Thread(new MyThread1(), "First Thread");
    Thread th2 = new Thread(new MyThread1(), "Second Thread");
    th1.setPriority(1);
    th1.start();
    Thread.sleep(1000);
    th1.interrupt();
    th2.start();
    Thread.sleep(1000);
    th2.interrupt();
  }
}
