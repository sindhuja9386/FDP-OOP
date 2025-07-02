import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class HelloServer extends UnicastRemoteObject implements RemoteHello {
    public HelloServer() throws RemoteException {}

    public String sayHello(String name) {
        return "Hello, " + name + " from RMI Server!";
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);  // Start RMI registry within the program
            HelloServer obj = new HelloServer(); // Create remote object
            Naming.rebind("Hello", obj);         // Bind the object
            System.out.println("Server ready...");
            
        } catch (Exception e) {
            System.out.println("Server exception: " + e.toString());
        }
    }
}