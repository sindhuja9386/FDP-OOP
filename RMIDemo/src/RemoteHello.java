

import java.rmi.*;

public interface RemoteHello extends Remote {
    String sayHello(String name) throws RemoteException;
}
