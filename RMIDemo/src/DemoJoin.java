
public class DemoJoin {
   public DemoJoin() {
   }

   public static void main(String[] var0) {
      DemoAlive var1 = new DemoAlive("Thread a");
      DemoAlive var2 = new DemoAlive("Thread b");

      try {
         System.out.println("Wait for the child threads to finish.");
         var1.join();
         if (!var1.isAlive()) {
            System.out.println("Thread A not alive.");
         }

         var2.join();
         if (!var2.isAlive()) {
            System.out.println("Thread B not alive.");
         }
      } catch (Exception var4) {
      }

      System.out.println("Exit from Main Thread.");
   }
}

