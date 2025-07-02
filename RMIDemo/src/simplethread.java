
class MyThread1 extends Thread {

  public void run() {
    try {
      Thread.sleep(40000);
    } catch (Exception exc) {
      System.out.println(Thread.currentThread().getName()
          + " is interrupted.");
    }
    System.out.println(Thread.currentThread().getName() + " is exiting.");
  }
}
