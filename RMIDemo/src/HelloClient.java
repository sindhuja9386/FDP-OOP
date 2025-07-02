
import java.rmi.*;
import java.io.*;
import java.util.Scanner;

public class HelloClient {
    public static void main(String[] args) {
        try {
            RemoteHello stub = (RemoteHello) Naming.lookup("rmi://localhost/Hello");
            System.out.println(stub.sayHello("Client 1"));
            System.out.println("ADDITION");
            int c;
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Please enter an integer:");
            int userInteger1 = inputScanner.nextInt();
            System.out.println("Please enter an integer:");
            int userInteger2 = inputScanner.nextInt();
            c=userInteger1+userInteger2;
            System.out.println( "Addition of two numbers is "+c);
            inputScanner.close();
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
        }
    }
}
